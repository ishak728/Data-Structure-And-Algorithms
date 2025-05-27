package com.example.datastructureandalgorithms

//2. You are given the heads of two sorted linked lists list1 and list2.
//Merge the two lists in a one sorted list. The list should be made by splicing
//together the nodes of the first two lists.
//Input: list1 = [1, 2, 4], list2 = [1, 3, 4]
//Output: [1, 1, 2, 3, 4, 4]

data class Node(val data:Int, var next:Node?=null)

fun main(){
    val list1=Node(1,Node(2,Node(4)))
    val list2=Node(1,Node(3,Node(4)))

    println(mergedList(list1,list2))

}

fun mergedList( list1:Node?,list2:Node?): Node? {

    val dummy=Node(-1)
    var current=dummy

    var l1=list1
    var l2=list2

    while (l1!=null && l2!=null){
        if (l1.data<=l2.data){
            current.next=l1
            l1= l1.next

        }else{
            current.next=l2
            l2= l2.next
        }
        current= current.next!!
    }

    current.next=l1 ?:l2

    return dummy.next
}