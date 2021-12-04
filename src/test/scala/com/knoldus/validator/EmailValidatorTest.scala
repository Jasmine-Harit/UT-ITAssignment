package com.knoldus.validator

import org.scalatest.funsuite.AnyFunSuite

class EmailValidatorTest extends AnyFunSuite {
  var emailObject = new EmailValidator

  test("Without name of user"){
    assert(!emailObject.emailIsValid("@gmail.com"))
  }

  test("Without @ in the email"){
    assert(!emailObject.emailIsValid("jasmine.harit.gmail.com"))
  }

  test("Without domain name"){
    assert(!emailObject.emailIsValid("jasmine.harit@"))
  }

  test("Other domain name than .com| .net| .org "){
    assert(!emailObject.emailIsValid("jasmine.harit@rediffmail.in"))
  }

  test("correct one uppercase"){
    assert(emailObject.emailIsValid("JASMINE.HARIT@REDIFFMAIL.COM"))
  }

  test("Correct one lowercase"){
    assert(emailObject.emailIsValid("jasmine.harit@rediffmail.com"))
  }

}
