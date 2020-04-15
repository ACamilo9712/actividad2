package com.example.actividad2.time.domain;

import com.example.actividad2.common.Precondicions;
import lombok.Data;
import lombok.Value;

@Value(staticConstructor = "of")
public class Second {

    private final Integer value;

    private Second (Integer value){
        Precondicions.checkNotNull(value);
        Precondicions.rangeMinSec(value);
        this.value = value;
    }

}
