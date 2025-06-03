package com.example.datastructureandalgorithms.queue

class Queue<T> {
    private val items = mutableListOf<T>()

    fun enqueue(item: T) {
        items.add(item)
    }

    fun dequeue(): T {
        if (items.isEmpty()) throw NoSuchElementException("Queue is empty")
        return items.removeAt(0)
    }

    fun peek(): T {
        if (items.isEmpty()) throw NoSuchElementException("Queue is empty")
        return items.first()
    }

    fun isEmpty(): Boolean = items.isEmpty()

}
