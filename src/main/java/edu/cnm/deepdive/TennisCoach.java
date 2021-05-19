package edu.cnm.deepdive;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements edu.cnm.deepdive.Coach {

  @Override
  public String getDailyWorkout() {
    return "hit them balls";
  }
}
