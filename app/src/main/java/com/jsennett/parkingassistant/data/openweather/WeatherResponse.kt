package com.jsennett.parkingassistant.data.openweather

import com.google.gson.annotations.SerializedName

class WeatherResponse(
    @SerializedName("coord")
    var coordinate: Coordinate? = null,
    @SerializedName("weather")
    var weatherConditions: List<WeatherCondition> = listOf(),
    @SerializedName("main")
    var basicWeather: BasicWeather? = null,
    var wind: Wind? = null,
    var clouds: Clouds? = null,
    var rain: Rain? = null,
    var snow: Snow? = null,
    @SerializedName("dt")
    var calculationTimeStamp: Long? = null,
    @SerializedName("timezone")
    var timeZoneOffset: Int? = null,
    @SerializedName("id")
    var cityId: Int? = null,
    @SerializedName("name")
    var cityName: String? = null
) {
    class Coordinate(
        @SerializedName("lat")
        var latitude: Double? = null,
        @SerializedName("lon")
        var longitude: Double? = null
    )

    class WeatherCondition(
        // See: https://openweathermap.org/weather-conditions
        var id: Int? = null,
        @SerializedName("main")
        var shortDescription: String? = null,
        @SerializedName("description")
        var longDescription: String? = null,
        @SerializedName("icon")
        var iconCode: String? = null
    )

    class BasicWeather(
        // Default in kelvin
        @SerializedName("temp")
        var temperature: Double? = null,
        // Atmospheric pressure (on the sea level, if there is no sea_level or grnd_level data), hPa
        var pressure: Int? = null,
        var humidity: Int? = null,
        @SerializedName("temp_min")
        var minimumTemperature: Double? = null,
        @SerializedName("temp_max")
        var maximumTemperature: Double? = null,
        @SerializedName("sea_level")
        var seaLevelPressure: Int? = null,
        @SerializedName("grnd_level")
        var groundLevelPressure: Int? = null
    )

    class Wind(
        var speed: Double? = null,
        @SerializedName("deg")
        var direction: Double? = null
    )

    class Clouds(
        @SerializedName("all")
        var cloudinessPercent: Int? = null
    )

    class Rain(
        @SerializedName("1h")
        var OneHourRainfall: Double? = null,
        @SerializedName("3h")
        var ThreeHourRainfall: Double? = null
    )

    class Snow(
        @SerializedName("1h")
        var OneHourSnowfall: Double? = null,
        @SerializedName("3h")
        var ThreeHourSnowfall: Double? = null
    )
}
