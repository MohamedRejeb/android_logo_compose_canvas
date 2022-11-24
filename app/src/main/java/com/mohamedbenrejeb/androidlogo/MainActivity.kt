package com.mohamedbenrejeb.androidlogo

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.Typeface
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mohamedbenrejeb.androidlogo.ui.theme.AndroidLogoTheme
import com.mohamedbenrejeb.androidlogo.ui.theme.avantGardeGothic

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidLogoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        AndroidLogoCanvas()

                        Text(
                            text = "android",
                            style = MaterialTheme.typography.displayLarge,
                            fontFamily = avantGardeGothic,
                            modifier = Modifier.offset(y = 48.dp)
                        )
                    }

                }
            }
        }
    }
}

@Composable
fun AndroidLogoCanvas() {
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        val canvasWidth = size.width
        val canvasHeight = size.height
        val androidGreenColor = Color(0xFF3ddb87)

        drawCircle(
            color = androidGreenColor,
            center = Offset(x = canvasWidth / 2, y = canvasHeight / 2),
            radius = size.minDimension / 4
        )

        drawRect(
            color = Color.White,
            topLeft = Offset(
                x = 0f,
                y = canvasHeight / 2
            )
        )

        drawLine(
            color = androidGreenColor,
            start = Offset(
                x = canvasWidth * (5f / 9f),
                y = canvasHeight * (3f / 7f)
            ),
            end = Offset(
                x = canvasWidth * (6f / 9f),
                y = canvasHeight * (1f /3f)
            ),
            strokeWidth = 20f,
            cap = StrokeCap.Round
        )

        drawLine(
            color = androidGreenColor,
            start = Offset(
                x = canvasWidth * (4f / 9f),
                y = canvasHeight * (3f / 7f)
            ),
            end = Offset(
                x = canvasWidth * (3f / 9f),
                y = canvasHeight * (1f /3f)
            ),
            strokeWidth = 20f,
            cap = StrokeCap.Round
        )

        drawCircle(
            color = Color.White,
            center = Offset(
                x = canvasWidth * (2f / 5f),
                y = canvasHeight * (3f / 7f)
            ),
            radius = size.minDimension / 48
        )

        drawCircle(
            color = Color.White,
            center = Offset(
                x = canvasWidth * (3f / 5f),
                y = canvasHeight * (3f / 7f)
            ),
            radius = size.minDimension / 48
        )
    }
}