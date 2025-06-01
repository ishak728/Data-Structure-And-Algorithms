package com.example.datastructureandalgorithms

fun main() {
    val array = intArrayOf(29, 10, 14, 37, 13)
    selectionSort(array)

}
fun selectionSort(arr: IntArray) {

    for (i in 0 until arr.size){
        var min=i
        for (j in i+1 until arr.size){
            if (arr[j]<arr[min]){
               min=j
            }
        }

        if (i!=min){
            val temp=arr[i]
            arr[i]=arr[min]
            arr[min]=temp
        }
    }
    println(arr.joinToString())
}