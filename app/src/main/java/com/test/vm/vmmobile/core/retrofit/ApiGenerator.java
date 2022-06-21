package com.test.vm.vmmobile.core.retrofit;


import com.test.vm.vmmobile.BuildConfig;
import com.test.vm.vmmobile.core.base.BaseView;

import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiGenerator {

    private static Retrofit retrofit;

    private static Retrofit.Builder builder;

    private static HttpLoggingInterceptor logging;

    private static OkHttpClient.Builder httpClient;

    public synchronized  static <S> S createApi(BaseView view, Class<S> apiClass) {


        if(builder == null){
            String baseUrl =  "https://restcountries.com/v3.1/";
            builder = new Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create());
        }

        if( logging == null){
            logging = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
        }

        if(httpClient == null){
            try {
                httpClient = new OkHttpClient.Builder();
                httpClient.hostnameVerifier(new HostnameVerifier() {
                    @Override
                    public boolean verify(String hostname, SSLSession session) {
                        return true;
                    }
                });
            } catch (Exception e) {
                httpClient = new OkHttpClient.Builder();
            }

            httpClient = httpClient.readTimeout(60, TimeUnit.SECONDS)
                    .connectTimeout(60, TimeUnit.SECONDS);
        }

        if (!httpClient.interceptors().contains(logging) && BuildConfig.DEBUG) {
            httpClient.addInterceptor(logging);
            builder.client(httpClient.build());
            retrofit = builder.build();

        }

            builder.client(httpClient.build());
            retrofit = builder.build();


        return retrofit.create(apiClass);
    }

    public static void reset() {
        builder = null;

    }
}
