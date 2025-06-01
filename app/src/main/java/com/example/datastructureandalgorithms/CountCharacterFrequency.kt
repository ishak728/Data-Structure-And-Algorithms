package com.example.datastructureandalgorithms

//Count the number of occurrences of each char in the input string.

fun main(){
    val word="hellohola"
    countCharacterFrequency(word)
}

fun countCharacterFrequency(word: String) {
    val map= mutableMapOf<Char,Int>()

    for (char in word){
        map[char]=map.getOrDefault(char,0)+1
    }
    for ((char, count) in map) {
        println("$char → $count")
    }


}