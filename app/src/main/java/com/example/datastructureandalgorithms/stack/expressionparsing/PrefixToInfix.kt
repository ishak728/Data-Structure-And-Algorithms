package com.example.datastructureandalgorithms.stack.expressionparsing



fun prefixToInfix(expression: String): String {
    val stack = ArrayDeque<String>()

    for (i in expression.length - 1 downTo 0) {
        val j = expression[i]

        when {
            j.isLetterOrDigit() -> stack.addFirst(j.toString())

            j    in "+-*/"-> {
                val op1 = stack.removeFirst()
                val op2 = stack.removeFirst()
                val newExpr = "($op1$j$op2)"
                stack.addFirst(newExpr)
            }
        }
    }

    return stack.first()
}


fun main() {
    val prefix = "-+a*bc d"
    val infix = prefixToInfix(prefix.replace(" ", ""))
    println("Infix: $infix")
}

