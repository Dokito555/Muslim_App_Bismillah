package blue.umbrella.muslimappbismillah.vo

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Surah(
    @SerializedName("number_of_surah")
    val number : Int,
    val name : String,
    @SerializedName("number_of_ayah")
    val countVerse : Int,
    val place : String,
    val type : String,
    @SerializedName("name_translation")
    val translation: Translation,
    @SerializedName("ico_unicode")
    val unicode : String,
) : Parcelable
