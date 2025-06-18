package com.example.datastructureandalgorithms

fun main() {
    val nums = mutableListOf(2, 0, 2, 0, 1, 1)
    sortDutchNationalFlag(nums)
    println(nums) //        [0, 0, 1, 1, 2, 2]
}
fun sortDutchNationalFlag(list: MutableList<Int>) {

    var zeroIndex = 0

    var twoIndex = list.lastIndex

    var i = 0
    while (i <= twoIndex) {
        when (list[i]) {
            0 -> {
                list[zeroIndex] = list[i].also { list[i] = list[zeroIndex] }
                zeroIndex++
                i++
            }
            1 -> {
                i++
            }
            2 -> {
                list[twoIndex] = list[i].also { list[i] = list[twoIndex] }
                twoIndex--
            }
            else -> break
        }
    }
}
