package com.leandro.desafio_mobile.data.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class RottenTomatoe(
    val audienceRating: String,
    val audienceScore: String,
    val criticsRating: String,
    val criticsScore: String,
    val id: String,
    val originalUrl: String
) : Parcelable