package com.example.datastructureandalgorithms

fun main() {
    val nums = listOf(2, 2, 1, 1, 2, 2, 2)
    val majority = findMajorityElement(nums)
    println(majority)
}

// time complexity:o(n)
//space complexity:O(n)
fun findMajorityElement(nums: List<Int>): Int {

    val map = mutableMapOf<Int, Int>()
    var counter=0
    var majorityElement=-1

    for (i in 0 until nums.size) {
        val key=nums[i]
        map[key ] = map.getOrDefault(key, 0) + 1

        if (map[key]!! > counter){
            counter=map[key]!!
            majorityElement=key
        }
    }
    return if (counter > nums.size / 2) majorityElement else -1
}



//time O(n)
//space:O(1)
// !!! This is better solution by chatGpt !!!
fun findMajority(nums: List<Int>): Int {
    var count = 0
    var candidate = 0

    for (num in nums) {
        if (count == 0) {
            candidate = num
        }
        count += if (num == candidate) 1 else -1
    }

    return candidate
}




