package EighthLesson.lesson8.lesson8.serializers.weatherIn5DaysSerializers;

import SevenLesson.lesson7.serializers.weatherIn5DaysSerializers.DailyForecast;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;


/*
    Сериализатор для ответа с endpoint'а о погоде на 5 дней.
    Особенности:
        - Указаны только используемые поля
        - см. пункт Response Parameters
    API DOC URL:
        https://developer.accuweather.com/accuweather-forecast-api/apis/get/forecasts/v1/daily/5day/%7BlocationKey%7D
*/
@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherIn5DaysResponse {
    private List<SevenLesson.lesson7.serializers.weatherIn5DaysSerializers.DailyForecast> dailyForecasts;

    @JsonSetter("DailyForecasts")
    public void getDailyForecasts(List<SevenLesson.lesson7.serializers.weatherIn5DaysSerializers.DailyForecast> values) {
        this.dailyForecasts = values;
    }

    @JsonGetter("DailyForecasts")
    public List<DailyForecast> getDailyForecasts() {
        return this.dailyForecasts;
    }

    public WeatherIn5DaysResponse() {}
}