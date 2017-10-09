package com.lyl.cube.generator;

import static java.lang.System.exit;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by linyu on 2017/9/1.
 */
@SpringBootApplication
public class GeneratorApplication implements CommandLineRunner {

  public static void main(String args[]) {
    SpringApplication.run(GeneratorApplication.class, args);
  }

  @Autowired
  private AutoGenerator autoGenerator;

  @Override
  public void run(String... strings) throws Exception {
    try {
      autoGenerator.execute();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      exit(0);
    }
  }
}
