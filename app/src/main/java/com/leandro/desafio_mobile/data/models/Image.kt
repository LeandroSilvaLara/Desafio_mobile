package com.leandro.desafio_mobile.data.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Image(
    val type: String,
    val url: String
) : Parcelable