package android.actionsheet.demo.com.khoiron.myapplication.layout

import android.actionsheet.demo.com.khoiron.myapplication.R
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import org.jetbrains.anko.*

/**
 * Created by khoiron on 12/08/18.
 */
class AdapterUi :AnkoComponent<ViewGroup>{
    override fun createView(ui: AnkoContext<ViewGroup>)= with(ui) {
        verticalLayout {
            linearLayout {
                orientation = LinearLayout.HORIZONTAL
                imageView {
                    id = R.id.image
                    imageResource = R.mipmap.ic_launcher
                }.lparams(width = dip(100), height = dip(100))
                linearLayout {
                    orientation = LinearLayout.VERTICAL
                    textView {
                        id = R.id.text1
                    }.lparams(width = matchParent, height = wrapContent)
                    textView {
                        id = R.id.text2

                    }.lparams(width = matchParent, height = wrapContent)
                    textView{
                        id = R.id.text3
                    }.lparams(width = matchParent, height = wrapContent)
                    textView {
                        id = R.id.text4

                    }.lparams(width = matchParent, height = wrapContent)
                    }
                }.lparams(width = matchParent, height = matchParent) {
                    leftMargin = dip(10)
                    topMargin = dip(5)
                }
            }
        }

}