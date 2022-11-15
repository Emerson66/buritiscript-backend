package br.com.buritiscript.buritiscriptbackend.controller.dto.Response;

import java.util.ArrayList;
import java.util.List;

import br.com.buritiscript.buritiscriptbackend.domain.model.User;
import br.com.buritiscript.buritiscriptbackend.repository.UserRepository;
import lombok.Getter;

@Getter
public class UserListResponse {

    private String username;
    private String name;
    private char sexo;
    private String email;
    private String website;
    private String github;

    public UserListResponse(User user) {
        this.username = user.getUsername();
        this.name = user.getName();
        this.sexo = user.getSexo();
        this.email = user.getEmail();
        this.website = user.getWebsite();
        this.github = user.getGithub();
    }
    
    @Deprecated
    public UserListResponse() {
    }


    public static List<UserListResponse> userListConvertToModel(UserRepository userRepository){
        List<User> users = new ArrayList<>();
        List<UserListResponse> userResponse = new ArrayList<>();
        users = userRepository.findAll();
        for (User user : users) {
            UserListResponse response = new UserListResponse(user);
            userResponse.add(response);
        }
        return userResponse;
    }
}
