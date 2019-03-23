package com.example.jmxtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jmxtest.jmx.JmxConfiguration;

@RestController
public class TestController {

  @Autowired
  private JmxConfiguration jmxConfiguration;

  @GetMapping("/jmx-test")
  public String getAppMode() {
    return jmxConfiguration.isProd() ? "production mode" : "dev mode";
  }
}
