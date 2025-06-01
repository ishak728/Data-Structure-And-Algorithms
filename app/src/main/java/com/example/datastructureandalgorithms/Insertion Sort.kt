package com.example.datastructureandalgorithms

fun main() {
    val array = intArrayOf(5, 3, 8, 4, 2)
    insertionSort(array)
}

fun insertionSort(arr: IntArray) {

    for (i in 1 until arr.size){
        val key=arr[i]
        var j=i-1

        while (j>=0 &&  arr[j]>key){
            arr[j+1]=arr[j]
            j--
        }

        arr[j+1]=key
    }

    println(arr.joinToString())
}
