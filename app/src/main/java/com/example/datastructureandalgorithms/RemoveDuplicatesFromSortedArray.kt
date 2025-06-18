package com.example.datastructureandalgorithms

//3. Given a sorted array nums, remove the duplicates in-place such that each element appears only once
// and returns the new length. Do not allocate extra space for another array; you must do this by modifying
// the input array in-place with O(1) extra memory.
//
//Input: nums = [1, 1, 2] [1,2,2,2,3,4,5,5]
//Output: 2, nums = [1, 2]
//


//Time Complexity: O(n)
//space Complexity:O(1)
fun main() {
    val nums = mutableListOf(1, 1, 2, 3, 3, 4)
    println(removeDuplicate(nums))

}

//1, 2, 2, 2,2, 3, 4, 5, 5)
//1, 1, 2, 3, 3, 4
fun removeDuplicate(nums: MutableList<Int>): MutableList<Int> {

    if (nums.isEmpty()) return nums

    var index=1
    for (i in 1 until nums.size){
        if (nums[i]!=nums[index-1]){
            nums[index]=nums[i]
            index++
        }
    }

   return nums.subList(0,index)

}



