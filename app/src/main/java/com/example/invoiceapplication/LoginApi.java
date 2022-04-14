package com.example.invoiceapplication;

import java.util.Map;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
public interface LoginApi {
    @POST("CustomerLogin_Registration")
    Call<ResponseBody>Login(
            @Body RequestBody params
    );

}


