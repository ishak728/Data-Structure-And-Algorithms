package com.example.datastructureandalgorithms.linkedlist.doublylinkedlist

data class NodeDoubly <T>(
    var value:T,
    var next:NodeDoubly<T>?=null,
    var prev:NodeDoubly<T>?=null
)