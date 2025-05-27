package com.example.datastructureandalgorithms


//Binary Search is a fast algorithm used to find an element in a sorted array.
//How It Works:
//You look at the middle element of the array.
//If it's equal to the target : you've found it.
//If it's greater than the target > discard the right half.
//If it's less than the target : discard the left half.
//Repeat the process on the remaining half until the element is found or the range is empty.
//In every step, you're cutting the problem in half.that’s why it’s efficient.

//Best case	O(1)
//Worst	O(log n)
fun main() {
    val nums = listOf(1, 3, 5, 7, 9, 11, 13)
    val target = 9

    val index = binarySearch(nums, target)
    println("index of $target: $index")
}

fun binarySearch(nums: List<Int>, target: Int): Int {
    var left = 0
    var right = nums.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2

        when {
            nums[mid] == target -> return mid
            nums[mid] < target -> left = mid + 1
            else -> right = mid - 1
        }
    }

    return -1
}