package EighthLesson.lesson8.lesson8.serializers.weatherIn5DaysSerializers;

import SevenLesson.lesson7.serializers.weatherIn5DaysSerializers.DayNight;
import SevenLesson.lesson7.serializers.weatherIn5DaysSerializers.Temperature5Days;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;


/*
    Сериализатор для ответа с endpoint'а о погоде на 5 дней.
    Особенности:
        - Указаны только используемые поля
        - см. пункт Response Parameters -> DailyForecasts
    API DOC URL:
        https://developer.accuweather.com/accuweather-forecast-api/apis/get/forecasts/v1/daily/5day/%7BlocationKey%7D
*/
@JsonIgnoreProperties(ignoreUnknown=true)
public class DailyForecast {
    private String date;
    private Temperature5Days temperature;
    private SevenLesson.lesson7.serializers.weatherIn5DaysSerializers.DayNight day;
    private SevenLesson.lesson7.serializers.weatherIn5DaysSerializers.DayNight night;

    @JsonSetter("Date")
    public void setDate(String value) {
        this.date = value;
    }

    // Вычисляемое свойство...
    @JsonGetter("Date")
    public String getDate() {
        String[] dtParts = this.date.split("T");
        return dtParts[0];
    }

    @JsonSetter("Temperature")
    public void setTemperature(Temperature5Days value) {
        this.temperature = value;
    }

    @JsonGetter("Temperature")
    public Temperature5Days getTemperature() {
        return this.temperature;
    }

    @JsonSetter("Day")
    public void setDay(SevenLesson.lesson7.serializers.weatherIn5DaysSerializers.DayNight value) {
        this.day = value;
    }

    @JsonGetter("Day")
    public SevenLesson.lesson7.serializers.weatherIn5DaysSerializers.DayNight getDay() {
        return this.day;
    }

    @JsonSetter("Night")
    public void setNight(SevenLesson.lesson7.serializers.weatherIn5DaysSerializers.DayNight value) {
        this.night = value;
    }

    @JsonGetter("Night")
    public DayNight getNight() {
        return this.night;
    }

    public DailyForecast() {}
}