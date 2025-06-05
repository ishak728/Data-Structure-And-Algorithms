package com.example.datastructureandalgorithms.linkedlist.circularLinkedList.singly

fun main() {
    val singlyCLL = SinglyCLL<Int>()

    with(singlyCLL) {
        addLast(10)
        addLast(20)
        addLast(30)
        addAt(5,2)
    }



    singlyCLL.showLinkedList()
}