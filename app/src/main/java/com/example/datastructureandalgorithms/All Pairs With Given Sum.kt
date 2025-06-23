package com.example.datastructureandalgorithms


//Question:
//Given an array of integers and a target sum, return a list of all unique pairs whose sum is equal to the target.
//Each pair should be a list [a, b]. Do not return duplicates.
//
//Example 1:
//Input: arr = [1, 5, 7, -1, 5], target = 6
//Output: [[1, 5], [7, -1]]
//
//Example 2:
//Input: arr = [2, 4, 3, 5, 6, -2, 4], target = 6
//Output: [[2, 4], [3, 3], [6, 0]]




fun main() {
    println(allPairsWithSum(intArrayOf(1, 5, 7, -1, 5,1), 6)) // Output: [[1, 5], [7, -1]]

}

fun allPairsWithSum(list: IntArray, num: Int):HashSet<Pair<Int,Int>> {

    val newList= HashSet<Int>()
    val uniquePairs=HashSet<Pair<Int,Int>>()

    for (i in list){
        if (num-i in newList){
            //to prevent duplicates
            if (i>num-i) uniquePairs.add(Pair(i,num-i)) else  uniquePairs.add(Pair(num-i,i))

            continue
        }
        newList.add(i)

    }
   return uniquePairs



}




