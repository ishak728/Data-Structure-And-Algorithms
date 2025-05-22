package com.example.datastructureandalgorithms
//
//1.You are given an ArrayList of integers representing stock prices on consecutive days.
// Write a method to find the maximum profit you can achieve from a single buy and sell transaction.
// If you cannot achieve any profit, return 0.
//
//Input: [7, 1, 5, 3, 6, 4]
//Output: 5
//

//Time Complexity: O(n²)
// Space Complexity: O(1)

fun main(){
    val list= listOf(7, 17, 5, 3, 16, 4)
    var maxProfit=0

    for (i in 0 until list.size){
        for (j in i+1 until list.size){
           val result= list[j]-list[i]
            if (result>maxProfit){
                maxProfit=result
            }
        }
    }
    println(maxProfit)
}

