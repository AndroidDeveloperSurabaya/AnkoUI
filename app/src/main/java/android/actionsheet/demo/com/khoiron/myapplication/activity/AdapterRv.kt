package android.actionsheet.demo.com.khoiron.myapplication.activity

import android.actionsheet.demo.com.khoiron.myapplication.R
import android.actionsheet.demo.com.khoiron.myapplication.layout.AdapterUi
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.find

/**
 * Created by khoiron on 12/08/18.
 */
class AdapterRv(var context : Context ,var data : MutableList<String>) : RecyclerView.Adapter<AdapterRv.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(AdapterUi().createView(AnkoContext.create(parent?.context,parent)))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataa = data.get(position)
        holder.text1.setText(dataa)
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val imageView = itemView.find(R.id.image) as ImageView
        val text1 = itemView.find(R.id.text1) as TextView
        val text2 = itemView.find(R.id.text2) as TextView
        val text3 = itemView.find(R.id.text3) as TextView
        val text4 = itemView.find(R.id.text4) as TextView
    }
}