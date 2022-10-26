package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsersController {

    private UserService userService;


    @Autowired
    public void setUserDao(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/users")
    public String hello(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        model.addAttribute("messages", userService.listUsers());
        return "users";
    }
}
