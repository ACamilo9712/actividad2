package com.example.actividad2.serialization;
import java.lang.reflect.Type;

import com.example.actividad2.time.domain.Hour;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class HourAdapter implements JsonDeserializer<Hour>, JsonSerializer<Hour> {

    @Override
    public JsonElement serialize(Hour src, Type typeOfSrc, JsonSerializationContext context) {
        Integer value = src.getValue();
        return new JsonPrimitive(value);
    }

    @Override
    public Hour deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
        Integer value = json.getAsInt();
        return Hour.of(value);
    }

}


