package org.example.springhelloworld.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomErrorControllerTest {

    private final CustomErrorController customErrorController = new CustomErrorController();

    @Test
    public void testHandleNotFound() {
        String result = customErrorController.handleNotFound();
        assertEquals("error/404", result);
    }

    @Test
    public void testHandleServerError() {
        String result = customErrorController.handleServerError();
        assertEquals("error/500", result);
    }
}
