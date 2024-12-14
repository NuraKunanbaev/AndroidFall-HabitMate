package com.example.habitmate.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    private val retrofit = Retrofit.Builder()
        .baseUrl("бек еще не написано")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService: HabitApiService = retrofit.create(HabitApiService::class.java)
}
