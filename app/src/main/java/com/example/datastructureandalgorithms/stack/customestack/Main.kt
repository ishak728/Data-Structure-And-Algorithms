package com.example.datastructureandalgorithms.stack.customestack


fun main(){
    val myCustomStack= MyCustomStack<Int>()

    myCustomStack.push(12)
    myCustomStack.push(123)
    myCustomStack.push(1)

    println(myCustomStack.peek())


    if (!myCustomStack.isEmpty()){
        myCustomStack.pop()
    }

   println( myCustomStack.showStack())



}