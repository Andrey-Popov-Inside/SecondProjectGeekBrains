package EighthLesson.lesson8.lesson8.serializers.currentConditionsSerializers;

import SevenLesson.lesson7.serializers.currentConditionsSerializers.Metric;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;


/*
    Сериализатор для ответа с endpoint'а о текущей погоде.
    Особенности:
        - Указаны только используемые поля
        - см. пункт Response Parameters -> Temperature
    API DOC URL:
        https://developer.accuweather.com/accuweather-current-conditions-api/apis/get/currentconditions/v1/%7BlocationKey%7D
*/
@JsonIgnoreProperties(ignoreUnknown=true)
public class Temperature {
    private SevenLesson.lesson7.serializers.currentConditionsSerializers.Metric metric;

    @JsonGetter("Metric")
    public SevenLesson.lesson7.serializers.currentConditionsSerializers.Metric getMetric() {
        return this.metric;
    }

    @JsonSetter("Metric")
    public void setMetric(Metric value) {
        this.metric = value;
    }
}