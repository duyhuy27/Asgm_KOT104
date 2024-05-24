package com.dev.asgm_kot104.data

import androidx.annotation.DrawableRes

data class Product (val id: Int, val name: String, val price: Double, val image: String, var isSelected: Boolean = false) {
}
data class Products (val id: Int, val name: String, val price: Double, @DrawableRes val image: Int, var isSelected: Boolean = false) {
}

data class ProductModel(
    val id: String,
    val nameProduct: String,
    val imgProduct: String,
    val priceProduct: Int,
    val rate: Int
) {}