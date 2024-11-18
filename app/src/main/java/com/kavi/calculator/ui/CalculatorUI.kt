package com.kavi.calculator.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kavi.calculator.actions.CalculationOperations
import com.kavi.calculator.actions.CalculatorActions
import com.kavi.calculator.state.CalculationState

@Composable
fun CalculatorUI(
    state: CalculationState,
    buttonSpacing: Dp = 16.dp,
    modifier: Modifier,
    onAction: (CalculatorActions) -> Unit
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)

    ) {
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .background(MaterialTheme.colorScheme.background),

            verticalArrangement = Arrangement.spacedBy(buttonSpacing)

        ) {
            Text(
                text = state.previous,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding( horizontal = 20.dp),
                fontWeight = FontWeight.Normal,
                fontSize = 18.sp,
                color = MaterialTheme.colorScheme.onPrimary,
                maxLines = 1
            )

            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp)
                    .padding(bottom = 30.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 36.sp,
                color = MaterialTheme.colorScheme.onPrimary,
                maxLines = 2,
                lineHeight = 44.sp
            )

            /*
        first row
         */
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "C",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.primary)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Clear)
                    }
                )

                CalculatorButton(
                    symbol = "del",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surface)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Delete)
                    }
                )

                CalculatorButton(
                    symbol = "%",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surface)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operations(CalculationOperations.Mod))
                    }
                )

                CalculatorButton(
                    symbol = "÷",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surface)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operations(CalculationOperations.Divide))
                    }
                )
            }

            /*
            second row
             */
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "7",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surface)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(7))
                    }
                )
                CalculatorButton(
                    symbol = "8",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surface)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(8))
                    }
                )
                CalculatorButton(
                    symbol = "9",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surface)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(9))
                    }
                )
                CalculatorButton(
                    symbol = "x",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surface)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operations(CalculationOperations.Multiple))
                    }
                )
            }

            /*
            third row
             */
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "4",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surface)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(4))
                    }
                )
                CalculatorButton(
                    symbol = "5",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surface)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(5))
                    }
                )
                CalculatorButton(
                    symbol = "6",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surface)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(6))
                    }
                )
                CalculatorButton(
                    symbol = "-",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surface)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operations(CalculationOperations.Subtract))
                    }
                )
            }

            /*
            fourth row
             */
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "1",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surface)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(1))
                    }
                )
                CalculatorButton(
                    symbol = "2",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surface)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(2))
                    }
                )
                CalculatorButton(
                    symbol = "3",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surface)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(3))
                    }
                )
                CalculatorButton(
                    symbol = "+",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surface)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operations(CalculationOperations.Add))
                    }
                )
            }

            /*
            sixth row
             */
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .padding(bottom = 20.dp),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)

            ) {

                CalculatorButton(
                    symbol = "0",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surface)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(0))
                    }
                )

                CalculatorButton(
                    symbol = "00",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surface)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(0))
                        onAction(CalculatorActions.Number(0))
                    }
                )



                CalculatorButton(
                    symbol = ".",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surface)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Decimal)
                    }
                )

                CalculatorButton(
                    symbol = "=",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surface)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Calculate)
                    }
                )
            }
        }
    }
}