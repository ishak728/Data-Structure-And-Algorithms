package com.example.datastructureandalgorithms

import androidx.collection.MutableIntList
import androidx.collection.mutableIntListOf

// O(n + m) time
//O(n + m)  space
fun main() {
    val list1 = listOf(10, 28, 50, 75, 80, 95, 100)
    val list2 = listOf(35, 60, 70, 78)
    println(mergedList(list1, list2))
}


fun mergedList(first: List<Int>, second: List<Int>): MutableIntList {
    val mergedList = mutableIntListOf()

    var firstPointer=0
    var secondPointer=0


    while (firstPointer!=first.size && secondPointer!=second.size){
        if (first[firstPointer]<second[secondPointer]){
            mergedList.add(first[firstPointer])
            firstPointer++
        }else if (second[secondPointer]<first[firstPointer]){
            mergedList.add(second[secondPointer])
            secondPointer++
        }else{
            mergedList.add(first[firstPointer])
            mergedList.add(second[secondPointer])
            firstPointer++
            secondPointer++
        }
    }

    if (firstPointer==first.size){
        mergedList.addAll(second.subList(secondPointer,second.size).toIntArray())
    }else{
        mergedList.addAll(first.subList(firstPointer,first.size).toIntArray())
    }

    return mergedList

}
