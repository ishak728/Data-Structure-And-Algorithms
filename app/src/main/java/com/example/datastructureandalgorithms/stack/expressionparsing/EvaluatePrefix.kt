package com.example.datastructureandalgorithms.stack.expressionparsing

fun evaluatePrefix(expression: String): Int {
    val stack = ArrayDeque<Int>()

    for (i in expression.length - 1 downTo 0) {
        val j = expression[i]

        when {
            j.isDigit() -> stack.addFirst(j.toString().toInt())

            j in "+-*/" -> {
                val left = stack.removeFirst()
                val right = stack.removeFirst()
                val result = when (j) {
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
    val prefix = "-+2*11 9"
    val result = evaluatePrefix(prefix)
    println("Result: $result")
}
