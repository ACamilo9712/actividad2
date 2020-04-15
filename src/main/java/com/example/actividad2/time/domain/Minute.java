package com.example.actividad2.time.domain;

import com.example.actividad2.common.Precondicions;
import lombok.Value;

@Value(staticConstructor = "of")
public class Minute {

      Integer value;

    private Minute (Integer value){
        Precondicions.checkNotNull(value);
        Precondicions.rangeMinSec(value);
        this.value = value;
    }
}
