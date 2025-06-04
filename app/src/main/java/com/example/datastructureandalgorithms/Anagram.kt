package com.example.datastructureandalgorithms

fun main() {
    val words = listOf("listen", "silent", "enlist")
    isAnagram(words)


}

fun isAnagram(words: List<String>) {

    val freqMap = words[0].groupingBy { it }.eachCount()
    var count = 0

    for (i in words) {
        val newFreqMap = i.groupingBy { it }.eachCount()
        if (freqMap == newFreqMap) {
            count++
        }
    }
    println(count)

}



