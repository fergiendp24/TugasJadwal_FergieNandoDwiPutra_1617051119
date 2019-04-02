package com.example.tugasjadwalapi.api;


import com.example.tugasjadwalapi.model.Items;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface ApiInterface {

    @GET("lampung/{periode}/dayli.json")
    Call<Items> getJadwalSholat(@Path("periode") String periode);



}

