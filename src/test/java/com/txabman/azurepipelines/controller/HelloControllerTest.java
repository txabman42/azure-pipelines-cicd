package com.txabman.azurepipelines.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = HelloController.class)
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getHelloWorldShouldReturnOk() throws Exception {
        final ResultActions result = mockMvc.perform(
            get("/hello-world").accept(MediaType.APPLICATION_JSON_VALUE));
        result.andExpect(status().isOk());
        result.andExpect(jsonPath("$").value("Hello World!"));
    }

}