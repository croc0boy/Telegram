package com.example.telegram

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AccountAdapter(
    private val accounts: ArrayList<Account>,
) : RecyclerView.Adapter<AccountAdapter.AccountVH>() {
    private var onClick: ((Account, Int) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccountVH {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.account_prefab, parent, false)
        return AccountVH(view)
    }

    override fun onBindViewHolder(holder: AccountVH, position: Int) {
        val account = accounts[position]
        holder.onBind(account, position, onClick ?: { account, i -> })
    }

    override fun getItemCount() = accounts.size


    class AccountVH(
        view: View,
    ) : RecyclerView.ViewHolder(view) {
        private val img = itemView.findViewById<ImageView>(R.id.account_img)
        private val lastMessage = itemView.findViewById<TextView>(R.id.message_last)
        private val timeMessage = itemView.findViewById<TextView>(R.id.message_time)
        private val name = itemView.findViewById<TextView>(R.id.account_name)

        fun onBind(
            account: Account,
            position: Int,
            onClick: (Account, Int) -> Unit
        ) {
            lastMessage.text = account.lastMessage
            timeMessage.text = account.messageTime
            name.text = account.name
            Glide.with(itemView.context).load(account.image).into(img)
            itemView.setOnClickListener {
                onClick.invoke(account, position)
            }
        }
    }
}