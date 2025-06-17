package com.example.datastructureandalgorithms.stack.expressionparsing

fun prefixToPostfix(prefix: String): String {
    val stack = ArrayDeque<String>()

    for (i in prefix.length - 1 downTo 0) {
        val j = prefix[i]

        when {
            j.isLetterOrDigit() -> stack.addFirst(j.toString())

            j in "+-*/"-> {
                val op1 = stack.removeFirst()
                val op2 = stack.removeFirst()
                val newExpr = op1 + op2 + j
                stack.addFirst(newExpr)
            }
        }
    }

    return stack.first()
}


fun main() {
    val prefix = "-+a*bcd"
    val postfix = prefixToPostfix(prefix)
    println("Postfix: $postfix")
}
