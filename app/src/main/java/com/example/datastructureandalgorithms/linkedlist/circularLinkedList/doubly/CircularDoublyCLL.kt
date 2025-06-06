package com.example.datastructureandalgorithms.linkedlist.circularLinkedList.doubly

class CircularDoublyCLL<T> {

    var head: NodeCDLL<T>? = null
    var tail: NodeCDLL<T>? = null

    fun isEmpty() = head == null

    fun addLast(value: Int) {
        val newNode = NodeCDLL<T>(value)
        if (isEmpty()) {
            head = newNode
            tail = newNode
            head!!.next = head
            head!!.prev = head
        } else {
            newNode.prev = tail
            newNode.next = head
            tail!!.next = newNode
            head!!.prev = newNode
            tail = newNode
        }
    }

    fun addAt(value: Int, index: Int) {
        if (index < 0) throw IndexOutOfBoundsException("Invalid index")

        val newNode = NodeCDLL<T>(value)

        if (isEmpty() && index == 0) {
            head = newNode
            tail = newNode
            head!!.next = head
            head!!.prev = head
            return
        }

        if (index == 0) {
            newNode.next = head
            newNode.prev = tail
            head!!.prev = newNode
            tail!!.next = newNode
            head = newNode
            return
        }

        var current = head
        var count = 0

        while (current != tail && count < index) {
            current = current!!.next
            count++
        }

        if (count == index) {
            val prevNode = current!!.prev
            prevNode!!.next = newNode
            newNode.prev = prevNode
            newNode.next = current
            current.prev = newNode
            return
        }

        if (current == tail && count == index) {
            addLast(value)
            return
        }

        throw IndexOutOfBoundsException("Index out of bounds")
    }

    fun showLinkedList() {
        if (isEmpty()) return
        var current = head
        do {
            println(current!!.value)
            current = current.next
        } while (current != head)
    }
}
