package com.example.actividad2.repositories;

import com.example.actividad2.time.domain.DayTime;
import com.example.actividad2.time.domain.Hour;
import com.example.actividad2.time.domain.Minute;
import com.example.actividad2.time.domain.Second;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Qualifier("in-memory")
public interface DayTimeRepository {
    DayTime insertOne(Hour hour, Minute minute, Second second);

    ArrayList findAll();
}
