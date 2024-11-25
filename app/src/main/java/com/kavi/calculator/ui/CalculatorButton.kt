package com.kavi.calculator.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    symbol : String,
    modifier: Modifier = Modifier,
    onClick : () -> Unit
){
    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(CircleShape)
            .clickable { onClick() }
            .then(modifier)

    ) {
        Text(
            text = symbol,
            fontSize = 22.sp,
            color = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}


@PreviewLightDark
@Composable
fun ButtonPreview(){
    CalculatorButton("+",Modifier, onClick = {})
}