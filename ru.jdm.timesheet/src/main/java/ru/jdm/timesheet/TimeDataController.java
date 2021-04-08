package ru.jdm.timesheet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.jdm.timesheet.entity.TimeData;
import ru.jdm.timesheet.repository.TimeDataRepository;

import java.time.LocalDate;

/**
* Controller for time data operations
*/
@Controller
public class TimeDataController {

  @Autowired
  TimeDataRepository timeDataRepository;

  @RequestMapping("/timedata")
  public ModelAndView timeData(@RequestParam(value = "userId") Long userId,
             @RequestParam(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date) {
    TimeData timeData = timeDataRepository.findByUserIdAndDate(userId, date);

    ModelAndView mv = new ModelAndView();
    mv.addObject("timeData", timeData);
    mv.setViewName("timedata/form");

    return mv;
  }
}
