package com.example.android.current_location;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface ApiInterface {
    Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("url")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
    @FormUrlEncoded
    @POST("url")
    Call<Coordinates>insertData(@Field("latitude") double latitude, @Field("longitude") double longitude);

}
