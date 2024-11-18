package com.kavi.calculator.ui

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EqualityButton(
    symbol: String,
    modifier: Modifier,
    onClick: () -> Unit
){
    val textVisible by remember { mutableStateOf(true) }
    val scale by animateFloatAsState(if (textVisible) 1f else 0.5f)

    Box(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.surface)
            .clickable { onClick() }
            .scale(scale)
    ) {
        Text(
            text = symbol,
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            color = Color.Blue,
            modifier = Modifier
                .padding(26.dp)

        )
    }


}

@PreviewLightDark
@Composable
fun EqualityButtonPreview() {
    EqualityButton(symbol = "+", Modifier,onClick = {})
}

