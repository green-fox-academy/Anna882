package com.greenfoxacademy.restbackend.controller;

import org.junit.Test;

import static org.junit.Assert.*;

import com.greenfoxacademy.restbackend.RestbackendApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import com.greenfoxacademy.restbackend.RestbackendApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestbackendApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class MainRestControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void doubling23() throws Exception {
    mockMvc.perform(get("/doubling?input=23")
              .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result").value(46));
  }

  @Test
  public void greeterPetiStudent() throws Exception {
    mockMvc.perform(get("/greeter?name=Peti&title=student")
              .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.welcome_message").value("Oh, hi there Peti, my dear student!"));
  }

  @Test
  public void greeterPetiWithoutTitle() throws Exception {
    mockMvc.perform(get("/greeter?name=Peti")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("Please provide a title!"));
  }

  @Test
  public void appendingKutya() throws Exception{
    mockMvc.perform(get("/appenda/kuty")
              .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.appended").value("kutya"));
  }

  @Test
  public void appendingWithoutAppendable() throws Exception{
    mockMvc.perform(get("/appenda")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().is4xxClientError());
  }

  @Test
  public void countUntilTestFact8() throws Exception{
    mockMvc.perform(post("/dountil/factor")
              .contentType(MediaType.APPLICATION_JSON)
              .content("{\"until\": 8}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result").value(40320));
  }

  @Test
  public void doUntilTestSum6() throws Exception {
    mockMvc.perform(post("/dountil/sum")
              .contentType(MediaType.APPLICATION_JSON)
              .content("{\"until\": 6}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result").value(21));
  }

  @Test
  public void doUntilTestWithoutInput() throws Exception {
    mockMvc.perform(post("/dountil/sum")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("Please provide an operation and a number!"));
  }

  @Test
  public void doUntilTestWithWrongPathvariable() throws Exception {
    mockMvc.perform(post("/dountil/su")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("Please provide an operation and a number!"));
  }
}