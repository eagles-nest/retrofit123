package com.evans.retrofit123;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {
    String BASE_URL ="https://simplifiedcoding.net/demos/";


    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
