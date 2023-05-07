package com.dox.courses.data

import com.dox.courses.R
import com.dox.courses.model.Course

class Datasource {
    fun loadCourses(): List<Course>{
        return listOf<Course>(
            Course(R.string.architecture, availableCourses = 12, R.drawable.architecture),
            Course(R.string.music, availableCourses = 134, R.drawable.music),
            Course(R.string.tech, availableCourses = 232, R.drawable.tech),
            Course(R.string.photography, availableCourses = 213, R.drawable.photography),
            Course(R.string.painting, availableCourses = 45, R.drawable.painting),
            Course(R.string.lifestyle, availableCourses = 33, R.drawable.lifestyle),
            Course(R.string.gaming, availableCourses = 3, R.drawable.gaming),
            Course(R.string.film, availableCourses = 19, R.drawable.film),
            Course(R.string.fashion, availableCourses = 15, R.drawable.fashion),
            Course(R.string.drawing, availableCourses = 8, R.drawable.drawing),
            Course(R.string.culinary, availableCourses = 67, R.drawable.culinary),
            Course(R.string.design, availableCourses = 28, R.drawable.design),
            Course(R.string.crafts, availableCourses = 184, R.drawable.crafts),
            Course(R.string.business, availableCourses = 77, R.drawable.business),
            Course(R.string.architecture, availableCourses = 12, R.drawable.architecture),
            Course(R.string.music, availableCourses = 134, R.drawable.music),
            Course(R.string.tech, availableCourses = 232, R.drawable.tech),
            Course(R.string.photography, availableCourses = 213, R.drawable.photography),
            Course(R.string.painting, availableCourses = 45, R.drawable.painting),
            Course(R.string.lifestyle, availableCourses = 33, R.drawable.lifestyle),
            Course(R.string.gaming, availableCourses = 3, R.drawable.gaming),
            Course(R.string.film, availableCourses = 19, R.drawable.film),
            Course(R.string.fashion, availableCourses = 15, R.drawable.fashion),
            Course(R.string.drawing, availableCourses = 8, R.drawable.drawing),
            Course(R.string.culinary, availableCourses = 67, R.drawable.culinary),
            Course(R.string.design, availableCourses = 28, R.drawable.design),
            Course(R.string.crafts, availableCourses = 184, R.drawable.crafts),
            Course(R.string.business, availableCourses = 77, R.drawable.business)
                )
    }
}