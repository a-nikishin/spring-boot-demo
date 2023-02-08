package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class DemoDao {
  public String getName() {
    return "Andrey";
  }
}
