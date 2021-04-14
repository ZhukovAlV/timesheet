package ru.jdm.timesheet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.jdm.timesheet.entity.User;
import ru.jdm.timesheet.repository.UserRepository;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Root app controller
 *
 */
@Controller
public class AppController
{
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/user")
    public ModelAndView user(@RequestParam(value = "userId", required = false) Long userId) {
        User user = userRepository.findById(userId).get();

        ModelAndView mv = new ModelAndView();
        mv.addObject("user", user);
        mv.setViewName("user/form");

        return mv;
    }

    @RequestMapping("/user/list")
    public ModelAndView users() {
        Collection<User> users = (Collection<User>) userRepository.findAll();

        ModelAndView mv = new ModelAndView();
        mv.addObject("users", users);
        mv.setViewName("user/list");

        return mv;
    }

    /*   @PostMapping(value = "/save")
       public ModelAndView saveUser(@RequestBody User user) {
           userRepository.save(user);
           ModelAndView mv = new ModelAndView();
           mv.addObject("user", user);
           mv.setViewName("user/form");

           return mv;
       }*/
    @PostMapping("/save")
    public ModelAndView saveUser(@ModelAttribute("user")User user) {
        userRepository.save(user);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", user);
        mv.setViewName("user/form");

        return mv;
    }
}
