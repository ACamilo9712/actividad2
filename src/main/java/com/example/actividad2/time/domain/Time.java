package com.example.actividad2.time.domain;

import com.example.actividad2.common.Precondicions;

import lombok.Value;

import java.util.regex.Pattern;

@Value(staticConstructor = "of")
public class Time {
 String timeUnit;

 private final Pattern pattern = Pattern.compile("");


  public Time(String timeUnit){
   Precondicions.checkNotNull(timeUnit);
   this.timeUnit = timeUnit;
  }

}
