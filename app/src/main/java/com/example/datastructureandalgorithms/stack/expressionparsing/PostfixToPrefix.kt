package com.example.datastructureandalgorithms.stack.expressionparsing

fun postfixToPrefix(postfix: String): String {
    val stack = ArrayDeque<String>()

    for (j in postfix) {
        when {
            j.isLetterOrDigit() -> stack.addFirst(j.toString())

            j  in "+-*/"-> {
                val op2 = stack.removeFirst()
                val op1 = stack.removeFirst()
                val newExpr = j + op1 + op2
                stack.addFirst(newExpr)
            }
        }
    }

    return stack.first()
}


fun main() {
    val postfix = "abc*+d-"
    val prefix = postfixToPrefix(postfix)
    println("Prefix: $prefix")
}
