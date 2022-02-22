package blue.umbrella.muslimappbismillah.vo

import android.os.Parcelable
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "bookmark")
@Parcelize
data class Bookmark (
        @PrimaryKey(autoGenerate = true)
        val id : Int,
        val number : Int,
        val name : String,
        @Embedded(prefix = "trans_")
        val translation: Translation,
        val unicode : String,
        val verse : Int
) : Parcelable