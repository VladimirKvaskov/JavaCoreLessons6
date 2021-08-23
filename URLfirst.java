package Lesson6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;


public class URLfirst {

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/" +
                        "296477?apikey=%095TynW1wz8vwSIR6m2ZXl4Ln27TIUHVcU&language=ru-ru")
                .build();

        Response response = client.newCall(request).execute();
         String body = response.body().string();
        System.out.println(body);

    }
}