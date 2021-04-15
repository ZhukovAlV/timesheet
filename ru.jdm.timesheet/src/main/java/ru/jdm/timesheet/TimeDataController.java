package ru.jdm.timesheet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.jdm.timesheet.entity.TimeData;
import ru.jdm.timesheet.repository.TimeDataRepository;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
* Controller for time data operations
*/
@RequestMapping("/timedata")
@Controller
public class TimeDataController {

  @Autowired
  TimeDataRepository timeDataRepository;

  @GetMapping("")
  public ModelAndView timeData(@RequestParam(value = "userId") Long userId,
             @RequestParam(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date) {
    TimeData timeData = timeDataRepository.findByUserIdAndDate(userId, date);

    ModelAndView mv = new ModelAndView();
    mv.addObject("timeData", timeData);
    mv.setViewName("timedata/form");

    return mv;
  }

/*
  @GetMapping("")
  public ModelAndView timeData(@RequestParam(value = "id") Long id) {
    TimeData timeData = timeDataRepository.findById(id).get();

    ModelAndView mv = new ModelAndView();
    mv.addObject("timeData", timeData);
    mv.setViewName("timedata/form");

    return mv;
  }
*/

  @PostMapping("/save")
  public ModelAndView save(@ModelAttribute("timeData") TimeData timeData) {
    timeDataRepository.save(timeData);

    ModelAndView mv = new ModelAndView();
    mv.addObject("timeData", timeData);
    mv.setViewName("timedata/form");

    return mv;
  }
}
