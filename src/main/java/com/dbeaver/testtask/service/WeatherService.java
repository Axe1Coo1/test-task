package com.dbeaver.testtask.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class WeatherService {

    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;


    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    public String getCurrentDate(){
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd");
        Date currentDate = new Date();
        return formatForDateNow.format(currentDate);
    }
}
