package com.example.actividad2.time.domain;

import lombok.Value;

@Value
public class HourPerDay {
    Hour hour;
    Minute minute;
    Second second;
    Integer horaDeldia;

    public static HourPerDay from(Hour hour, Minute minute, Second second, Integer horaDeldia) {
        return new HourPerDay(hour,minute, second, horaDeldia);
    }
}
