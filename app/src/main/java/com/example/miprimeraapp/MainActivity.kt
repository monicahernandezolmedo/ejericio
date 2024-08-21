package com.example.miprimeraapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.miprimeraapp.ui.theme.MiPrimeraAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiPrimeraAppTheme {

            }
        }
    }
}

@Composable
fun CertificatingCourse(nombre:String, modifier: Modifier = Modifier){
  Column(
      modifier = modifier
          .fillMaxSize()
          .padding(10.dp),

      verticalArrangement = Arrangement.Center,
    //  horizontalAlignment = Alignment.CenterHorizontally
  ) {

      Box(
          contentAlignment = Alignment.Center
      ) {
          Image(
              painter =
              painterResource(id = R.drawable.android_logo),
              contentDescription = null,
              modifier = modifier.fillMaxWidth(),
              alpha = 0.2F
          )

          Text(
              text = "$nombre",
              fontSize = 25.sp,
              fontWeight = FontWeight.Bold,
              textAlign = TextAlign.Center,
              modifier = modifier.fillMaxWidth()
          )
      }
      Spacer(modifier = modifier.height(25.dp))
          Text(
              text = "has successfully completed " +
                      "a 2 hours  course on"
          )

  }
}

@Composable
@Preview(showBackground = true)
fun CertificatingCoursePreview(){
    
    CertificatingCourse(nombre = "Jorge Armando Rodríguez Vera")
}