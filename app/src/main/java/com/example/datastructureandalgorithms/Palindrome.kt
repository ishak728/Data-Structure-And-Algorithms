package com.example.datastructureandalgorithms

fun main(){
    val word="racecar"
  println(  isPalindrome(word))
}


fun isPalindrome(word:String):Boolean{

    val last=word.length-1
    var check=true
    for (i in 0 until word.length/2){
        if (word[i]!=word[last-i]){
            check=false
            return check
        }
    }
    return check

}