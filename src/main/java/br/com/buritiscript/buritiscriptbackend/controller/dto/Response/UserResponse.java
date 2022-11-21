package br.com.buritiscript.buritiscriptbackend.controller.dto.Response;

import java.util.Optional;

import br.com.buritiscript.buritiscriptbackend.domain.model.User;
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
    

    

    public UserResponse(User user) {
        this.username = user.getUsername();
        this.name = user.getName();
        this.about = user.getAbout();
        this.email = user.getEmail();
        this.website = user.getWebsite();
        this.github = user.getGithub();
        this.telegram = user.getTelegram();
        this.twitter = user.getTwitter();
        this.instagram = user.getInstagram();
        this.linkedin = user.getLinkedin();
    }

    @Deprecated
    public UserResponse() {}

}
