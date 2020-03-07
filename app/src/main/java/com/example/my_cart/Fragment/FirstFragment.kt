package com.example.my_cart.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.my_cart.Adapter.MyCartAdapter
import com.example.my_cart.Model.MyCart
import com.example.my_cart.R
import kotlinx.android.synthetic.main.fragment_first.view.*

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var mycart_Array=ArrayList<MyCart>()
        mycart_Array.add(MyCart(R.drawable.sugar,"Sugar",30.00,"1Kg",10))
        mycart_Array.add(MyCart(R.drawable.peanuts,"Peanuts",20.00,"2Kg",5))
        mycart_Array.add(MyCart(R.drawable.dawat_rice,"Dawat Rice",80.00,"3Kg",10))

        var myCartAdapter= MyCartAdapter(mycart_Array)

        var root=inflater.inflate(R.layout.fragment_first, container, false)
        root.recyclerView.layoutManager=LinearLayoutManager(context)
        root.recyclerView.adapter=myCartAdapter
        // Inflate the layout for this fragment
        return root
    }

}
