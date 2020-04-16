package com.example.actividad2.repositories;

import com.example.actividad2.time.domain.DayTime;
import com.example.actividad2.time.domain.Hour;
import com.example.actividad2.time.domain.Minute;
import com.example.actividad2.time.domain.Second;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Repository
public class MapDayTimeRepository implements DayTimeRepository {

    private final ArrayList array = new ArrayList();

    @Override
    public DayTime insertOne(Hour hour, Minute minute, Second second) {
        DayTime dayTime= DayTime.of(hour, minute, second);
        array.add(dayTime);
        return dayTime;
    }

    @Override
    public ArrayList findAll() {
        return array;
    }
}
