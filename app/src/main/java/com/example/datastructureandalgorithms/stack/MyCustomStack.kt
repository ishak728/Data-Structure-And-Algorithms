package com.example.datastructureandalgorithms.stack

class MyCustomStack<T> {
    private val items= mutableListOf<T>()

    fun push(item:T): Boolean {
        return items.add(item)
    }

    fun pop():T{
      if (items.isEmpty()){
          throw Exception("List is empty")
      }
          return items.removeAt(items.lastIndex)

    }

    fun peek():T{
      return items[items.lastIndex]

    }

    fun isEmpty(): Boolean {
        return items.isEmpty()
    }

    fun showStack(): MutableList<T> {
        return items
    }


}