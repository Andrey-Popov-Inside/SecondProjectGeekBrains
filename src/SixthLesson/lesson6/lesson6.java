package SixthLesson.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import static java.nio.charset.StandardCharsets.UTF_8;


public class lesson6 {
    // Домен...
    static String BASE_URL = "http://dataservice.accuweather.com";

    // Токен...
    static String API_KEY = "0d1tNZJPfzzT3qGokM18FGGxAUpt7hpj";

    // ID города в системе: Санкт-Петербург...
    static Integer TARGET_CITY_ID = 295212;

    // Получить ссылку на погоду за 1 день...
    static String get1daysURL(Integer cityID) {
        return BASE_URL + "/forecasts/v1/daily/1day/" + cityID + "?apikey=" + API_KEY;
    }
    // Получить ссылку на погоду за 5 суток...
    static String get5daysURL(Integer cityID) {
        return BASE_URL + "/forecasts/v1/daily/5day/" + cityID + "?apikey=" + API_KEY;
    }
    // Печать в консоль...
    static void printResponseData(InputStream in) {
        new BufferedReader(new InputStreamReader(in, UTF_8))
                .lines()
                .forEach(System.out::println);
    }
    public static void main(String[] args) throws IOException {
        // Тест: Погода за 1 день...
        URL target_url = new URL(get1daysURL(TARGET_CITY_ID));
        printResponseData(target_url.openStream());

        // Тест: Погода за 5 дней...
        target_url = new URL(get5daysURL(TARGET_CITY_ID));
        printResponseData(target_url.openStream());
    }
}