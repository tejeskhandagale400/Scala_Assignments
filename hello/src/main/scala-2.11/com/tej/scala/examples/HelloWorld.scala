package com.tej.scala.examples

/**
  * Created by tkhandag on 9/10/2019.
  */
object HelloWorld {
  def main(args: Array[String]) {
    println("hello world")
   // println("1st arg = " +args(0))
  }


  def product(f:Int=>Int)(a:Int,b:Int):Int={
    if(a > b ) 1
    else f(a) * product(f)(a+1,b)
    product(x=>x*x)(3,4)//144
  }



}
