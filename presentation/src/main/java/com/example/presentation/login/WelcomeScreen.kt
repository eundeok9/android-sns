package com.example.presentation.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.presentation.component.FCButton
import com.example.presentation.theme.FastcampusSNSTheme

@Composable
fun WelcomeScreen() {
    Surface {
        Box(Modifier.fillMaxSize(),
            contentAlignment = Alignment.TopCenter
        ) {
            Column(Modifier.padding(top = 48.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                    Text(
                        text = "Connected",
                        style = MaterialTheme.typography.displayLarge,
                    )
                Text(
                    text = "Your favorite social network",
                    style = MaterialTheme.typography.labelLarge,
                )
            }

            FCButton(modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth()
                .padding(bottom = 24.dp)
                .align(alignment = Alignment.BottomCenter)
                .height(48.dp),
                text = "로그인",
                onClick = {}
            )
        }
    }
}

@Preview
@Composable
private fun WelcomeScreenPreview() {
    FastcampusSNSTheme {
        WelcomeScreen()
    }
}