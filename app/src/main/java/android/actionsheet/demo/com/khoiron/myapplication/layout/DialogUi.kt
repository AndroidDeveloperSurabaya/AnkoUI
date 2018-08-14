package android.actionsheet.demo.com.khoiron.myapplication.layout

import android.actionsheet.demo.com.khoiron.myapplication.R
import android.actionsheet.demo.com.khoiron.myapplication.activity.Fragment1
import android.graphics.Color
import android.view.View
import android.widget.LinearLayout
import org.jetbrains.anko.*

/**
 * Created by khoiron on 12/08/18.
 */
class DialogUi<T>:AnkoComponent<T> {
    override fun createView(ui: AnkoContext<T>)= with(ui) {
        verticalLayout {
            minimumWidth = dip(1000)
            linearLayout {
                orientation = LinearLayout.HORIZONTAL
                imageView {
                    imageResource = R.mipmap.ic_launcher
                }.lparams(width = dip(100), height = dip(100))
                linearLayout {
                    orientation = LinearLayout.VERTICAL
                    textView("Ampersanda").lparams(width = matchParent, height = wrapContent)
                    textView("Adit").lparams(width = matchParent, height = wrapContent)
                    textView("lucky").lparams(width = matchParent, height = wrapContent)
                    textView("candra").lparams(width = matchParent, height = wrapContent)
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

            }
        }
    }

}