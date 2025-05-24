package com.example.datastructureandalgorithms

//6. Given an array nums, move all 0's to the end of it while maintaining the
// relative order of the non-zero elements.
//Input: nums = [0, 1, 0, 3, 12]
//Output: [1, 3, 12, 0, 0]


//Time Comp:O(n)
//spaceComp: O(1)
fun main() {
    val nums = mutableListOf(1, 0, 1, 0, 3, 12)

    move(nums)
}

fun move(nums: MutableList<Int>) {

    var index = -1

    for (i in 0 until nums.size) {

        if (nums[i] == 0 && index == -1) {
            index = i
        }

        if (index != -1 && nums[i] != 0) {
            nums[index] = nums[i]
            nums[i] = 0
            index++
        }
    }
    println(nums)

}


//second way: similar but clean
fun move2(nums: MutableList<Int>) {

    var index = 0

    for (i in nums.indices) {
        if (nums[i] != 0) {
            nums[index] = nums[i]
            if (i != index) nums[i] = 0
            index++
        }
    }

    println(nums)

}