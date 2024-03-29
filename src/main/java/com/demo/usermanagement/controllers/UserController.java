package com.demo.usermanagement.controllers;

import com.demo.usermanagement.domain.User;
import com.demo.usermanagement.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("users", userService.listAllUsers());
        return "users";
    }

    @RequestMapping("user/{id}")
    public String showUser(@PathVariable Integer id, Model model){
        model.addAttribute("user", userService.getUserById(id));
        return "usershow";
    }

    @RequestMapping("user/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("user", userService.getUserById(id));
        return "userform";
    }

    @RequestMapping("user/new")
    public String newUser(Model model){
        model.addAttribute("user", new User());
        return "userform";
    }

    @RequestMapping(value = "user", method = RequestMethod.POST)
    public String saveUser(User user){
        userService.saveUser(user);
        return "redirect:/user/" + user.getId();
    }

}
