object Main extends App {
println("Quel est votre choix ? \nReport (R) \nQuery (Q)")
  val choix = scala.io.StdIn.readLine()


  def program(choix : String): Unit = choix match {
    case "R" => println(topCountries())
    case "Q" => println("ERROR 418 : I'm a teapot")
  }

}