package com.kavi.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kavi.calculator.ui.CalculatorUI
import com.kavi.calculator.ui.theme.CalculatorTheme
import com.kavi.calculator.viewmodel.CalculationViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculatorTheme {
                val viewModel = viewModel<CalculationViewModel>()
                val state = viewModel.state
                CalculatorUI(
                    state = state,
                    onAction = viewModel::onAction,
                    modifier = Modifier
                        .background(Color.White)
                )
            }
        }
    }
}


@PreviewLightDark
@Composable
fun Preview() {
    val viewModel = viewModel<CalculationViewModel>()
    val state = viewModel.state
    CalculatorUI(
        state = state,
        onAction = viewModel::onAction,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(16.dp)

    )
}
