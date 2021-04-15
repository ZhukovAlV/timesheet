package ru.jdm.timesheet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Root app controller
 *
 */
@Controller
public class AppController
{
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
