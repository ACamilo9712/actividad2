package com.example.actividad2.Configuration;

import com.example.actividad2.serialization.HourAdapter;
import com.example.actividad2.serialization.MinuteAdapter;
import com.example.actividad2.serialization.SecondAdapter;
import com.example.actividad2.time.domain.Hour;
import com.example.actividad2.time.domain.Minute;
import com.example.actividad2.time.domain.Second;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GsonConfiguration {

    @Bean
    public Gson gson(){
        return new GsonBuilder()
                .registerTypeAdapter(Hour.class, new HourAdapter())
                .registerTypeAdapter(Minute.class, new MinuteAdapter())
                .registerTypeAdapter(Second.class, new SecondAdapter())
                .create();
    }
}
