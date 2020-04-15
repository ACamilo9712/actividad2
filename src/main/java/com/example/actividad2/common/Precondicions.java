package com.example.actividad2.common;

import java.util.Objects;

public class Precondicions {

    public static void checkNotNull(Object reference){
        if(Objects.isNull(reference)){
            throw new NullPointerException();
        }
    }

    public static void range(int n){
        if(n<0 || n>=24){
            throw new NumberFormatException();
        }
    }

    public static void rangeMinSec(int n){
        if(n<0 || n>=59){
            throw new NumberFormatException();
        }
    }
}
