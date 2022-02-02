package com.dbeaver.testtask.controller;

import com.dbeaver.testtask.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;



}
