package com.example.datastructureandalgorithms

fun main(){
    val list1 = listOf(1, 2, 3, 2)
    val list2 = listOf(2, 2, 3, 4)
    val intersection = findIntersection(list1, list2)
    println(intersection)
}


fun findIntersection(list1: List<Int>, list2: List<Int>): MutableList<Int> {

    val map1= mutableMapOf<Int,Int>()
    val intersectionList= mutableListOf<Int>()

    for (num in list1){
        map1[num]=map1.getOrDefault(num,0)+1
    }

    for (num in list2){
        val count=map1.getOrDefault(num,0)
        if (count>0){
            map1[num]=count-1
            intersectionList.add(num)
        }
    }
    return intersectionList

}