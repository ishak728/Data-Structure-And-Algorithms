package com.example.datastructureandalgorithms



fun minimizeDifference(A: List<Int>, B: List<Int>, C: List<Int>): Int {
    val a = A.sorted()
    val b = B.sorted()
    val c = C.sorted()

    var i = 0
    var j = 0
    var k = 0

    var minDiff = Int.MAX_VALUE

    while (i < a.size && j < b.size && k < c.size) {
        val max = maxOf(a[i], b[j], c[k])
        val min = minOf(a[i], b[j], c[k])
        val diff = max - min

        minDiff = minOf(minDiff, diff)


        when (min) {

            a[i] -> i++
            b[j] -> j++
            else -> k++
        }
    }

    return minDiff
}







fun main() {
    val A = listOf(5, 8, 10, 15)
    val B = listOf(89, 15, 6, 9, 78)
    val C = listOf(2, 3, 6, 8, 8, 10, 6)

    println(minimizeDifference(A, B, C))
}

