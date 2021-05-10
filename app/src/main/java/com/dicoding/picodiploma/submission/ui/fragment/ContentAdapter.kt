package com.dicoding.picodiploma.submission.ui.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.picodiploma.submission.R
import com.dicoding.picodiploma.submission.data.source.local.entity.DataEntity
import com.dicoding.picodiploma.submission.databinding.ItemsContentBinding
import com.dicoding.picodiploma.submission.utils.ApiInfo.IMAGE_URL

class ContentAdapter (private val callback: ContentCallback) : RecyclerView.Adapter<ContentAdapter.ContentViewHolder>() {

    private val listContent = ArrayList<DataEntity>()

    fun setContent(content: List<DataEntity>?){
        if (content == null) return
        listContent.clear()
        listContent.addAll(content)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentViewHolder {
        val itemsContentBinding = ItemsContentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContentViewHolder(itemsContentBinding)
    }

    override fun onBindViewHolder(holder: ContentViewHolder, position: Int) {
        val content = listContent[position]
        holder.bind(content)
    }

    override fun getItemCount(): Int = listContent.size

    inner class ContentViewHolder (private val binding: ItemsContentBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(content: DataEntity){
            with(binding){
                tvTitle.text = content.title
                tvDate.text = content.release
                tvRating.text = content.rating.toString()
                tvOverview.text = content.overview

                Glide.with(itemView.context)
                    .load(IMAGE_URL + content.poster)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                    .into(imgPoster)

                itemView.setOnClickListener {
                    callback.onItemClicked(content)
                }
            }
        }

    }
}