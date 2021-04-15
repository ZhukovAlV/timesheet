package ru.jdm.timesheet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.jdm.timesheet.entity.User;
import ru.jdm.timesheet.repository.UserRepository;

import java.util.Collection;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("")
    public ModelAndView user(@RequestParam(value = "userId", required = false) Long userId) {
        User user = userRepository.findById(userId).get();

        ModelAndView mv = new ModelAndView();
        mv.addObject("user", user);
        mv.setViewName("user/form");

        return mv;
    }

    @GetMapping("/list")
    public ModelAndView users() {
        Collection<User> users = (Collection<User>) userRepository.findAll();

        ModelAndView mv = new ModelAndView();
        mv.addObject("users", users);
        mv.setViewName("user/list");

        return mv;
    }

    @PostMapping("/save")
    public ModelAndView saveUser(@ModelAttribute("user")User user) {
        userRepository.save(user);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", user);
        mv.setViewName("user/form");

        return mv;
    }
}
