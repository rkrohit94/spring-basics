package com.allstate.controllers;

import com.allstate.models.Triangle;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by localadmin on 11/01/17.
 */
@RestController
public class TriangleController {
    @RequestMapping(value = "/triangle/area", method = RequestMethod.POST)
    public Map<String, Integer> area(@RequestBody List<Triangle> triangles){
        int result = Triangle.area(triangles);
        Map<String, Integer> map = new HashMap<>();
        map.put("area" , result);
        return map;

    }
}
