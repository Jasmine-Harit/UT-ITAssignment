package com.knoldus.Q2

import org.scalatest.flatspec.AnyFlatSpec

class calculationTest extends AnyFlatSpec {
  var num=121
  val calculation= new calculation()

  "a number " should "be palindrome" in
    {
      val output=calculation.isPalindrome(num)
      assert(output)
    }
  var num1 = 5
  "a Factorial of number " should "Give" in
    {
      val res=calculation.factorialof(num1)
      assert(res==120)
    }
}