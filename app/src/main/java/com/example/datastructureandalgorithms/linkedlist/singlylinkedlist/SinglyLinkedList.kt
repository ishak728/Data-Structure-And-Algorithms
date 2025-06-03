package com.example.datastructureandalgorithms.linkedlist.singlylinkedlist


class SinglyLinkedList<T> {
    var head: NodeSingle<T>? = null

    fun isEmpty() = head == null


    fun addFirst(value: T) {
        var newNode = NodeSingle(value)
        if (isEmpty()) {
            head = newNode
        } else {
            newNode.next = head
            head = newNode
        }
    }

    fun addLast(value: T) {
        var newNode = NodeSingle(value)
        if (isEmpty()) {
            head = newNode
        } else {
            var current = head
            while (current!!.next != null) {
                current = current.next
            }
            current.next = newNode
        }
    }

    fun removeFirst() {
        if (isEmpty()) return

        head = head!!.next

    }

    fun removeData(value: T) {
        if (isEmpty()) return
        if (head!!.value == value) {
            head = head!!.next
        }
        var current = head
        while (current?.next != null) {
            if (current.next!!.value == value) {
                current.next = current.next!!.next
            } else {
                current = current.next
            }
        }

    }

    fun showList() {
        if (isEmpty()) return

        var current = head
        while (current!!.next != null) {
            println(current.value)
            current = current.next
        }
        println(current.value)


    }
}