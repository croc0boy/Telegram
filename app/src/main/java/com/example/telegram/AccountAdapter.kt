package com.example.telegram

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AccountAdapter(private val Account: ArrayList<Account>,
) : RecyclerView.Adapter<AccountAdapter.AccountVH>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccountVH {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: AccountVH, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }




    class AccountVH (view: View,
    ): RecyclerView.ViewHolder(view){


        fun onBind(
            account: Account,
            position: Int,

        ){

        }
    }
}