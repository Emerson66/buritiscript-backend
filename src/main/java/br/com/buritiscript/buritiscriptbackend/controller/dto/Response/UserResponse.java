package br.com.buritiscript.buritiscriptbackend.controller.dto.Response;

import br.com.buritiscript.buritiscriptbackend.repository.UserRepository;
import lombok.Getter;

@Getter
public class UserResponse {
    private String username;
    private String name;
    private String about;
    private String email;
    private String website;
    private String github;
    private String telegram;
    private String twitter;
    private String instagram;
    private String linkedin;
    

    

    public UserResponse(String username, String name, String about, String email, String website, String github,
            String telegram, String twitter, String instagram, String linkedin) {
        this.username = username;
        this.name = name;
        this.about = about;
        this.email = email;
        this.website = website;
        this.github = github;
        this.telegram = telegram;
        this.twitter = twitter;
        this.instagram = instagram;
        this.linkedin = linkedin;
    }

    @Deprecated
    public UserResponse() {}

    public UserResponse convertToModel(UserRepository userRepository, String username){

        

        return null;
    }
}
