package com.example.datastructureandalgorithms
//5. You are given a list of strings words and a string pattern. Write a method to
// find all strings in words that match the given pattern. A string matches the pattern if there is a
// bijection between a letter in pattern and a letter in the string. Return the list of matching strings.
//Input: words = ["abc", "deq", "mee", "aqq", "dkd", "ccc"], pattern = "abb"
//Output: ["mee", "aqq"]

//Time Complexity: O(n * m)
//Space Complexity O(k)
fun main() {
    val list = listOf("abc", "deq", "mee", "aqq", "dkd", "ccc")
    val pattern = "abb"
    val bijectionList = mutableListOf<String>()
    findBijection(list, pattern, bijectionList)
    println(bijectionList)
}

fun findBijection(list: List<String>, pattern: String, bijectionList: MutableList<String>) {


    for ((index, item) in list.withIndex()) {
        if (item.length != pattern.length) continue

        bijection(item, pattern, bijectionList)

    }


}

//abb ccc mee
fun bijection(word: String, pattern: String, bijectionList: MutableList<String>) {
    val map = mutableMapOf<Char, Char>()


    pattern.forEachIndexed() { index, letter ->
        if (map.contains(letter)) {
            if (map[letter] != word[index]) {
                return
            }
        }
        else {
            if (map.contains(word[index])) {
                if (map[word[index]] == letter) {
                    map[letter] = word[index]
                    map[word[index]] = letter
                } else {
                    return
                }
            } else {
                map[letter] = word[index]
                map[word[index]] = letter
            }
        }
    }
    bijectionList.add(word)
}