package com.example.actividad2.serialization;

import com.example.actividad2.time.domain.Hour;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;

public interface GsonAdapter<T> extends JsonDeserializer<T> ,JsonSerializer<T> {
}
