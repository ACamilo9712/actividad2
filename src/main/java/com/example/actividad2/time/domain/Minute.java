package com.example.actividad2.time.domain;

import com.example.actividad2.common.Precondicions;
import com.example.actividad2.serialization.IntegerSerializable;
import lombok.Value;

@Value(staticConstructor = "of")
public class Minute implements IntegerSerializable {

      Integer value;

    private Minute (Integer value){
        Precondicions.checkNotNull(value);
        Precondicions.rangeMinSec(value);
        this.value = value;
    }


    @Override
    public Integer valueOf() {
        return value;
    }
}
