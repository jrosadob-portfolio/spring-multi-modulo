package com.webmath.controllers;

import com.math.entities.Operation;
import com.math.services.MathService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@DisplayName("Pruebas del controlador ApiController")
class ApiControllerTest {

  private MockMvc mockMvc;

  @Mock
  private MathService mathService;

  @InjectMocks
  private ApiController apiController;

  @BeforeEach
  public void setUp() {
    MockitoAnnotations.openMocks(this); // Error if not present
    mockMvc = MockMvcBuilders.standaloneSetup(apiController).build();
  }

  @Test
  @DisplayName("Test /api/sum?a=5&b=6")
  void testSum() throws Exception {
    int a = 5;
    int b = 6;
    Operation operation = new Operation(5, 6, "suma", 11);

    when(mathService.sum(a, b)).thenReturn(operation);

    mockMvc.perform(get("/api/sum")
        .param("a", String.valueOf(a))
        .param("b", String.valueOf(b)))
        .andExpect(status().isOk())
        .andExpect(content().json("{\"result\":11}"));
  }

  @Test
  @DisplayName("Test /api/suma1")
  void testSuma1() throws Exception {
    mockMvc.perform(get("/api/suma1"))
        .andExpect(status().isOk())
        .andExpect(content().string("This is the response for http://localhost:6701/api/suma1"));
  }

  @Test
  @DisplayName("Test /api/suma2")
  void testSuma2() throws Exception {
    mockMvc.perform(get("/api/suma2"))
        .andExpect(status().isOk())
        .andExpect(content().string("This is the response for http://localhost:6701/api/suma2"));
  }
}