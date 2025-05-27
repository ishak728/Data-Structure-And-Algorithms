package com.example.datastructureandalgorithms

import kotlin.math.max

//5. Given an integer array nums, find the contiguous subarray (containing at least one number)
//which has the largest sum and return its sum.
//Input: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//Output: 6


fun main(){
val list= listOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    println(contiguousmaxSubArray(list))
}


fun contiguousmaxSubArray(list: List<Int>): Int {

    var current=list[0]
    var max=list[0]


    for (i in 1 until list.size){
        current= maxOf(list[i],current+list[i])
        max= maxOf(current,max)
    }
    return max
}