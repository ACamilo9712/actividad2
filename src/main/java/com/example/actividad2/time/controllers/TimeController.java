package com.example.actividad2.time.controllers;

import com.example.actividad2.time.domain.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping
public class TimeController {


    @GetMapping("/info")
    public HourPerDay getInfoHour() {
        LocalDateTime now = LocalDateTime.now();
        Hour hour = Hour.of(now.getHour());
        Minute minute = Minute.of(now.getMinute());
        Second second = Second.of(now.getSecond());

       Long hora = TimeUnit.fromHour(TimeUnit.HOURS,now.toLocalTime());
       Long minuto= TimeUnit.fromHour(TimeUnit.MINUTES,now.toLocalTime());
       Long segundos = TimeUnit.fromHour(TimeUnit.SECONDS,now.toLocalTime());
       Long milisegundos = TimeUnit.fromHour(TimeUnit.MILLISECONDS,now.toLocalTime());
        return HourPerDay.from(hour, minute, second, minuto.intValue());

    }
}
