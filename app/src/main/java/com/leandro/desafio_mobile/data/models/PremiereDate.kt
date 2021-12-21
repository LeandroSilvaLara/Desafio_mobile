package com.leandro.desafio_mobile.data.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class PremiereDate(
    val localDate: String, val isToday: Boolean,
    val dayOfWeek: String, val dayAndMonth: String,
    val hour: String, val year: Int
) : Parcelable
