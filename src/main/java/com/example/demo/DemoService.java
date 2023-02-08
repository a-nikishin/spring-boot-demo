package com.example.demo;

import jakarta.inject.Inject;

public class DemoService {
  private final DemoDao demoDao;
  private DemoService self;

  @Inject
  public DemoService(DemoDao demoDao) {
    this.demoDao = demoDao;
  }

  public String test() {
    return self.getHello();
  }

  public String getHello() {
    return "Hello, " + demoDao.getName();
  }
}
