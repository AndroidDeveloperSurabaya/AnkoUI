package android.actionsheet.demo.com.khoiron.myapplication.layout

import android.actionsheet.demo.com.khoiron.myapplication.R
import android.graphics.Color
import android.view.View
import org.jetbrains.anko.*

/**
 * Created by khoiron on 12/08/18.
 */
class FragmentUi<Fragment1>:AnkoComponent<Fragment1> {
    override fun createView(ui: AnkoContext<Fragment1>)= with(ui) {
        verticalLayout {
            backgroundColor = R.color.colorG
            textView {
                backgroundColor = R.color.transparant
                textAlignment = View.TEXT_ALIGNMENT_CENTER
                text = "contoh fragment"
                textColor = Color.WHITE
            }.lparams(width = matchParent,height = matchParent)
        }
    }

}