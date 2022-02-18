package blue.umbrella.muslimappbismillah.vo

import com.google.gson.annotations.SerializedName

data class Info<T> (
    val name : String,
    val source : String,
    @SerializedName("texts")
    val list : List<T>
        )