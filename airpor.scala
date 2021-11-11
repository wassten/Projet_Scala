import scala.io.Source
import java.io.File  
  

case class airportsAndRunways(country: String, airportName: String, airportCode: String, runways: List[String] = List[String]())

object Airport {
    
    val airportsFile: String = "./public/airports.csv"
    val countriesFile: String = "./public/countries.csv"
    val runwaysFile: String = "./public/runways.csv"

    val airportsData = Source.fromFile(new File(airportsFile), "ISO-8859-1").getLines.drop(1)
    val countriesData = Source.fromFile(new File(countriesFile), "ISO-8859-1").getLines.drop(1)
    val runwaysData = Source.fromFile(new File(runwaysFile), "ISO-8859-1").getLines.drop(1)

}