package com.evakule.controller;

import com.evakule.model.Event;
import com.evakule.model.User;
import com.evakule.model.UserToEvent;
import com.evakule.service.EventService;
import com.evakule.service.UserService;
import com.evakule.service.UserToEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;
import java.util.Set;

@Controller
public class EventController {

    @Autowired
    private UserToEventService userToEventService;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView main() {
        List<UserToEvent> userList = userToEventService.getAll()
                .orElseGet(Collections::emptyList);

        ModelAndView mw = new ModelAndView();
        mw.addObject("list", userList);
        mw.setViewName("main");
        return mw;
    }

    @RequestMapping(value = "/edit-event", method = RequestMethod.GET)
    public ModelAndView showUserEvents(@RequestParam ("u_id") Long id) {
        User user = userService.getById(id).orElseGet(User::new);
        Set<Event> eventList = user.getEvents();

        ModelAndView mw = new ModelAndView();
        mw.addObject("user", user);
        mw.addObject("eventList", eventList);
        mw.setViewName("edit-event");
        return mw;
    }
}