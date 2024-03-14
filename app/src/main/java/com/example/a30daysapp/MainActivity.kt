package com.example.a30daysapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30daysapp.data.Datasource
import com.example.a30daysapp.model.Dinner
import com.example.a30daysapp.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DinnerApp()
                }
            }
        }
    }
}

@Composable
fun DinnerApp(modifier: Modifier = Modifier) {
    DinnerList(dinnerList = Datasource().LoadDinners())
}

@Composable
fun TopAppBar(modifier: Modifier = Modifier){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Text(
            text = "30 Days of health dinners",
            style = MaterialTheme.typography.labelLarge,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
    }
}

@Composable
fun DinnerList(dinnerList: List<Dinner>, modifier: Modifier = Modifier){
    Scaffold(
        topBar = {
            TopAppBar()
        }
    ) {
        it ->
        LazyColumn(contentPadding = it){
            items(dinnerList) {
                DinnerCard(
                    dinnerInfo = it,
                    modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_medium))) }
        }
    }
}

@Composable
fun DinnerCard(dinnerInfo: Dinner, modifier: Modifier = Modifier){

    var expanded by remember { mutableStateOf(false) }

    Card(modifier = modifier){
        Column (
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 4.dp)
                .animateContentSize(animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessMedium
                ))
        ){
            Text(
                text = "Day ${stringResource(id = dinnerInfo.day)}",
                style = MaterialTheme.typography.displaySmall)
            Text(
                text = stringResource(id = dinnerInfo.title),
                style = MaterialTheme.typography.labelMedium,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Image(
                painter = painterResource(id = dinnerInfo.image),
                contentDescription = stringResource(id = dinnerInfo.day),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(dimensionResource(id = R.dimen.image_height))
                    .clickable { expanded = !expanded}
                    .clip(MaterialTheme.shapes.small),
                contentScale = ContentScale.Crop
            )
            if(expanded){
                Text(
                    text = stringResource(id = dinnerInfo.recipe),
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(top = 12.dp)
                )
            }
        }
    }
}


@Preview
@Composable
fun GreetingPreview() {
    //Use 'useDarkTheme = true' to show dark mode
    AppTheme(useDarkTheme = false){
        DinnerApp()
    }
}