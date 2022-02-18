package blue.umbrella.muslimappbismillah.vo

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Verse (
    val index : Int = 0,
    val surah : Int,
    val number : Int,
    val juz : Int,
    val page : Int,
    val text : String,
    val latin : String,
    val translation : Translation,
    val bookmark : Boolean = false
) : Parcelable