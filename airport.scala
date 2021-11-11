import scala.io.Source
import java.io.File  
  

case class airportsAndRunways(country: String, airportName: String, airportCode: String, runways: List[String] = List[String]())

object Airport {

    val airportsData = Source.fromFile(new File("./public/airports.csv"), "ISO-8859-1").getLines.drop(1)
    val countriesData = Source.fromFile(new File("./public/countries.csv"), "ISO-8859-1").getLines.drop(1)
    val runwaysData = Source.fromFile(new File("./public/runways.csv"), "ISO-8859-1").getLines.drop(1)

}