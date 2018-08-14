package android.actionsheet.demo.com.khoiron.myapplication.activity

import android.actionsheet.demo.com.khoiron.myapplication.R
import android.actionsheet.demo.com.khoiron.myapplication.layout.HomeUi
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    val btnFragment by lazy { find(R.id.btnFragment) as Button}
    val btnDialogFragment by lazy { find(R.id.btnDialog) as Button}
    val btnRecyclerView by lazy { find(R.id.btnRecyclerView) as Button}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        HomeUi().setContentView(this)

        onClik()
    }

    private fun onClik() {
        btnDialogFragment.setOnClickListener { callDialog() }
        btnFragment.setOnClickListener { callFragment() }
        btnRecyclerView.setOnClickListener { startActivity<Main2Activity>() }
    }

    private fun callDialog() {
        val fm = getSupportFragmentManager()
        val dialogFragment = Dialog()
        dialogFragment.show(fm, " ")
    }

    private fun callFragment() {
        val callFragment = supportFragmentManager.beginTransaction()
        callFragment.replace(R.id.framFragment,Fragment1())
        callFragment.commit()
    }
}
