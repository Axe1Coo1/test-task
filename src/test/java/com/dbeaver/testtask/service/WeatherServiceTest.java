package com.dbeaver.testtask.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class WeatherServiceTest {

    @Autowired
    private WeatherService weatherService;

    @Test
    public void shouldGetJdbcConnection() throws SQLException {
        try (Connection connection = weatherService.getConnection()) {
            assertTrue(connection.isValid(1));
            assertFalse(connection.isClosed());
        }
    }
}

