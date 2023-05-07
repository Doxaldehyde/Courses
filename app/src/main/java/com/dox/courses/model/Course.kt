package com.dox.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Course(@StringRes val name: Int, val availableCourses: Int, @DrawableRes val imageRes: Int)
