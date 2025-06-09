package com.example.datastructureandalgorithms

fun main(){
    findDuplicateChar("programming")
}

fun findDuplicateChar(s: String) {

    val map= mutableMapOf<Char,Int>()


    for(i in s){
        map[i]=map.getOrDefault(i,0)+1
    }

    map.forEach{(value,count)->
        if (count>1){
            println("$value -> $count")
        }
    }
}