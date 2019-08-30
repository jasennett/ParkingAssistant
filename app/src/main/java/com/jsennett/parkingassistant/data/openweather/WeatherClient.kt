package com.jsennett.parkingassistant.data.openweather

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

class WeatherClient {
    private val service by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/data/2.5/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Service::class.java)
    }

    private interface Service {
        @GET("weather")
        suspend fun getWeather(@Query("lat") lat: Double, @Query("lon") lon: Double): Response<WeatherResponse>
    }

    suspend fun getWeather(lat: Double, lng: Double): Response<WeatherResponse> {
        return service.getWeather(lat, lng)
    }
}