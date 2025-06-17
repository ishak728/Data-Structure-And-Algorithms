package com.example.datastructureandalgorithms.stack.expressionparsing





fun calculate(a: Int, b: Int, op: Char): Int {
    return when (op) {
        '+' -> a + b
        '-' -> a - b
        '*' -> a * b
        '/' -> a / b
        else -> throw IllegalArgumentException("Invalid operator")
    }
}

fun evaluateInfix(expression: String): Int {
    val values = ArrayDeque<Int>()
    val operators = ArrayDeque<Char>()
    var i = 0

    while (i < expression.length) {
        val ch = expression[i]

        when {

            ch == '(' -> {
                operators.addFirst(ch)
            }


            // TODO//: important
            //  To convert '4' (a Char) into 4 (an Int), we do:'4' - '0' = 4

            ch.isDigit() -> {
                var num = 0
                while (i < expression.length && expression[i].isDigit()) {
                    num = num * 10 + (expression[i] - '0')
                    i++
                }
                values.addFirst(num)
                continue
            }

            ch == ')' -> {
                while (operators.isNotEmpty() && operators.first() != '(') {
                    val b = values.removeFirst()
                    val a = values.removeFirst()
                    val op = operators.removeFirst()
                    values.addFirst(calculate(a, b, op))
                }
                operators.removeFirst()
            }

            ch in "+-*/" -> {
                while (operators.isNotEmpty() &&
                    precedence(ch) <= precedence(operators.first())) {
                    val b = values.removeFirst()
                    val a = values.removeFirst()
                    val op = operators.removeFirst()
                    values.addFirst(calculate(a, b, op))
                }
                operators.addFirst(ch)
            }
        }

        i++
    }

    while (operators.isNotEmpty()) {
        val b = values.removeFirst()
        val a = values.removeFirst()
        val op = operators.removeFirst()
        values.addFirst(calculate(a, b, op))
    }

    return values.first()
}



fun main() {

    val result = evaluateInfix("(2+1)*5-8")
    println("Result: $result")
}
