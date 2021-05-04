package com.dicoding.picodiploma.submission.ui.fragment

import com.dicoding.picodiploma.submission.data.DataEntity

interface ContentCallback {
    fun onItemClicked(data: DataEntity)
}