package com.allstate.controllers;

import com.allstate.models.Math;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by localadmin on 11/01/17.
 */
@RestController
public class MathController {
    @RequestMapping(value = "/math/square/{x}")
    public Map<String,Integer> square(@PathVariable int x){
        int result = Math.square(x);
        Map<String, Integer> map =new HashMap<>();
        map.put("square", result);
        return map;
    }

    @RequestMapping(value = "/math/factorial/{x}")
    public Map<String,Integer> factorial(@PathVariable int x){
        int result = Math.factorial(x);
        Map<String, Integer> map =new HashMap<>();
        map.put("original", x);
        map.put("factorial", result);
        return map;
    }

    @RequestMapping(value = "/math/fibonacci/{x}")
    public Map<String,Integer> fibonacci(@PathVariable int x){
        int result = Math.fibonacci(x);
        Map<String, Integer> map =new HashMap<>();
        map.put("n", x);
        map.put("fibonacci", result);
        return map;
    }

}
