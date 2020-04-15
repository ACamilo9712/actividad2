package com.example.actividad2.time.domain;

import com.example.actividad2.common.Precondicions;
import lombok.Data;
import lombok.Value;

@Value(staticConstructor = "of")
public class Hour {

    private final Integer value;

    private Hour (Integer value){
        Precondicions.checkNotNull(value);
        Precondicions.range(value);
        this.value = value;
    }

}
