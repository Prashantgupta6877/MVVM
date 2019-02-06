package code.com.mvvmexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import code.com.mvvmexample.adapter.RecyclerAdapter
import code.com.mvvmexample.models.ModelPlace
import code.com.mvvmexample.viewmodel.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Prashant Gupta on 06,February,2019
 */
class MainActivity : AppCompatActivity() {
    private lateinit var adapter: RecyclerAdapter
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        adapter = RecyclerAdapter(this, viewModel.getPlaces()?.value!!)
        recyclerv_view.layoutManager = LinearLayoutManager(this)
        recyclerv_view.adapter = adapter

        viewModel.getPlaces()?.observe(this, Observer<List<ModelPlace>> {
            adapter.notifyDataSetChanged()
        })
    }
}
