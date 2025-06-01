package com.example.datastructureandalgorithms

//Remove duplicate chars from the input string.
fun main(){

    val word="banana"
   println( removeDuplicateCharacters(word))
    println(removeDuplicateWithSet(word))
}
// map also can be used but set is better
//time and space cpmplexity is o(n)
fun removeDuplicateWithSet(word: String): StringBuilder {
    val newWord=StringBuilder()
    val set= mutableSetOf<Char>()


    for (char in word){
        if (char !in set){
            set.add(char)
            newWord.append(char)
        }
    }
    return newWord
}


fun removeDuplicateCharacters(string: String): String {
    val word=string.toMutableList()

    var i=0
    var j:Int
    while (i<word.size){
        j=i+1
        while (j<word.size){
            if (word[i]==word[j]){
                word.removeAt(j)
                continue
            }
            j++
        }
        i++
    }
    return word.toString()
}