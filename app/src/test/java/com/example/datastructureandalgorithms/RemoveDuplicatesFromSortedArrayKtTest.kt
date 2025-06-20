package com.example.datastructureandalgorithms

import org.junit.Assert.*

import org.junit.Test

 class RemoveDuplicatesFromSortedArrayKtTest {


  @Test
  fun `test if it removes duplicates from array`(){
   val nums = mutableListOf(1, 2, 2, 2, 3, 4, 5, 5)


   val result=removeDuplicate(nums)

   assertEquals(listOf(1,2,3,4,5),result)
//   assertArrayEquals()


  }

  @Test
  fun `test list if given list is empty it should return given list`(){

   val nums= mutableListOf<Int>()
   val result= removeDuplicate(nums)
   assertEquals(nums,result)
  }

}