package com.knoldus.Q2

class calculation extends factorial with palindrom {
  override def factorialof(num: Int): Int = {

    var res = 1
    if (num < 0) {
      res = -1
      res
    }
    for (i <- 2 to num) {
      res = res * i
    }
    res
  }

  override def isPalindrome(num: Int): Boolean = {
    var rev = 0
    var sum = 0
    var temp = num
    while (temp > 0) {
      rev = temp % 10
      sum = sum * 10 + rev
      temp = temp / 10
    }
    if (num == sum) {
      true
    }
    else {
      false
    }
  }
}