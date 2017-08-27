package com.lyl.cube.oauth.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OauthServerApplication {

  protected final static Logger logger = LoggerFactory.getLogger(OauthServerApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(OauthServerApplication.class, args);
    logger.info("cube oauth server application is sussess!");
  }
}
