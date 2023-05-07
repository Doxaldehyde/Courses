package com.dox.courses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dox.courses.data.Datasource
import com.dox.courses.model.Course
import com.dox.courses.ui.theme.CoursesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoursesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   courseApp()
                }
            }
        }
    }
}
@Composable
fun courseApp(){
        CoursesTheme {
        courseList(courseList = Datasource().loadCourses())
        }

}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun courseList(courseList: List<Course>, modifier: Modifier = Modifier){
    LazyVerticalGrid(
        cells = GridCells.Fixed(2) ,
        content = {
            items(courseList){
                course -> courseCard(course)
            }
        }
    )
}

@Composable
fun courseCard(course: Course, modifier: Modifier = Modifier){
    Card(modifier = Modifier.padding(5.dp),
    elevation = 4.dp) {
        Row{
            Image(painter = painterResource(id = course.imageRes), contentDescription = null,
            modifier = Modifier
                .size(width = 68.dp, height = 68.dp)
                .aspectRatio(1f))
            Column{
                Text(text = stringResource(id = course.name),
                modifier = Modifier.padding(10.dp))
                Row{
                    Icon(painter = painterResource(id = R.drawable.ic_grain), contentDescription = null,
                    modifier = Modifier.padding(start = 10.dp))
                    Text(text = course.availableCourses.toString(),
                    modifier = Modifier.padding(start = 10.dp))
                }
            }
        }

    }

}


@Preview
@Composable
private fun courseCardPreview(){
    courseCard(Course(R.string.architecture, availableCourses = 12, R.drawable.architecture))
}
