package custom.lib.text_application

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

@Composable
fun PrimaryText(
    value: String,
    color: Color,
    modifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Start,
    fontWeight: FontWeight = FontWeight.Normal,
    maxLines: Int = Int.MAX_VALUE,
) {
    Constructor(
        value = value,
        modifier = modifier,
        textAlign = textAlign,
        fontWeight = fontWeight,
        maxLines = maxLines,
        color = color,

        style = MaterialTheme.typography.titleLarge,
    )
}

@Composable
fun SecondaryText(
    value: String,
    color: Color,
    modifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Start,
    fontWeight: FontWeight = FontWeight.Normal,
    maxLines: Int = Int.MAX_VALUE,
) {
    Constructor(
        value = value,
        modifier = modifier,
        textAlign = textAlign,
        fontWeight = fontWeight,
        maxLines = maxLines,
        color = color,

        style = MaterialTheme.typography.titleSmall,
    )
}

@Composable
fun SmallText(
    value: String,
    color: Color,
    modifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Start,
    fontWeight: FontWeight = FontWeight.Normal,
    maxLines: Int = Int.MAX_VALUE,
) {
    Constructor(
        value = value,
        modifier = modifier,
        textAlign = textAlign,
        fontWeight = fontWeight,
        maxLines = maxLines,
        color = color,

        style = MaterialTheme.typography.bodySmall,
    )
}





@Composable
private fun Constructor(
    value: String,
    modifier: Modifier,
    textAlign: TextAlign,
    fontWeight: FontWeight,
    style: TextStyle,
    maxLines: Int,
    color: Color,
) {
    Text(
        text = value,
        modifier = modifier,
        textAlign = textAlign,
        fontWeight = fontWeight,
        style = style,
        maxLines = maxLines,
        color = color
    )
}