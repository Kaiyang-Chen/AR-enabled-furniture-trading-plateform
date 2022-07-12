package cn.edu.sjtu.arf.kotlin.product

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Product(
    var uID: String? = null,
    var name: String? = null,
    var description: String? = null,
    var owner: String? = null,
    var primary_class: String? = null,
    var secondary_class: String? = null,
    var color_style: String? = null,
    var price: Float? = null,
    var sold_state: String? = null
    ):Parcelable
