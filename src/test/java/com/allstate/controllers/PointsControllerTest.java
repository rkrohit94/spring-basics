package com.allstate.controllers;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(PointsController.class)
public class PointsControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void distance() throws Exception {
        MockHttpServletRequestBuilder request = post("/points/distance")
                .contentType(MediaType.APPLICATION_JSON)
                .content("[{\"x\":3, \"y\":4},{\"x\":5, \"y\":1}]");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.Distance", is(closeTo(3.6, 0.1))));

    }

    @Test
    public void slope() throws Exception {
        MockHttpServletRequestBuilder request = post("/points/slope")
                .contentType(MediaType.APPLICATION_JSON)
                .content("[{\"x\":3, \"y\":4},{\"x\":5, \"y\":1}]");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.slope", is(closeTo(-1.5, 0.1))));

    }

    @Test
    public void yIntercept() throws Exception {
        MockHttpServletRequestBuilder request = post("/points/yintercept")
                .contentType(MediaType.APPLICATION_JSON)
                .content("[{\"x\":3, \"y\":4},{\"x\":5, \"y\":1}]");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.yIntercept", is(closeTo(8.5, 0.1))));

    }

}