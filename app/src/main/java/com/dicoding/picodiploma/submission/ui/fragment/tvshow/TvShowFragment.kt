package com.dicoding.picodiploma.submission.ui.fragment.tvshow

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.picodiploma.submission.data.source.local.entity.DataEntity
import com.dicoding.picodiploma.submission.databinding.FragmentTvShowBinding
import com.dicoding.picodiploma.submission.ui.detail.DetailActivity
import com.dicoding.picodiploma.submission.ui.fragment.ContentAdapter
import com.dicoding.picodiploma.submission.ui.fragment.ContentCallback
import com.dicoding.picodiploma.submission.ui.fragment.ContentViewModel
import com.dicoding.picodiploma.submission.viemodel.ViewModelFactory


class TvShowFragment : Fragment(), ContentCallback {

    companion object {
        const val TYPE_TVSHOW = "type_tvshow"
    }

    private lateinit var binding: FragmentTvShowBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTvShowBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {

            binding.progressBar.isVisible = true


            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[ContentViewModel::class.java]
            val tvShowAdapter = ContentAdapter(this)
            val tvShow = viewModel.getTvShows()

            tvShow.observe(viewLifecycleOwner, { tvShow ->
                binding.progressBar.isVisible = false
                tvShowAdapter.setContent(tvShow)
                tvShowAdapter.notifyDataSetChanged()
            })

            with(binding.rvTvShow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = tvShowAdapter
            }
        }
    }

    override fun onItemClicked(data: DataEntity) {
        startActivity(
            Intent(context, DetailActivity::class.java)
                .putExtra(DetailActivity.EXTRA_DATA, data.id)
                .putExtra(DetailActivity.EXTRA_TYPE, TYPE_TVSHOW)
        )
    }


}