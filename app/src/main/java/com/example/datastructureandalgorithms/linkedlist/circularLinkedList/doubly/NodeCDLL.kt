package com.example.datastructureandalgorithms.linkedlist.circularLinkedList.doubly

data class NodeCDLL<T>(
    var value: Int,
    var next: NodeCDLL<T>? = null,
    var prev: NodeCDLL<T>? = null
)
