package com.cloudnative.grokking.jupiter.controller;

import com.cloudnative.grokking.jupiter.JupiterMain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.net.URI;

@RunWith(SpringRunner.class)
@WebMvcTest(PingController.class)
@ContextConfiguration(classes= JupiterMain.class)
public class JupiterControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testPingPong() throws Exception {
        // GIVEN
        String url = "/ping";

        // WHEN
        mockMvc.perform(get(new URI(url)))
                .andDo(print())
                // THEN
                .andExpect(status().isOk())
                .andExpect(content().string(is("pong")));
    }

}
