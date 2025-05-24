package com.example.datastructureandalgorithms

//4. Given an array, rotate the array to the right by k steps, where k is non-negative.
//Input: nums = [1, 2, 3, 4, 5, 6, 7], k = 3
//Output: [5, 6, 7, 1, 2, 3, 4]


//
//fun main(){
//    val nums = mutableListOf(1, 2, 3, 4, 5, 6, 7)
//    val k=3
//    rotateArray(nums,k)
//}
//
//fun rotateArray(nums: MutableList<Int>, k: Int) {
//    val step=k%nums.size
//
//    for (i in 1 .. step){
//        val last=nums[nums.size-1]
//        nums.add(0,last)
//        nums.removeAt(nums.size-1)
//
//    }
//    println(nums)
//
//}



 //this is very good-fast solution by chatGpt
fun main() {
    val nums = mutableListOf(1, 2, 3, 4, 5, 6, 7)
    val k = 3
    rotateArray(nums, k)
}

fun rotateArray(nums: MutableList<Int>, k: Int) {
    val n = nums.size
    val step = k % n

    reverse(nums, 0, n - 1)
    reverse(nums, 0, step - 1)
    reverse(nums, step, n - 1)

    println(nums)
}

fun reverse(list: MutableList<Int>, start: Int, end: Int) {
    var left = start
    var right = end
    while (left < right) {
        val temp = list[left]
        list[left] = list[right]
        list[right] = temp
        left++
        right--
    }
}
