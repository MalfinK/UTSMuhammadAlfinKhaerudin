package com.example.utsmuhammadalfinkhaerudin.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Matkul (
    @StringRes val name_matkul: Int,
    @StringRes val sks_matkul: Int,
    @DrawableRes val image_matkul: Int
)