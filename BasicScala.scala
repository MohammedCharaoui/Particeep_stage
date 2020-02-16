package com.particeep.test

/**
  * This is basic language questions so don't use external library or build in function
  */
object BasicScala {
	
	def main(args: Array[String]){
  /**
    * Encode parameter in url format
    *
    * Example:
    *
    * input  : Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
    * output : "?sort_by=name&order_by=asc&user_id=12"
    *
    * input  : Map()
    * output : ""
    */

    //i had to change the signature of the method encodeParamsInUrl to be able to pass an empty Map
  def encodeParamsInUrl(params: Map[_,_]): String = {
  	if(params.isEmpty)
  		return ""
  	else{
  		var resu = "?"
  		for((key,value) <- params){
  			resu =resu + key+"="+value+"&"
  		}
  		var temp =resu.toArray
  		temp(temp.length-1)=' '
  		resu = temp.mkString("")
  		return resu
  	}
  }

  /**
    * Test if a String is an email
    */
  def isEmail(maybeEmail: String): Boolean = {
  	if("""^[-a-z0-9!#$%&'*+/=?^_`{|}~]+(\.[-a-z0-9!#$%&'*+/=?^_`{|}~]+)*@([a-z0-9]([-a-z0-9]{0,61}[a-z0-9])?\.).*([a-z][a-z])$""".r.findFirstIn(maybeEmail) == None)false else true
  }

  /**
    * Compute i ^ n
    *
    * Example:
    *
    * input : (i = 2, n = 3) we compute 2^3 = 2x2x2
    * output : 8
    *
    * input : (i = 99, n = 38997)
    * output : 1723793299
    */
  def power(i:Int, n:Int):Int = {
  	if(n==0)
  		return 1
  	else{
  		var resu: Int = i
  		for(j <- 1 to n-1)
  			resu *= i
  		return resu  	
  	}
  	

  }

  	val emptyMap = Map()
  	println("Empty URL : "+encodeParamsInUrl(emptyMap))
  	val map = Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
  	println("URL : "+encodeParamsInUrl(map))

  	val validEmail = "test@gmail.com"
  	println(validEmail+" is "+isEmail(validEmail))
  	val invalidEmail = "test @gmail@com"
  	println(invalidEmail+" is "+isEmail(invalidEmail))

	println("2 ^ 0 = "+power(2,0))
	println("2 ^ 3 = "+power(2,3))
	println("99 ^ 38997 = "+power(99,38997))
	

  }


}
