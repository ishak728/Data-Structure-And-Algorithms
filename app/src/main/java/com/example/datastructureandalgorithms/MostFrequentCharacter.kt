package com.example.datastructureandalgorithms
//Find the most recurring char in the input string.
fun main(){
    val word="banana"
    println(mostFrequentCharacter(word))
}

fun mostFrequentCharacter(word: String): Pair<Char, Int> {
    val map= mutableMapOf<Char,Int>()

    for (char in word){
        map[char]=map.getOrDefault(char,0)+1
    }

    val list=map.toList()


   return list.reduce{acc,pair->
        if (pair.second>acc.second)
            pair
        else
            acc

    }


}