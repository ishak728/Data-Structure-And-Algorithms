package com.example.datastructureandalgorithms.stack.expressionparsing


fun main() {
    val expression = "a+b*c-d"
    val prefix = infixToPrefix(expression)
    println("Prefix: $prefix")
}

fun reverseAndSwap(expr: String): String {
    val reversed = expr.reversed()
    return reversed.map {
        when (it) {
            '(' -> ')'
            ')' -> '('
            else -> it
        }
    }.joinToString("")
}

fun infixToPrefix(expression: String): String {


    val reversedExpr = reverseAndSwap(expression)
    val postfix = infixToPostfix(reversedExpr)
    return postfix.reversed()
}
