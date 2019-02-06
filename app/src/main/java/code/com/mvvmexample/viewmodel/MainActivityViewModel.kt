package code.com.mvvmexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import code.com.mvvmexample.models.ModelPlace
import code.com.mvvmexample.repository.PlacesRepository

/**
 * Created by Prashant Gupta on 06,February,2019
 */
class MainActivityViewModel : ViewModel() {
    private var mPlaces: MutableLiveData<List<ModelPlace>>? = null

    init {
        if (mPlaces == null) {
            mPlaces = PlacesRepository.getPlaceList()
        }
    }

    fun getPlaces(): LiveData<List<ModelPlace>>? {
        return mPlaces
    }
}