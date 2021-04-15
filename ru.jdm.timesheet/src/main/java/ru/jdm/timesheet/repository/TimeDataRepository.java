package ru.jdm.timesheet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.jdm.timesheet.entity.TimeData;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@Repository
public interface TimeDataRepository extends CrudRepository<TimeData, Long> {
  TimeData findByUserIdAndDate(Long userId, LocalDate date);
}
