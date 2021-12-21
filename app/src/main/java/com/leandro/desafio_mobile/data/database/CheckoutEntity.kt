package com.leandro.desafio_mobile.data.database

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CheckoutEntity(
    var seat: String? = "",
    var price: String? = ""
) : Parcelable