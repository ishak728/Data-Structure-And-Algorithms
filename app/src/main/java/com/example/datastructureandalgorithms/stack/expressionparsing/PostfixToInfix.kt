package com.example.datastructureandalgorithms.stack.expressionparsing

fun main() {
    val postfix = "abc*+d-"
    val infix = postfixToInfix(postfix)
    println("Infix: $infix")
}

fun postfixToInfix(postfix: String): String {
    val stack=ArrayDeque<String>()

    for (i in postfix){
        when{
            i.isLetterOrDigit()->stack.addFirst(i.toString())
            i in "+-*/"->{
                val right=stack.removeFirst()
                val left=stack.removeFirst()
                stack.addFirst("$left$i$right")
            }
        }
    }
    return stack.first()
}

