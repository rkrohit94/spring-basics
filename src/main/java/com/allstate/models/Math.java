package com.allstate.models;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by localadmin on 11/01/17.
 */
public class Math {
    private int square;

    public static int square(int num){
        return num*num;
    }
    public static int factorial(int num){
        //return IntStream.rangeClosed(1, num).reduce(1, (x, y) -> x * y);
        return Stream.iterate(1, x -> x+1).limit(num).reduce((previous, current) -> current * previous).get();

    }

    public static int fibonacci(int num){
        if(num == 0)
            return 0;
        if(num == 1)
            return 1;
        return fibonacci(num-1)+fibonacci(num-2);

    }
}
