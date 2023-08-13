package com.leo.greetingcard

import android.util.Log

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.leo.greetingcard.ui.theme.AppTheme

private const TAG = "MainActivity"
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent { AppTheme { JetpackCompose() } }
    logging()
  }
  fun logging() {
      Log.v(TAG, "Hello world")
  }
}

@Preview
@Composable
fun JetpackCompose() {
  Column(
      Modifier.fillMaxWidth().fillMaxHeight(),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally) {
    Text(
        text = "Jetpack Compose in AndroidIDE!",
        style = MaterialTheme.typography.h2,
        fontSize = 24.sp,
        textAlign = TextAlign.Center)
  }
}
