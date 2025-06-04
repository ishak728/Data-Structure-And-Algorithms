package com.example.datastructureandalgorithms.linkedlist.doublylinkedlist

class DoublyLinkedList<T> {
    var head: NodeDoubly<T>? = null

    fun isEmpty() = head == null

    fun addFirst(value: T) {
        val newNode = NodeDoubly(value)
        if (isEmpty()) {
            head = newNode
        } else {
            newNode.next = head
            head!!.prev = newNode
            head = newNode
        }

    }

    fun addLast(value: T) {
        val newNode = NodeDoubly(value)
        if (isEmpty()) {
            head = newNode
        } else {
            var current = head
            while (current!!.next != null) {
                current = current.next
            }
            current.next = newNode
            newNode.prev = current
        }

    }

    fun removeData(value: T) {
        if (isEmpty()) return
        else {
            if (head!!.value == value) {
                head = head!!.next
                head?.prev = null
                return
            }
            var current = head
            while (current != null) {
                if (current.value == value) {
                    val prev = current.prev
                    val next = current.next
                    prev?.next = next
                    next?.prev = prev
                    return

                }
                current = current.next
            }
        }
    }

    fun removeAt(index: Int) {
        if (index < 0 || isEmpty()) return
        if (index == 0) {
            head = head!!.next
            head!!.prev = null
            return
        }
        var current = head
        var count = 0

        while (current != null) {
            if (count == index) {
                val prev = current.prev
                val next = current.next
                prev?.next = next
                next?.prev = prev
                return
            }
            current = current.next
            count++
        }
    }


    fun addAt(index: Int, value: T) {
        if (index < 0 || isEmpty()) return
        val newNode = NodeDoubly(value)
        if (index == 0) {
            newNode.next = head
            head!!.prev = newNode
            head=newNode
            return
        }
        var current = head
        var count = 0
        while (current!=null){
            if (count==index){
                val prev=current.prev
                prev?.next=newNode
                newNode.prev=prev
                newNode.next=current
                current.prev=newNode
                return
            }
            current=current.next
            count++
        }
    }


    fun showList() {
        if (isEmpty()) return

        var current = head
        while (current != null) {
            println(current.value)
            current = current.next
        }

    }

}