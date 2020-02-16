package com.particeep.test

object WhatsWrong1 {

  trait Interface {
    val city: String
    val support: String = s"Ici c'est $city !"
  }

  case object Supporter extends Interface {

    override val city = "Paris"
    override val support = s"Ici c'est $city !" 

  }

  def main(args: Array[String]){
  //this prints 'Paris'
  println(Supporter.city) //What does this print ?
  /*this prints 'Ici c'est null !' because we have just overrided the city in object Supporter 
  but the city in the trait Interface still points to null
  we can fix this by overriding support in the object supporter
  */
  println(Supporter.support) //What does this print and why ? How to fix it ?

  }
}
