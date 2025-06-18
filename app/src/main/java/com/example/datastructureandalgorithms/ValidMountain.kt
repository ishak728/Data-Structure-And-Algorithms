package com.example.datastructureandalgorithms


// time and space complexity:	O(n), O(1)
fun main() {
    println(isValidMountain(listOf(0, 3, 2, 1)))

}

fun isValidMountain(list: List<Int>): Boolean {

    if (list.size<3) return false

    var peak=-1
    var peakIndex=-1

    for (i in 0 until list.size-1){
        if (list[i]<list[i+1] ){
            peak=list[i+1]
            peakIndex=i+1

        }else
            break
    }

    if (peakIndex==-1 || peakIndex==list.size-1) return false

    for (j in peakIndex until list.size-1){
        if (list[j]>list[j+1]){
            peakIndex++
        }else
            break
    }

    return if (peakIndex==list.size -1 ) true else false



}
