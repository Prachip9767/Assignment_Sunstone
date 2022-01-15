package com.prachi.assignmentsunstone.ui.adapter

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.prachi.assignmentsunstone.R
import com.prachi.assignmentsunstone.databinding.ItemLayoutBinding
import com.prachi.assignmentsunstone.local.interfaces.OnCardClicked
import com.prachi.assignmentsunstone.local.responses.PhotoModel
import java.util.*

class BaseAdapter(
    private val resultModelList: List<PhotoModel>,
    private val onCardClicked: OnCardClicked) : RecyclerView.Adapter<BaseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val itemLayoutBinding: ItemLayoutBinding =
            DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_layout, parent, false)
        return BaseViewHolder(itemLayoutBinding, onCardClicked)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        val resultModel = resultModelList[position]
        holder.setData(resultModel)
    }

    override fun getItemCount(): Int {
        return resultModelList.size
    }
}

class BaseViewHolder(
    private val itemLayoutBinding: ItemLayoutBinding,
    private val onCardClicked: OnCardClicked) : RecyclerView.ViewHolder(itemLayoutBinding.root) {

    fun setData(photoModel: PhotoModel) {
        itemLayoutBinding.apply {

            Glide.with(ivImage).load(photoModel.srcModel.original).placeholder(ColorDrawable(Color.parseColor("#b0c4de"))).into(ivImage)

            ivCard.setOnClickListener {
                onCardClicked.onCardClicked(photoModel.srcModel)
            }
        }
    }

}
