package com.knoldus.validator
import java.util.regex.Pattern
class passwordvalidator() {

  def isPasswordisValid(password: String): Boolean = {
    if (password.contains(" ")) {
      return false
    }
    // check length between 8 to 15
    if(!(password.length >=8 && password.length <=15)){
      return  false
    }
    val upperchar =Pattern.compile("[A -Z]")
    val lowerchar=Pattern.compile("[a-z]")
    val specialchar=Pattern.compile("[!#@&*=<>?{}\\\\]")

    val digit= Pattern.compile("[0-9]")

    val haslowerchar=lowerchar.matcher(password)
    val hasupperrchar=upperchar.matcher(password)
    val hasdigit=digit.matcher(password)
    val hasspecialchar=digit.matcher(password)

    if(!(hasupperrchar.find()) && haslowerchar.find()  && hasdigit.find && hasspecialchar.find())
    {
      return  false
    }
    return  true
  }
}