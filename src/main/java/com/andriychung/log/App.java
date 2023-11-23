package com.andriychung.log;

import lombok.extern.slf4j.Slf4j;

import java.time.Instant;
import java.util.Random;

/**
 * Hello world!
 */
@Slf4j
public class App {
  public static void main(String[] args) throws Exception {
//    ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy p;
//        System.out.println( "Hello World!" );
    log.info("Hello Log World!");
    Random random = new Random(Instant.now().getEpochSecond());
    for (int j = 0; j < 10; j++) {
      for (int i = 0; i < 1000; i++) {
        log.info("Generated random number: {}", random.nextInt());
      }
//      Thread.sleep(500);
    }
  }
}
