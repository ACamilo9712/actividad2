package com.example.actividad2.time.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class DayTime {
    Hour hour;
    Minute minute;
    Second second;
}
