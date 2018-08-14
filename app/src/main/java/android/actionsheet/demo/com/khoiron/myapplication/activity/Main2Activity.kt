package android.actionsheet.demo.com.khoiron.myapplication.activity

import android.actionsheet.demo.com.khoiron.myapplication.R
import android.actionsheet.demo.com.khoiron.myapplication.layout.Main2ActivityUi
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.RecyclerView
import org.jetbrains.anko.find
import org.jetbrains.anko.setContentView

class Main2Activity : AppCompatActivity() {

    val recyclerView by lazy { find(R.id.myRecycleView) as RecyclerView }
    val data by lazy { ArrayList<String>() }
    val adapterRv by lazy { AdapterRv(this,data) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Main2ActivityUi().setContentView(this)

        setInitRv()
        setData()
    }

    private fun setData() {
        for (i in 0..10){
            data.add("test rv "+i)
        }
    }

    private fun setInitRv() {
        val mLayout = LinearLayoutManager(this)
        recyclerView.layoutManager = mLayout
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = adapterRv
    }
}
