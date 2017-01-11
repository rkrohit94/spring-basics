package com.allstate.models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 11/01/17.
 */
public class PointTest {
    @Test
    public void distance() throws Exception {
        Point p1 = new Point(3,4);
        Point p2 = new Point(5,1);

        double result = Point.distance(p1,p2);
        assertEquals(3.6,result, 0.1);

    }

    @Test
    public void slope() throws Exception {
        Point p1 = new Point(3,4);
        Point p2 = new Point(5,1);

        double result = Point.slope(p1,p2);
        assertEquals(-1.5,result, 0.1);

    }

    @Test
    public void yIntercept() throws Exception {
        Point p1 = new Point(3,4);
        Point p2 = new Point(5,1);

        double result = Point.yintercept(p1,p2);
        assertEquals(8.5,result, 0.1);

    }

}