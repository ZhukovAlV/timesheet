package ru.jdm.timesheet.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Data
@Entity
@Table(name = "USER")
public class User {
  @Id
  @Column(name = "ID")
  private Long userId;
  @Column(name = "LOGIN")
  private String login;
  @Column(name = "NAME")
  private String name;
  @Column(name = "SURNAME")
  private String surname;
}
