package com.example.actividad2.time.controllers;

import com.example.actividad2.services.TimeService;
import com.example.actividad2.time.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/times")
@RequiredArgsConstructor
public class TimeController {

    private final TimeService timeService;

    @PostMapping
    public DayTime insertOne(@RequestBody DayTime timeBody){
        return timeService.inertOne(timeBody.getHour(),timeBody.getMinute(),timeBody.getSecond());
    }

    @GetMapping
    public ArrayList<DayTime> findAll(){
        return timeService.findAll();
    }

    /*@GetMapping("/info")
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
    }*/



}
