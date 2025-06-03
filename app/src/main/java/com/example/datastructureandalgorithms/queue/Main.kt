package com.example.datastructureandalgorithms.queue

fun main() {
    val queue = Queue<Int>()

    queue.enqueue(10)
    queue.enqueue(20)
    queue.enqueue(30)

    println(queue.dequeue())
    println(queue.peek())

}
