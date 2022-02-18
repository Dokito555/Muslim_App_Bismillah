package blue.umbrella.muslimappbismillah.data.local

import android.app.Application
import blue.umbrella.muslimappbismillah.vo.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException
import java.nio.charset.Charset
import javax.inject.Inject

class LocalService @Inject constructor(private val app : Application) {

    companion object {
        private var verse : List<Verse>? = null
        private var surah : List<Surah>? = null
    }

    private fun assetString(fileName : String) : String {
        return try {
            val stream = app.assets.open(fileName)
            String(stream.readBytes(), Charset.forName("UTF-8"))
        } catch (e : IOException) {
            ""
        }
    }

    fun listSurah() : List<Surah> {
        if (surah == null) {
            val content = assetString("surah.json")
            surah = Gson().fromJson(content, object : TypeToken<List<Surah>>(){}.type)
        }
        return surah!!
    }

    fun surah(surah : Int) : List<Verse>{
        if (verse == null) {
            val content = assetString("al-quran.json")
            verse = Gson().fromJson(content, object : TypeToken<List<Verse>>(){}.type)
        }
        return verse!!.filter { it.surah == surah }
    }

    fun surah(surahName : String) : List<Verse>{
        if (verse == null) {
            val content = assetString("al-quran.json")
            verse = Gson().fromJson(content, object : TypeToken<List<Verse>>(){}.type)
        }
        return surah!!.run {
            verse!!.filter {
                it.surah == this.find { s ->
                    s.name.contentEquals(surahName)
                } ?.number
            }
        }
    }

    fun listNames() : List<NamaAllah> {
        val content = assetString("asmaul-husna.json")
        return  Gson().fromJson<ArrayList<NamaAllah>>(content, object : TypeToken<ArrayList<NamaAllah>>(){}.type)
    }

    fun tafsir(surah : Int) : Info<Tafsir> {
        val content = assetString("tafsir/${Companion.surah}.json")
        return Gson().fromJson(content, object : TypeToken<Info<Tafsir>>(){}.type)
    }

    fun citys() : List<Suggestion> {
        val content = assetString("city-indonesia.json")
        return Gson().fromJson(content, object : TypeToken<List<Suggestion>>(){}.type)
    }

    fun city(city : String) :Suggestion? {
        return citys().find { it.name == city.replace(Regex("^(Kab\\.|Kota\\.|Kota|Kabupaten)\\s"), "") }
    }

}