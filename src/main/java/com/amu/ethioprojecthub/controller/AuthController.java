package com.amu.ethioprojecthub.controller;

import com.amu.ethioprojecthub.model.User;
import com.amu.ethioprojecthub.service.AppConfig;
import com.amu.ethioprojecthub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;
import java.util.Map;

@Controller
public class AuthController {
    private UserService userService;
    private PasswordEncoder passwordEncoder;
    private AppConfig appConfig;

    @Autowired
    public AuthController() throws SQLException {
        appConfig = new AppConfig();
        this.userService = new UserService();
        this.passwordEncoder = appConfig.passwordEncoder();
    }


    @PostMapping("/login")
    public User login(@ModelAttribute("user") User user) {
        if(user.getEmail().equals("") || user.getPassword().equals("")){
            return null;
        };
        User existingUser = userService.findByEmail(user.getEmail());

        if (existingUser != null && passwordEncoder.matches(user.getPassword(), existingUser.getPassword())) {
            return existingUser;
        } else {
            return null;
        }
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public User register(@ModelAttribute("user") User user) {
        String userPassword = user.getPassword();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.register(user);

        try {
            user.setPassword(userPassword);
            return login(user);
        } catch (Exception e){

        }
        return null;
    }

}
