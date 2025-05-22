package com.example.datastructureandalgorithms

//2. You are given an ArrayList of integers. Write a method to find all pairs of integers
// in the ArrayList whose sum is equal to a given target value.
//Input: [1, 2, 3, 4, 5], target = 5
//Output: [[1, 4], [2, 3]]
//Input: [1, 1, 1, 2, 3, 4], target = 5
//Output: [[1, 4], [1, 4],[1, 4], [2, 3]]



//Time Complexity: O(n²)
//Space Complexity:O(k)
fun main(){

    val target=5
    val list= listOf(1, 2, 3, 4, 5)

    val pairs= mutableListOf <Pair<Int,Int>>()

    for (i in 0 until list.size){
        for (j in i+1 until list.size){
            val result= list[j]+list[i]
            if (result==target){
                pairs.add(Pair(list[i],list[j]))
            }

        }
    }
    println(pairs)

}