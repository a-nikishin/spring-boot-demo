package com.example.demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
    DemoService.class
})
public class DemoConfig {
  @Bean
  public DemoResource demoResource(DemoService demoService) {
    return new DemoResource(demoService);
  }

  @Bean
  public ResourceConfig jerseyConfig() {
    ResourceConfig config = new ResourceConfig();
    config.register(DemoResource.class);
    return config;
  }
}
