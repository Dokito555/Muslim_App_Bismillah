package blue.umbrella.muslimappbismillah.vo

import com.google.gson.annotations.SerializedName

data class NamaAllah (
    val index : Int,
    val arabic : String,
    val latin : String,
    @SerializedName("translation_id")
    val translationID : String,
    @SerializedName("translation_en")
    val translationEN : String,
    val description : String,
    @SerializedName("ico_unicode")
    val unicode : String,
    @SerializedName("timing")
    val currentTime : Long
        )