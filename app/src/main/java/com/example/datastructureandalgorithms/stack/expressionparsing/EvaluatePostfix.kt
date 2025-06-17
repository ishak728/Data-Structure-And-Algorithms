package com.example.datastructureandalgorithms.stack.expressionparsing

fun evaluatePostfix(expression: String): Int {
    val stack = ArrayDeque<Int>()

    for (i in expression) {
        when {
            i.isDigit() -> stack.addFirst(i.toString().toInt())

            i in "+-*/" -> {
                val right = stack.removeFirst()
                val left = stack.removeFirst()
                val result = when (i) {
                    '+' -> left + right
                    '-' -> left - right
                    '*' -> left * right
                    '/' -> left / right
                    else -> throw IllegalArgumentException("Unknown operator")
                }
                stack.addFirst(result)
            }
        }
    }

    return stack.first()
}


fun main() {
    val postfix = "149*+7-"
    val result = evaluatePostfix(postfix)
    println("Result: $result")
}


