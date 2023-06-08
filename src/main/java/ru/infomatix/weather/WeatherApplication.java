package ru.infomatix.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherApplication.class, args);
	}

}

/*
ObjectMapper objectMapper = new ObjectMapper();
String json = loadExternalJson(String.format(urlFormat, cityWeatherBind.getCityCondition(), "onecall"));

WeatherDTO weatherDTO = objectMapper.readValue(json, WeatherDTO.class);
 */
