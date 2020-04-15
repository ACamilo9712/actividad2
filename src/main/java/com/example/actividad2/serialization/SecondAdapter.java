package com.example.actividad2.serialization;

import com.example.actividad2.time.domain.Minute;
import com.example.actividad2.time.domain.Second;
import com.google.gson.*;

import java.lang.reflect.Type;

public class SecondAdapter implements JsonDeserializer<Second>, JsonSerializer<Second> {

    @Override
    public Second deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Integer value = json.getAsInt();
        return Second.of(value);
    }

    @Override
    public JsonElement serialize(Second second, Type type, JsonSerializationContext jsonSerializationContext) {
        Integer value = second.getValue();
        return new JsonPrimitive(value);
    }
}
