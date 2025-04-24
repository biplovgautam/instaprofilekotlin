package com.example.profilesection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profilesection.ui.theme.ProfilesectionTheme
import java.time.format.TextStyle
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.alpha


class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
            setContent {
                Scaffold { innerPadding ->
                    Column(modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize()
                        .background(color= Color.Red)
                    ) {

                    }
                }
        }
    }
}

@Composable
fun ProfileBody(innerPadding: PaddingValues){
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .background(color = Color.White)

    ) {
        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            //method 1
            Icon(
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = null, modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
                )
            Text(text = "Biplov", style = androidx.compose.ui.text.TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            )
            // method2
            Icon(
                painter = painterResource(R.drawable.baseline_more_horiz_24),
                contentDescription = null, modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
                    .clickable {
                    }
            )
        }

        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            //method 1
            Image(
                painter = painterResource(R.drawable.krisna),
                contentDescription = null, modifier = Modifier
                    .height(100.dp)
                    .width(100.dp).clip(shape = RoundedCornerShape(100.dp))
            )
//            method 2
//            Image(
//                painter = painterResource(R.drawable.krisna),
//                contentDescription = null,
//                modifier = Modifier
//                    .height(100.dp)
//                    .width(100.dp)
//                    .clip(CircleShape)
//            )
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "174")
                Text(text = "Posts")
            }
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "772k")
                Text(text = "Followers")
            }
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "714")
                Text(text = "Following")
            }

        }
        Column(modifier = Modifier.padding(horizontal = 20.dp), verticalArrangement = Arrangement.Center,)
        {
            Text(text = "Biplov Gautam", style = androidx.compose.ui.text.TextStyle(fontWeight = FontWeight.Bold))
            Text(text = "Coder", modifier = Modifier.alpha(alpha = 0.5f))
            Text(text = "Cs Student")
            Text(text = "madhavbiplov@gmail.com")
            Text(text = "Followed by elon_musk and sam_alt")
        }
        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically)
        {
            Button(onClick = {},
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black,
                    contentColor = Color.White
                )) {
                Text("Follow")
            }
            OutlinedButton(onClick = {},
                shape = RoundedCornerShape(10.dp),
                border = BorderStroke(1.dp,Color.Gray)) {
                Text("Message")
            }
            OutlinedButton(onClick = {},
                shape = RoundedCornerShape(10.dp),
                border = BorderStroke(1.dp,Color.Gray)) {
                Text("Email")
            }
            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = null, modifier = Modifier
                    .height(20.dp)
                    .width(20.dp)
            )

        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProfile(){
    ProfileBody(innerPadding = PaddingValues(0.dp))
}