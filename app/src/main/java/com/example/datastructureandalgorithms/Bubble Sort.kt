package com.example.datastructureandalgorithms

fun main() {
    val array = intArrayOf(5, 3, 8, 4, 2,3,1)
    bubbleSort(array)
}

fun bubbleSort(arr: IntArray) {
    for (i in 0 until arr.size){
        var swap=false
        for (j in 0 until arr.size-i-1){
            if (arr[j+1]<arr[j]){
                val temp=arr[j]
                arr[j]=arr[j+1]
                arr[j+1]=temp
                swap=true
            }
        }

        if (!swap){
            break
        }
    }
    println(arr.joinToString())
}