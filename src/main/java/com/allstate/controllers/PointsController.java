package com.allstate.controllers;

import com.allstate.models.Point;
import com.allstate.models.Triangle;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PointsController {
    @RequestMapping(value = "/points/distance", method = RequestMethod.POST)
    public Map<String, Double> distance(@RequestBody List<Point> point){

        double result = Point.distance(point.get(0), point.get(1));
        Map<String, Double> map = new HashMap<>();
        map.put("Distance" , result);
        return map;
    }

    @RequestMapping(value = "/points/slope", method = RequestMethod.POST)
    public Map<String, Double> slope(@RequestBody List<Point> point){

        double result = Point.slope(point.get(0), point.get(1));
        Map<String, Double> map = new HashMap<>();
        map.put("slope" , result);
        return map;
    }


    @RequestMapping(value = "/points/yintercept", method = RequestMethod.POST)
    public Map<String, Double> yIntercept(@RequestBody List<Point> point){

        double result = Point.yintercept(point.get(0), point.get(1));
        Map<String, Double> map = new HashMap<>();
        map.put("yIntercept" , result);
        return map;
    }
}
