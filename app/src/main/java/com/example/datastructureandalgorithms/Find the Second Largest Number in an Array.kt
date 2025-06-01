package com.example.datastructureandalgorithms

import androidx.collection.MutableIntList
import androidx.collection.mutableIntListOf
//Time: O(n), Space: O(1)
fun main(){
    val list= mutableIntListOf(5, 1, 8, 3, 9, 4)
   println( findSecondLargestNumber(list))
}

fun findSecondLargestNumber(list: MutableIntList): Int {
    var first=Int.MIN_VALUE
    var second=Int.MIN_VALUE

    for (i in 0 until list.size){
        if (list[i]>first){
            second=first
            first=list[i]
        }else if (list[i]>second && list[i]!=first){
            second=list[i]
        }
    }
    return second
}