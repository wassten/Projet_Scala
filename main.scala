object Main extends App {
   println("Quel est votre choix ? \n1 - Report \n2 - Query")
  val choix = scala.io.StdIn.readLine()


  def program(choix : String): Unit = choix match {
    case "1" => topCountries()
    case "2" => 

}