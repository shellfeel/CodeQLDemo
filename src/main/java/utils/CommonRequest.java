package utils;

import okhttp3.*;

import java.io.IOException;

public class CommonRequest {



    static {
        okHttpClient = new OkHttpClient();
    }

    private static OkHttpClient okHttpClient;

    public static String request(String url){
        System.out.println("请求中");
        System.out.println(url);
        Request request = new Request.Builder().url(url).get().build();
        Call call = okHttpClient.newCall(request);
        try {
            Response response = call.execute();
            return response.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
