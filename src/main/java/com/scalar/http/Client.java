package com.scalar.http;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Client {
    private OkHttpClient client;

    public Client() {
        client = new OkHttpClient();
    }

    /**
     * Using GET method of HTTP
     *
     * @param url
     * @return
     * @throws IOException
     */
    public String get(String url) {
        Request request = new Request.Builder().url(url).build();

        try {
            Response response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
