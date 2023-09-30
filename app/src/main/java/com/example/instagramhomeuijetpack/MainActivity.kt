package com.example.instagramhomeuijetpack

import android.os.Bundle
import android.text.Layout.Alignment
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramhomeuijetpack.ui.theme.InstagramHomeUiJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramHomeUiJetpackTheme {

                ProfileScreen()
            }
        }
    }
}

@Composable
fun ProfileScreen() {

    Surface(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {
        
        Column(modifier = Modifier.fillMaxSize()) {

            Row(modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .padding(start = 10.dp, end = 10.dp, top = 10.dp),) {

                Text(text = "vatannet",
                fontSize = 24.sp,
                    color = Color.Black
                )
                Column(modifier = Modifier
                    .size(30.dp)
                    .padding(start = 3.dp),
                verticalArrangement = Arrangement.Center) {
                    Image(painterResource(id = R.drawable.expend),
                        contentDescription = "" , modifier = Modifier
                            .size(15.dp)
                    )
                }

                Spacer(modifier = Modifier.weight(1f))


                Row(
                    Modifier
                        .height(40.dp)
                        .width(80.dp)
                        .padding(top = 5.dp)) {

                    Image(painterResource(id = R.drawable.instapost)
                        , contentDescription = "", Modifier.size(25.dp))

                    Spacer(modifier = Modifier.width(20.dp))
                    Image(painterResource(id = R.drawable.haburger)
                        , contentDescription = "", Modifier.size(25.dp))

                }


                
            }

            Row(modifier = Modifier
                .fillMaxWidth()
                .height(140.dp)) {
                Image(painterResource(id = R.drawable.video),
                    contentDescription ="" ,
                modifier = Modifier
                    .padding(top = 20.dp, start = 15.dp)
                    .clip(CircleShape)
                    .size(96.dp)
                    .border(BorderStroke
                        (width = 5.dp, color = Color.Gray)
                        , shape = CircleShape)
                )

                Column(Modifier.fillMaxHeight().width(80.dp).padding(start = 20.dp),
                  verticalArrangement = Arrangement.Center) {
                    Text(text = "36")
                    Text(text = "Posts")
                }

                Column(Modifier.fillMaxHeight().width(100.dp).padding(start = 10.dp),
                    verticalArrangement = Arrangement.Center) {
                    Text(text = "6.575")
                    Text(text = "Followers")
                }

                Column(Modifier.fillMaxHeight().width(100.dp).padding(start = 10.dp),
                    verticalArrangement = Arrangement.Center) {
                    Text(text = "359")
                    Text(text = "Following")
                }
            }







            
        }
        
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    InstagramHomeUiJetpackTheme {
       ProfileScreen()
    }
}