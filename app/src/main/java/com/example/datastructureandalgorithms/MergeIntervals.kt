package com.example.datastructureandalgorithms

//3.You are given a list of intervals, where each interval is represented as a pair of integers
// [start, end]. Write a method to merge all overlapping intervals and return the list of merged intervals.
//Input: [[1, 3], [2, 6], [8, 10], [15, 18]]
//Output: [[1, 6], [8, 10], [15, 18]]


//Time Complexity: O(n log n)
//Space Complexity: O(n)
fun main() {
    val myList = listOf(
        listOf(1, 3),
        listOf(2, 6),
        listOf(8, 10),
        listOf(15, 18)
    )
    val list = myList.sortedBy { it[0] }


    val mergedList= mutableListOf(list.first())

    for(i in 1 until list.size){
        val last=mergedList.last()
        val current=list[i]

        if(current[0]<=last[1]){
            val newPair=  listOf(current[0],maxOf(last[1], current[1]))
            mergedList[mergedList.size-1]=newPair
        }else{
            mergedList.add(current)
        }
    }
    println(mergedList)

}