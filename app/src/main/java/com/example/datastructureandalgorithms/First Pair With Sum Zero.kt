package com.example.datastructureandalgorithms

//Question:
//Given an array of integers, find and return the first pair of elements whose sum is zero.
//Return the pair as a list [a, b]. If no such pair exists, return an empty list.
//
//Example 1:
//Input: [2, -3, 1, -2, 3, 5]
//Output: [2, -2]
//
//Example 2:
//Input: [1, 2, 3]
//Output: []


fun main() {
    println(firstPair(intArrayOf(2, -3, 1, -2, 3, 5)))

}

fun firstPair(list: IntArray): Pair<Int,Int>{



    for (i in list ){
        if (list.contains(-i)){
            return Pair(i,-i)
        }
    }
    return Pair(0,0)
}



// chatGpt's solution... better
fun firstPairWithZeroSum(arr: IntArray): List<Int> {
    val seen = mutableSetOf<Int>()

    for (num in arr) {
        if (-num in seen) {
            return listOf(num, -num)
        }
        seen.add(num)
    }

    return emptyList()
}
