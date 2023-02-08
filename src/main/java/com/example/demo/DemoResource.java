package com.example.demo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/test")
public class DemoResource {
  private final DemoService demoService;

  public DemoResource(DemoService demoService) {
    this.demoService = demoService;
  }

  @GET
  @Path("/hello")
  public String getHello() {
    return demoService.getHello();
  }
}
