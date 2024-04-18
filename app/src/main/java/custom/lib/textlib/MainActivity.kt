package custom.lib.textlib

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import custom.lib.text_application.LargeText
import custom.lib.text_application.PrimaryText
import custom.lib.text_application.SecondaryText
import custom.lib.text_application.SmallText
import custom.lib.textlib.ui.theme.TextLibTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextLibTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        LargeText(value = "Large Text", color = Color.Black)
                        PrimaryText(value = "Primary Text", color = Color.Black)
                        SecondaryText(value = "Secondary Text", color = Color.Black)
                        SmallText(value = "Small Text", color = Color.Black)
                    }
                }
            }
        }
    }
}

