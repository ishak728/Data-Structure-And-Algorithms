package com.example.datastructureandalgorithms

fun main() {
    val string = "applepenapple"
    val list = listOf("apple", "pen")
    println(wordBreak(string, list))

}
fun wordBreak(string: String, list: List<String>): Boolean {

    val points=BooleanArray(string.length+1){false}
    val set=list.toSet()
    points[0]=true

    for (i in 1 .. string.length){
        for (j in 0 ..i){

            if (points[j] && string.substring(j,i) in set){
                points[i]=true
                break
            }
        }
    }

    return points[string.length]
}
