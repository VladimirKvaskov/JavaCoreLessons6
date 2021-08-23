package Lesson6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Objects;

public class URL {
    public static final String HOST = "dataservice.accuweather.com";
    public static final String FORECASTS = "forecasts";
    public static final String VERSION = "v1";
    public static final String DAILY = "daily";
    public static final String DAYS = "5day";
    public static final String SITY = "296477";
    public static final String APYKEY = "5TynW1wz8vwSIR6m2ZXl4Ln27TIUHVcU";
    public static final String LANGUAGE = "ru-ru";
    public static final String METRIC = "true";

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host(HOST)
                .addPathSegment(FORECASTS)
                .addPathSegment(VERSION)
                .addPathSegment(DAILY)
                .addPathSegment(DAYS)
                .addPathSegment(SITY)
                .addQueryParameter("apikey", APYKEY)
                .addQueryParameter("language", LANGUAGE)
                .addQueryParameter("metric", METRIC)
                .build();

        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        System.out.print(Objects.requireNonNull(response.body()).string());


    }
}
