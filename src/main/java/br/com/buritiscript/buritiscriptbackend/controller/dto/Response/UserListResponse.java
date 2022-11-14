package br.com.buritiscript.buritiscriptbackend.controller.dto.Response;

import java.util.ArrayList;
import java.util.List;

import br.com.buritiscript.buritiscriptbackend.domain.model.User;
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


    public List<UserListResponse> userListConvertToModel(List<User> users){
        List<UserListResponse> userResponse = new ArrayList<>();
        for (User user : users) {
            UserListResponse response = new UserListResponse(user);
            userResponse.add(response);
        }
        return userResponse;
    }
}
