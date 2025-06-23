package com.example.datastructureandalgorithms


//Question:
//Given two strings s1 and s2, remove all characters in s1 that are also present in s2.
//
//Example 1:
//Input: s1 = "hello world", s2 = "od"
//Output: "hell wrl"
//
//Example 2:
//Input: s1 = "abcde", s2 = "bce"
//Output: "ad"


//time and space complexity: o(n+m)

fun main() {
    val s1 = "abcde"
    val s2 = "bce"
    println(removeCharacters(s1, s2))
}

fun removeCharacters(s1: String, s2: String): StringBuilder {

    val remove = s2.toSet()
    val newString = StringBuilder()

    for (i in s1) {
        if (!remove.contains(i)) {
            newString.append(i)
        }
    }
    return newString

}


