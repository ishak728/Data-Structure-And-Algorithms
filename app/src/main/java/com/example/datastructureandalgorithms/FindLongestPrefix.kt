package com.example.datastructureandalgorithms

//Find longest prefix from a list of strings.
fun main() {
    val input1 = listOf("flow", "fl")
    println(findLongestPrefix(input1))
}

fun findLongestPrefix(list: List<String>): String {

    var prefix = ""
    val first = list[0]
    for (i in 0 until first.length) {
        for (j in 1 until list.size) {
            if (i >= list[j].length || first[i] != list[j][i]) {

                return prefix
            }
        }
        prefix += first[i]
    }
    return prefix
}