package blue.umbrella.muslimappbismillah.vo

import com.google.gson.annotations.SerializedName

data class Suggestion (
    val id : String,
    @SerializedName("name", alternate = ["city"])
    val name : String
    )