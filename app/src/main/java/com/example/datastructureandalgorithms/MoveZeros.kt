package com.example.datastructureandalgorithms



//space complexity:O(1)
//time complexity:O(n)
fun main() {
    ///             Output: [1, 3, 12, 0, 0]
    val nums = mutableListOf(0, 1, 0, 3, 12)
    moveZerosToEnd(nums)
    println(nums)
}

fun moveZerosToEnd(nums: MutableList<Int>): MutableList<Int> {

    var pointer=-1

    for (i in 0 until nums.size){

        if (nums[i]==0 && pointer==-1){
            pointer=i
            continue
        }else if (nums[i]!=0 && pointer!=-1){
            nums[pointer]=nums[i]
            nums[i]=0
            pointer++
        }
    }
    return nums

}
