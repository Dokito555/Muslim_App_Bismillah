package blue.umbrella.muslimappbismillah.data.db

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import blue.umbrella.muslimappbismillah.vo.Bookmark
import retrofit2.http.DELETE

interface BookmarkDao {

    @Query("SELECT * FROM bookmark")
    fun getAll() : LiveData<List<Bookmark>>

    @Query("SELECT * FROM bookmark WHERE number=:surah")
    fun getWithSurah(surah : Int, verse : Int) : Bookmark?

    @Query("SELECT * FROM bookmark WHERE number=:surah AND verse=:surah")
    fun get(surah: Int, verse: Int) : Bookmark?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(list : Bookmark)

    @Delete
    suspend fun delete(bookmark: Bookmark)

    @Query("DELETE FROM bookmark WHERE number=:surah AND verse=:verse")
    suspend fun delete(surah: Int, verse: Int)

}