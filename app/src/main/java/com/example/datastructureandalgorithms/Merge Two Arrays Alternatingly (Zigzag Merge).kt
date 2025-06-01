package com.example.datastructureandalgorithms

import androidx.collection.MutableIntList
import androidx.collection.mutableIntListOf


fun main() {
    val list1 = listOf(10, 50, 20, 30)
    val list2 = listOf(25, 75, 5, 25)
    println(merge(list1, list2))
}

fun merge(first: List<Int>, second: List<Int>): MutableIntList {
    val mergedList = mutableIntListOf()
    val pair =
        if (first.size < second.size) Pair(first.size, "first") else Pair(second.size, "second")

    for (i in 0 until pair.first) {
        mergedList.add(first[i])
        mergedList.add(second[i])
    }
    if (pair.second == "first") {
        val list = second.subList(pair.first, second.size)
        mergedList.addAll(list.toIntArray())
    } else {
        val list = first.subList(pair.first, first.size)
        mergedList.addAll(list.toIntArray())
    }

    return mergedList
}
