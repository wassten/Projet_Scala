object Main extends App {
   println("Quel est votre choix ? \n1 - Report \n2 - Query")
  val choix1 = scala.io.StdIn.readLine()


  def program(choix : String): Unit = choix match {
    case "1" => println("Que voulez vous savoir ? \n1 - Top 10 countries \n2 - Type Runways \n2 Top 10 runway latitude")
      val choix2 = scala.io.StdIn.readLine()
      sous_program(choix2)
    case "2" => 

  def sous_program(choix : String): Unit = choix match {
    case "1" => println(topCountries())  
    case "2" => 
    case "3" => println()
  }

}