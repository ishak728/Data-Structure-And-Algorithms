package com.example.datastructureandalgorithms
fun main() {
    val input = "programming"
    val result = firstNonRepeatingChar(input)
    println("result->> $result")
}

fun firstNonRepeatingChar(s: String): Char? {
    val map = mutableMapOf<Char, Int>()


    for (char in s) {
        map[char] = map.getOrDefault(char, 0) + 1
    }


    for (char in s) {
        if (map[char] == 1) {
            return char
        }
    }

    return null
}
