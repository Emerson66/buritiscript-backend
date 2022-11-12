package br.com.buritiscript.buritiscriptbackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.buritiscript.buritiscriptbackend.controller.dto.UserForm;
import br.com.buritiscript.buritiscriptbackend.domain.model.User;

@RestController
@RequestMapping("/v1/users")
public class UserController {
    
    @PostMapping
    public ResponseEntity<User> register(@RequestBody UserForm userform){
        
        return null;
    }
}
