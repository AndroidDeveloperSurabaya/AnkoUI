package android.actionsheet.demo.com.khoiron.myapplication.layout

import android.actionsheet.demo.com.khoiron.myapplication.activity.MainActivity
import android.actionsheet.demo.com.khoiron.myapplication.R
import android.widget.LinearLayout
import org.jetbrains.anko.*

/**
 * Created by khoiron on 11/08/18.
 */
//id = R.id.framFragment

class HomeUi :AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>)= with(ui) {
        verticalLayout {
            linearLayout {
                orientation = LinearLayout.HORIZONTAL
                padding = dip(10)
                button {
                    textSize = 12f
                    text = "fragment"
                    id = R.id.btnFragment
                }.lparams(width= 0,height = matchParent,weight = 1F)
                button {
                    textSize = 12f
                    text = "dialog"
                    id = R.id.btnDialog
                }.lparams(width= 0,height = matchParent,weight = 1F)
                button {
                    textSize = 12f
                    text = "recyclerview"
                    id = R.id.btnRecyclerView
                }.lparams(width= 0,height = matchParent,weight = 1F)
            }.lparams(width = matchParent, height = wrapContent) {
            }
            frameLayout {
                id = R.id.framFragment
            }.lparams(height = matchParent, width = matchParent){

            }
        }
    }
}