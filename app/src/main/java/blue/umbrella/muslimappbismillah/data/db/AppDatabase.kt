package blue.umbrella.muslimappbismillah.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import blue.umbrella.muslimappbismillah.vo.Bookmark
import blue.umbrella.muslimappbismillah.vo.Prayer

@Database(entities = [
    Prayer::class,
    Bookmark::class
], version = 1, exportSchema = true)
abstract class AppDatabase : RoomDatabase() {

    abstract fun prayerDao() : PrayerDao
    abstract fun bookmarkDao() : BookmarkDao

    companion object{

        private const val DATABASE_NAME = "app-database.db"

        fun newInstance(context: Context) : AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME).build()
        }

    }

}