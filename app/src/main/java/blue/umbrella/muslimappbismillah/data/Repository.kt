package blue.umbrella.muslimappbismillah.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import blue.umbrella.muslimappbismillah.data.db.AppDatabase
import blue.umbrella.muslimappbismillah.data.local.LocalService
import blue.umbrella.muslimappbismillah.vo.Prayer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject

class Repository @Inject constructor(
    private val appDatabase: AppDatabase,
    private val localService : LocalService
) {

//    fun prayer(date : String) : LiveData<List<Prayer>>{
//        val results = MediatorLiveData<LiveData<Prayer>>()
//        GlobalScope.launch(Dispatchers.IO) {
//
//        }
//        return results
//    }
//
//    private suspend fun prayerListFromDay(date : String) : List<Prayer>{
//        val list =
//    }



}