package com.evakule.controller;

import com.evakule.model.User;
import com.evakule.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ModelAndView getAll() {
        return userListPage();
    }

    @RequestMapping(value = "/add-user", method = RequestMethod.GET)
    public ModelAndView addUser(ModelAndView mw) {
        mw.addObject("user", new User());
        mw.setViewName("add-user");
        return mw;
    }

    @RequestMapping(value = "/add-user", method = RequestMethod.POST)
    public ModelAndView addUser(@ModelAttribute User user) {
        userService.create(user);
        return userListPage();
    }

    @RequestMapping(value = "/delete-user", method = RequestMethod.GET)
    public ModelAndView deleteUser(@RequestParam("u_id") Long id) {
        userService.delete(id);
        return userListPage();
    }

    @RequestMapping(value = "/edit-user", method = RequestMethod.POST)
    public ModelAndView editUser(@ModelAttribute User user) {
        userService.edit(user);
        return userListPage();
    }

    @RequestMapping(value = "/edit-user", method = RequestMethod.GET)
    public ModelAndView editUser(@RequestParam("u_id") Long id) {
        User user = userService.getById(id)
                .orElseGet(User::new);

        ModelAndView mw = new ModelAndView();
        mw.addObject("user", user);
        mw.setViewName("edit-user");
        return mw;
    }

    private ModelAndView userListPage() {
        List<User> userList = userService.getAll()
                .orElseGet(Collections::emptyList);

        ModelAndView mw = new ModelAndView();
        mw.addObject("userList", userList);
        mw.setViewName("users");
        return mw;
    }
}