package com.kavi.calculator.actions

sealed class CalculatorActions {

    data class Number(val number: Int): CalculatorActions()
    object Clear: CalculatorActions()
    object Decimal: CalculatorActions()
    object Calculate: CalculatorActions()
    object Delete: CalculatorActions()

    data class Operations(val operations: CalculationOperations): CalculatorActions()
}