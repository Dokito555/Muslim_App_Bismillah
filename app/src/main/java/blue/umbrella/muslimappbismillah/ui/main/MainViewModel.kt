package blue.umbrella.muslimappbismillah.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor() : ViewModel(){

    fun findRegion(city : String) = viewModelScope.launch {



    }

}