package code.com.mvvmexample.repository
import androidx.lifecycle.MutableLiveData
import code.com.mvvmexample.models.ModelPlace

/**
 * Created by Prashant Gupta on 06,February,2019
 */
object PlacesRepository {
    private var placeList = mutableListOf<ModelPlace>()

    fun getPlaceList(): MutableLiveData<List<ModelPlace>> {
        initData()
        val mutablePlaceData: MutableLiveData<List<ModelPlace>> = MutableLiveData()
        mutablePlaceData.value = placeList
        return mutablePlaceData
    }

    private fun initData() {
        placeList.add(ModelPlace("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg", "Havasu Falls"))
        placeList.add(ModelPlace("https://i.redd.it/tpsnoz5bzo501.jpg", "Trondheim"))
        placeList.add(ModelPlace("https://i.redd.it/qn7f9oqu7o501.jpg", "Portugal"))
        placeList.add(ModelPlace("https://i.redd.it/j6myfqglup501.jpg", "Rocky Mountain National Park"))
        placeList.add(ModelPlace("https://i.redd.it/0h2gm1ix6p501.jpg", "Mahahual"))
        placeList.add(ModelPlace("https://i.redd.it/k98uzl68eh501.jpg", "Frozen Lake"))
        placeList.add(ModelPlace("https://i.redd.it/glin0nwndo501.jpg", "White Sands Desert"))
        placeList.add(ModelPlace("https://i.redd.it/obx4zydshg601.jpg", "Australia"))
        placeList.add(ModelPlace("https://i.imgur.com/ZcLLrkY.jpg", "Washington"))
    }
}