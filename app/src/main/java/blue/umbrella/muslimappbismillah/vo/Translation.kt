package blue.umbrella.muslimappbismillah.vo

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Translation(
    val en : String,
    val id : String,
    val ar : String? = null
) : Parcelable
