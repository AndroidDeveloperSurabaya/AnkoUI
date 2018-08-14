package android.actionsheet.demo.com.khoiron.myapplication.layout

import android.actionsheet.demo.com.khoiron.myapplication.R
import android.actionsheet.demo.com.khoiron.myapplication.activity.Main2Activity
import android.view.View
import android.widget.LinearLayout
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

/**
 * Created by khoiron on 12/08/18.
 */
class Main2ActivityUi<T> :AnkoComponent<T>{
    override fun createView(ui: AnkoContext<T>)= with(ui) {
        verticalLayout {
            recyclerView {
                id = R.id.myRecycleView
            }.lparams(width = matchParent,height = matchParent){

            }
        }
    }

}