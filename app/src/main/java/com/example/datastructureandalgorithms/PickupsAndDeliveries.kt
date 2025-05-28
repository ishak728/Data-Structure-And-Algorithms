package com.example.datastructureandalgorithms

//1. move all 1's at the end of list, optimaze it
//what would you do if there s only few 1's and many 0's? better way to do it?
//


fun moveToEnd(orders: MutableList<Int>) {
    var j=0

    for (i in 0 until orders.size){
        if (orders[j]==1){
            orders.removeAt(j)
            orders.add(1)
            j--

        }
        j++
    }
    println(orders)

}




fun main() {
    val orders = mutableListOf(0, 1, 1, 1, 0, 0)
//    findPickupsAndDeliveries(orders)
    moveToEnd(orders)
}

fun findPickupsAndDeliveries(orders: MutableList<Int>) {

    var pickup = 0        //1
    var delivery = 0      //0

    var current = -1

    for (i in 0 until orders.size) {
        if (current == -1 && orders[i] == 0) {
            current = i
        }


        if (current != -1 && orders[i] == 1) {
            pickup++
            orders[current] = 1
            orders[i]=0
            current++

        }
        if (current==-1 && orders[i]==1){
            pickup++
        }
    }
    delivery=orders.size-pickup
    println("orders:$orders")
    println("pickup size:$pickup")
    println("delivery size:$delivery")
}



// chatGpt solution->> better way
//var pickup = 0
//var write = 0
//
//for (i in orders.indices) {
//    if (orders[i] == 1) {
//        orders[write] = 1
//        write++
//        pickup++
//    }
//}
//
//for (i in write until orders.size) {
//    orders[i] = 0
//}