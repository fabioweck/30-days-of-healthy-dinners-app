package com.example.a30daysapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Dinner(
    val day: Int,
    @StringRes val title: Int,
    @DrawableRes val image: Int,
    @StringRes val recipe: Int
)
