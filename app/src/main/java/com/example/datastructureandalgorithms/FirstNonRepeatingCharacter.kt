package com.example.datastructureandalgorithms

//4.You are given a string. Write a method to find the first non-repeating character in it and return its index.
// If it doesn't exist, return -1.
//Input: "leetcode"
//Output: 0
//Explanation: The first non-repeating character is 'l', which is at index 0.
//Input: "loveleetcode"
//Output: 2


fun main(){


    var input="loveleetcode".toMutableList()
    var index=-1

   println( firstUniqueCharIndex("loveleetcode"))  // Time Complexity: O(n)  Space:O(n)


    for (i in 0 until input.size){          //Time Complexity: O(n²)  Space:O(n)

        if (input[i]=='0') continue
        index=i

        for (j in i+1 until input.size){
            if (input[i]==input[j]){
                input[i]='0'
                input[j]='0'
                index=-1
            }
        }
        if (index!=-1) break
    }
    println(index)

}


fun firstUniqueCharIndex(input: String): Int {
    val map = mutableMapOf<Char, Int>()


    for (c in input) {
        map[c] = map.getOrDefault(c, 0) + 1
    }


    for (i in input.indices) {
        if (map[input[i]] == 1) return i
    }

    return -1
}