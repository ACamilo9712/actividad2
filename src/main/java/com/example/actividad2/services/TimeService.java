package com.example.actividad2.services;

import com.example.actividad2.repositories.DayTimeRepository;
import com.example.actividad2.time.domain.DayTime;
import com.example.actividad2.time.domain.Hour;
import com.example.actividad2.time.domain.Minute;
import com.example.actividad2.time.domain.Second;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

//La anotación service hace referencia a la lógica del negocio
@Service
public class TimeService {

    private final DayTimeRepository repository;

    @Autowired
    public TimeService(DayTimeRepository repository) {
        this.repository = repository;
    }

    public DayTime inertOne(Hour hour, Minute minute, Second second){
        return repository.insertOne(hour,minute, second);
    }

    public ArrayList<DayTime> findAll(){
        return repository.findAll();
    }
}
