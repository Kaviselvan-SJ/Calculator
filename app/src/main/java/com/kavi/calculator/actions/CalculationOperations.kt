package com.kavi.calculator.actions

sealed class CalculationOperations(val symbol: String){
    object Add: CalculationOperations("+")
    object Subtract: CalculationOperations("-")
    object Multiple: CalculationOperations("x")
    object Divide: CalculationOperations("÷")
    object Mod: CalculationOperations("%")
}