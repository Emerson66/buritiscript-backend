package br.com.buritiscript.buritiscriptbackend.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.buritiscript.buritiscriptbackend.controller.dto.Form.UserForm;
import br.com.buritiscript.buritiscriptbackend.controller.dto.Response.UserListResponse;
import br.com.buritiscript.buritiscriptbackend.controller.dto.Response.UserResponse;
import br.com.buritiscript.buritiscriptbackend.domain.model.User;
import br.com.buritiscript.buritiscriptbackend.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<User> register(@RequestBody @Valid UserForm userform) {
        User user = userform.userConverterToModel();
        userRepository.save(user);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public List<UserListResponse> list() {
        return UserListResponse.userListConvertToModel(userRepository);
    }

    @GetMapping("/{username}")
    public ResponseEntity<UserResponse> getUser(@PathVariable String username) {
        Optional<User> user = userRepository.findByUsername(username);
        if (user.isPresent()) {
            return ResponseEntity.ok().body(new UserResponse(user.get()));
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    public ResponseEntity<Void> delete() {
        return ResponseEntity.noContent().build();
    }
}
