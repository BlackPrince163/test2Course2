package ru.itis.khadimullin.interactor;

import ru.itis.khadimullin.helper.JsonHelper;
import ru.itis.khadimullin.service.WeatherService;

import java.io.IOException;
import java.util.Map;

public class WeatherInteractor {
    private final WeatherService weatherNetworkService = new WeatherService();
    private final JsonHelper jsonHelper = new JsonHelper();

    public Map<String, String> get(String city) throws IOException {
        return jsonHelper.parseJson(weatherNetworkService.get(city));
    }
}
