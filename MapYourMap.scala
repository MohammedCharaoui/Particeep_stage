package com.particeep.test

/**
  * Tell developer names by the department code
  * Expected result:
  * Map(frontend -> List(Remy, Alexandre), analytics -> List(Pierre), api -> List(Noe))
  */
object MapYourMap {

  def main(args: Array[String]) = {
  
  val devNames = Map("dev1" -> "Pierre", "dev2" -> "Remy", "dev3" -> "Noe", "dev4" -> "Alexandre")
  val devDepartments = Map("dev1" -> "analytics", "dev2" -> "frontend", "dev3" -> "api", "dev4" -> "frontend")

  val namesInDepartments:Map[String, List[String]] = {
  	val resultat:collection.mutable.Map[String, List[String]] = collection.mutable.Map[String, List[String]]()
  	for ((kn,vn) <- devNames){
  		var list = new collection.mutable.ListBuffer[String]()
  		for((kd,vd) <- devDepartments){
  			if(devDepartments(kn).equals(vd))
  				list += devNames(kd)
  		}
  		val listf = list.toList
  		resultat += (devDepartments(kn) -> listf)
  	}

  	val imresultat = resultat.toMap
  	 imresultat 	
  }

  
  for ((k,v) <- namesInDepartments)
  	println(k+" -> "+v)	
  }

}
