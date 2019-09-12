package com.tej.scala.examples

/**
  * Created by tkhandag on 9/12/2019.
  */
object RecExample {

    def main(args:Array[String]): Unit ={
      /*def sum(f: Int => Int, a: Int, b: Int): Int = if (a > b) 0 else f(a) + sum(f, a + 1, b)
      def sumInts(a: Int, b: Int): Int = sum(id, a, b)
      def sumSquares(a: Int, b: Int): Int = sum(square, a, b)
      def id(x: Int): Int = x
      def square(x: Int): Int = x * x
      println("sum ints 1 to 4 = " + sumInts(1,5))
      println("sum squares 1 to 4 = " + sumSquares(1,4))*/
    //144
      println(product(x=>x*x)(3,4))

      def product(f:Int=>Int)(a:Int,b:Int):Int={
        if(a > b ) 1
        else {
          println(" a " +a + " b " + b+ " f" +f)
          f(a) * product(f)(a+1,b)}

      }

      def sum(f: Int => Int ,a:Int,b:Int):Int = {
        def loop(a:Int,acc:Int):Int={
          if(a > b) acc
          else loop(a+1,f(a)+acc)
          loop(a,0)
        }
        sum(x => x * x, 3, 5)
      }
    }

}
