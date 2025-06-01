package com.example.datastructureandalgorithms

fun main(){
    val array = intArrayOf(5, 3, 8, 4, 2)
    val sorted = mergeSort(array)
    println(sorted.joinToString())
}

fun mergeSort(arr:IntArray):IntArray{
      if (arr.size<=1) return arr

    val mid=arr.size/2
    val left= mergeSort(arr.sliceArray(0 until mid))
    val right= mergeSort(arr.sliceArray(mid until arr.size))

    return mergeList(left,right)
}

fun mergeList(left: IntArray, right: IntArray):IntArray{
    val mergedList= mutableListOf<Int>()
    var l=0
    var r=0
    while (l<left.size && r<right.size){
        if (left[l]<right[r]){
            mergedList.add(left[l])
            l++
        }else{
            mergedList.add(right[r])
            r++
        }
    }

    while (l<left.size){
        mergedList.add(left[l])
        l++

    }

    while (r<right.size){
        mergedList.add(right[r])
        r++
    }

    return mergedList.toIntArray()
}