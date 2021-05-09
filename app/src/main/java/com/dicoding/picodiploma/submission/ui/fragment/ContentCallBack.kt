package com.dicoding.picodiploma.submission.ui.fragment

import com.dicoding.picodiploma.submission.data.source.local.entity.DataEntity

interface ContentCallback {
    fun onItemClicked(data: DataEntity)
}