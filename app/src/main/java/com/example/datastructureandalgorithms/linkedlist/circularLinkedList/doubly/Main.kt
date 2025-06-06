package com.example.datastructureandalgorithms.linkedlist.circularLinkedList.doubly

fun main() {
    val doublyCLL = CircularDoublyCLL<Int>()

    with(doublyCLL) {
        addLast(10)
        addLast(20)
        addLast(30)
        addAt(5, 2)
    }

    doublyCLL.showLinkedList()
}
