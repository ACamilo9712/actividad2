package com.example.actividad2.time.domain;

import com.example.actividad2.common.Precondicions;
import com.example.actividad2.serialization.IntegerSerializable;
import com.google.gson.internal.$Gson$Preconditions;
import lombok.Data;
import lombok.Value;

@Value(staticConstructor = "of")
public class Hour implements IntegerSerializable {

    private final Integer value;


    private Hour (Integer value){
        Precondicions.checkNotNull(value);
        Precondicions.range(value);
        this.value = value;
    }

    @Override
    public Integer valueOf() {
        return value;
    }
}
