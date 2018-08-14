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
class Main2ActivityUi :AnkoComponent<Main2Activity>{
    override fun createView(ui: AnkoContext<Main2Activity>)= with(ui) {
        verticalLayout {
            recyclerView {
                id = R.id.myRecycleView
            }.lparams(width = matchParent,height = matchParent){

            }
            /*linearLayout {
                orientation = LinearLayout.HORIZONTAL
                imageView {
                    imageResource = R.mipmap.ic_launcher
                }.lparams(width = dip(100), height = dip(100))
                linearLayout {
                    orientation = LinearLayout.VERTICAL
                    textView("vgsjbvjscdbjevykl").lparams(width = matchParent, height = wrapContent)
                    textView("vgsjbvjscdbjevykl").lparams(width = matchParent, height = wrapContent)
                    textView("vgsjbvjscdbjevykl").lparams(width = matchParent, height = wrapContent)
                    textView("vgsjbvjscdbjevykl").lparams(width = matchParent, height = wrapContent)
                }.lparams(width = matchParent, height = matchParent) {
                    leftMargin = dip(10)
                    topMargin = dip(5)
                }
            }.lparams(width = matchParent, height = wrapContent) {
                leftMargin = dip(10)
                topMargin = dip(10)
            }
            frameLayout {
                id = R.id.framFragment
            }.lparams(height = matchParent, width = matchParent){

            }*/
        }
    }

}