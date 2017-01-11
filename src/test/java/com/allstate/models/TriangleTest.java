package com.allstate.models;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 11/01/17.
 */
public class TriangleTest {
    @Test
    public void area() throws Exception {
        Triangle t1 = new Triangle(3,4);
        Triangle t2 = new Triangle(5,6);

        List<Triangle> triangles = new ArrayList<>();
        triangles.add(t1);
        triangles.add(t2);

        int result = Triangle.area(triangles);
        System.out.println(result);
        assertEquals(21, result);

    }

}