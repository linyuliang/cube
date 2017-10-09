package com.lyl.cube;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebSampleApplication {
  protected final static Logger logger = LoggerFactory.getLogger(WebSampleApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(WebSampleApplication.class, args);
    logger.info("cube web sample application is sussess!");
  }
}