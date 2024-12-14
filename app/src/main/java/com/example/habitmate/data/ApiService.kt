package com.example.habitmate.data

import retrofit2.Response
import retrofit2.http.*

/**
 * Интерфейс для взаимодействия с HabitMate API.
 * Содержит методы для получения, добавления, обновления и удаления привычек.
 */

interface HabitApiService {

    @GET("habits")
    suspend fun getHabits(): List<Habit>

    @POST("habits")
    suspend fun addHabit(@Body habit: Habit): Response<Habit>

    @PUT("habits/{id}")
    suspend fun updateHabit(@Path("id") id: Int, @Body habit: Habit): Response<Habit>

    @DELETE("habits/{id}")
    suspend fun deleteHabit(@Path("id") id: Int): Response<Unit>
}
