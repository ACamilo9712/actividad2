package com.example.actividad2.serialization;


import com.example.actividad2.time.domain.Hour;
import com.example.actividad2.time.domain.Minute;
import com.google.gson.*;

import java.lang.reflect.Type;

public class MinuteAdapter implements JsonDeserializer<Minute>, JsonSerializer<Minute> {
    @Override
    public Minute deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Integer value = json.getAsInt();
        return Minute.of(value);
    }

    @Override
    public JsonElement serialize(Minute minute, Type type, JsonSerializationContext jsonSerializationContext) {
        Integer value = minute.getValue();
        return new JsonPrimitive(value);
    }
}
