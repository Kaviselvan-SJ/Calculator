package com.kavi.calculator.state

import com.kavi.calculator.actions.CalculationOperations

data class CalculationState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculationOperations? = null,
    val previous: String = ""
)