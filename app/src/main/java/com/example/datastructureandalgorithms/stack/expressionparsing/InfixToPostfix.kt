package com.example.datastructureandalgorithms.stack.expressionparsing

fun precedence(a: Char): Int {
    return when (a) {
        '+', '-' -> 1
        '*', '/' -> 2
        else -> -1
    }
}

fun main() {
    val expression = "a+b*c-d"
    val postfix = infixToPostfix(expression)
    println("Postfix: $postfix")
}

fun infixToPostfix(expression: String): String {

    val stack = ArrayDeque<Char>()
    val postfixExpression = StringBuilder()

    for (i in expression) {

        when {
            i.isLetterOrDigit() -> postfixExpression.append(i)

            i == '(' -> stack.addFirst(i)

            i == ')' -> {
                while (stack.isNotEmpty() && stack.first() != '(') {
                    postfixExpression.append(stack.removeFirst())
                }
                if (stack.isNotEmpty() && stack.first() == '(') {
                    stack.removeFirst()
                }
            }

            i in "+-*/" -> {
                while (stack.isNotEmpty() && precedence(i) <= precedence(stack.first())) {
                    postfixExpression.append(stack.removeFirst())
                }
                stack.addFirst(i)
            }
        }
    }

    while (stack.isNotEmpty()) {
        postfixExpression.append(stack.removeFirst())
    }

    return postfixExpression.toString()

}