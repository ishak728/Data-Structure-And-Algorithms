package com.example.datastructureandalgorithms.linkedlist.singlylinkedlist

fun main(){

    val singlyLinkedList=SinglyLinkedList<Int>()

    singlyLinkedList.addFirst(10)
    singlyLinkedList.addFirst(20)
    singlyLinkedList.addFirst(30)
    singlyLinkedList.addFirst(40)
    singlyLinkedList.addLast(50)


    singlyLinkedList.removeData(20)

    singlyLinkedList.showList()
}