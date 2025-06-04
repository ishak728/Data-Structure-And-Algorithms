package com.example.datastructureandalgorithms.linkedlist.doublylinkedlist

fun main(){

    val doublyLinkedList=DoublyLinkedList<Int>()

    doublyLinkedList.addLast(10)
    doublyLinkedList.addLast(20)
    doublyLinkedList.addLast(20)
    doublyLinkedList.addLast(30)
   doublyLinkedList.addAt(1,5)


//    doublyLinkedList.removeData(20)
//    doublyLinkedList.removeAt(0)

    doublyLinkedList.showList()
}