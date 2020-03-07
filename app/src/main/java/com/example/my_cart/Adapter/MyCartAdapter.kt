package com.example.my_cart.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.my_cart.Model.MyCart
import com.example.my_cart.R
import kotlinx.android.synthetic.main.mycart_item.view.*

class MyCartAdapter(var myCart_List:ArrayList<MyCart>):RecyclerView.Adapter<MyCartAdapter.MyCartViewHolder>(){
    inner class MyCartViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bindMyCart(myCart:MyCart){
            itemView.item_img.setImageResource(myCart.Img)
            itemView.txt_name.text=myCart.name
            itemView.txt_Price.text=myCart.Price.toString()
            itemView.txt_disc_price.text=myCart.disc_Price.toString()
            itemView.txt_kg.text=myCart.amount
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyCartViewHolder {
            return MyCartViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.mycart_item,parent,false))
    }

    override fun getItemCount(): Int {
            return myCart_List.size
    }

    override fun onBindViewHolder(holder: MyCartViewHolder, position: Int) {
            holder.bindMyCart(myCart_List[position])
    }
}