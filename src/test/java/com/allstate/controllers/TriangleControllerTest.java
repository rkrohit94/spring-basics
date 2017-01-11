package com.allstate.controllers;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

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
@WebMvcTest(TriangleController.class)
public class TriangleControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void area() throws Exception {

        MockHttpServletRequestBuilder request = post("/triangle/area")
                .contentType(MediaType.APPLICATION_JSON)
                .content("[{\"weight\":23, \"height\":11}]");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.area", is(126)));

    }

}