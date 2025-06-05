package com.example.datastructureandalgorithms.linkedlist.circularLinkedList.singly

class SinglyCLL <T>{

    var head:NodeSCLL<T>?=null
    var tail:NodeSCLL<T>?=null

    fun isEmpty()= head==null

    fun addLast(value:Int){
        val newNode=NodeSCLL<T>(value)
        if (isEmpty()){
            head=newNode
            tail=newNode
            head!!.next=tail

        }else{
            newNode.next=tail!!.next
            tail!!.next=newNode
            tail=newNode
        }
    }

    fun addAt(value:Int,index:Int){

        if (isEmpty()) return
        val newNode=NodeSCLL<T>(value)

        if (index==0){
            newNode.next=head
            head=newNode
            tail!!.next=head
            return
        }

        var current=head
        var prev:NodeSCLL<T>?=null
        var count=0
        while (current!=tail){

            if (count==index){
                prev!!.next=newNode
                newNode.next=current
                return
            }
            println("- ${current!!.value}")
            count++
            prev=current
            current=current!!.next
        }

        if (index==count){
            prev!!.next=newNode
            newNode.next=current
            return
        }
        throw Exception("Out of index")
    }

    fun showLinkedList(){
        if (isEmpty())return
        else{
            var current=head
            do {
                println(current!!.value)
                current=current.next

            } while (current!=head)
        }
    }
}