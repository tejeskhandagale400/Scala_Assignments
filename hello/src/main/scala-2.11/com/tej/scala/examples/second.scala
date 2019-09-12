package com.tej.scala.examples

/**
  * Created by tkhandag on 9/10/2019.
  */
object BinarySearch {
  def main(args: Array[String]) {
    println("second hello world")
    //    println("1st arg = " +args(0))
    val arr = Array(1, 2, 3, 4, 5, 6,6, 9, 8, 7, 8,10,11)
    val p = arr.sortBy(x=>x)
    p.foreach(p=> print(" "+p))
println()
    println("number position = " +findNumber(11,p,0,p.length))
  }
  def findNumber(number:Int,array:Array[Int],start:Int,end:Int):Any={
    val c = (start+end)/2

    println(" in method " + " start = " +start + " end "+end+" c" + c)

    if(number<array(c)){
      println(" in 1st c = "+c+ " array(c)" +array(c))
      findNumber(number,array,start,c)
    }
    if(number>array(c)){
      println(" in 2nd c = "+c)
      findNumber(number,array,c+1,end)
    }
    if (number==array(c)){
      println(" in 3rd c = "+c)
      //findNumber(number,array,c+1,end)
      c
    }
  }
}
