package com.example.datastructureandalgorithms

fun isParenthesesBalanced(expression: String): Boolean {
    val stack = ArrayDeque<Char>()

    for (ch in expression) {
        when (ch) {
            '(', '[', '{' -> {
                stack.addFirst(ch)
            }


            ')', ']', '}' -> {
                if (stack.isEmpty()) return false
                val t = stack.removeFirst()
                if ((ch == ')' && t != '(') ||
                    (ch == ']' && t != '[') ||
                    (ch == '}' && t != '{')) {
                    return false
                }
            }
        }
    }
    return stack.isEmpty()
}

fun main() {
    val i1 = "((a+b)*c)"
  

    println(isParenthesesBalanced(i1))
    
}
