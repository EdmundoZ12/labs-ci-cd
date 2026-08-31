package com.cicd.webapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PingControllerTest {

    @Test
    void shouldReturnPong() {
        PingController controller = new PingController();

        String response = controller.ping();

        assertEquals("pong", response);
    }
}
