// methods
// define the package
package com.uppala.builds;
// define calculator class
class Calculator  {
// DEFINE a VARIABLE to hold the jenkins context
   def jenkins
   // constructor to initialize the calculator class with the jenkins instance
    Calculator(jenkins) {
        this.jenkins = jenkins
    }
 // methods to perform addition of 2 numbers
  //  def methodname (arg1, arg2) {
  //     return logicalcode
   //}
   def add (firstNumber, secondNumber) {
    //logical code for addition
      return firstNumber+secondNumber
    
   }
// exmaple usage methiod add(2,3)
 // method to multiply 2 numbers
 def multiply(thirdNumber, fourthNumber){
    return thirdNumber*fourthNumber
 }
} 