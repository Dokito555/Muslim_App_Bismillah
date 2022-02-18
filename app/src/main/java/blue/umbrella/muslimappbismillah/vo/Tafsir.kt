package blue.umbrella.muslimappbismillah.vo

import com.google.gson.annotations.SerializedName

data class Tafsir (
    val number : Int,
    @SerializedName("Text")
    val tafsir : String,
)