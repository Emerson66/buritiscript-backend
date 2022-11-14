package br.com.buritiscript.buritiscriptbackend.controller;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.buritiscript.buritiscriptbackend.controller.dto.Form.UserForm;
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

    public List<User> list() {
        
        return list();
    }
}
