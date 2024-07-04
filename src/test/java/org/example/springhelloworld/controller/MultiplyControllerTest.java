package org.example.springhelloworld.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplyControllerTest {

    @InjectMocks
    private MultiplyController multiplyController;

    private AutoCloseable closeable;

    @BeforeEach
    public void setUp() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    public void tearDown() throws Exception {
        closeable.close();
    }

    @Test
    public void testMultiply_ValidInput() {
        Model model = mock(Model.class);

        String result = multiplyController.multiply("5", "3", model);

        verify(model).addAttribute("result", 15);
        assertEquals("result", result);
    }

    @Test
    public void testMultiply_InvalidInput() {
        Model model = mock(Model.class);

        String result = multiplyController.multiply("five", "3", model);

        assertEquals("redirect:/error/500", result);
    }

    @Test
    public void testIndex() {
        String result = multiplyController.index();
        assertEquals("index", result);
    }
}
