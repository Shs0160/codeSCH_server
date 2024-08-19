package code_SCH.project.controller;

import code_SCH.project.service.ShortTermWeatherAPI;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {
    @GetMapping
    public Map<String, Object> getWeather() {
        Map<String, Object> response = new HashMap<>();
        try {
            ShortTermWeatherAPI weatherAPI = new ShortTermWeatherAPI();
            String jsonResponse = weatherAPI.getWeatherData(); // 현재 위치의 실시간 날씨 데이터 가져오기
            double[] latLon = weatherAPI.getCurrentLocation();
            JSONObject locationData = weatherAPI.getLocationData(latLon[0], latLon[1]); // 위치 정보 가져오기
            JSONObject parsedData = weatherAPI.parseWeatherData(jsonResponse, locationData); // 파싱된 데이터를 JSONObject로 반환

            response.putAll(parsedData.toMap()); // JSONObject를 Map으로 변환하여 응답에 추가

        } catch (IOException e) {
            e.printStackTrace();
            response.put("error", "Unable to retrieve weather data.");
        }
        return response; // JSON 형태로 응답을 반환
    }
}