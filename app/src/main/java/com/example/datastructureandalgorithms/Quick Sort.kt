package com.example.datastructureandalgorithms

fun main() {
    val array = intArrayOf(5, 3, 8, 4, 2)

    println(quickSort(array).joinToString())
}


fun quickSort(arr: IntArray): IntArray {
    if (arr.size <= 1) return arr

    val pivot = arr[0]

    val less = arr.filter { it < pivot }.toIntArray()
    val equal = arr.filter { it == pivot }.toIntArray()
    val greater = arr.filter { it > pivot }.toIntArray()


    return quickSort(less) + equal + quickSort(greater)



}
