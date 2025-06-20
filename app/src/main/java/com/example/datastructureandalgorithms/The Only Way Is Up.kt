package com.example.datastructureandalgorithms


fun main() {
    val b = 2
    val list = mutableListOf(1, 5, 5, 4)
    println(minAddition(b, list))
}

fun minAddition(b: Int, list: MutableList<Int>): Int {

    var count=0
    for (i in 1 until list.size){
        if (list[i-1]>=list[i]){
            val timesNeeded=((list[i-1]-list[i])/b)+1
            list[i]+=timesNeeded*b
            count+=timesNeeded
        }
    }
    return count

}

