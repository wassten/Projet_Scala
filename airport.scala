import scala.io.Source
import java.io.File  
  

case class airports_and_runways(country: String, airport_name: String, airport_code: String, runways: List[String] = List[String]())

object Airport {
    
    val airports_file: String = "./public/airports.csv"
    val countries_file: String = "./public/countries.csv"
    val runways_file: String = "./public/runways.csv"

    val airports_data = Source.fromFile(new File(airports_file), "ISO-8859-1").getLines.drop(1)
    val countries_data = Source.fromFile(new File(countries_file), "ISO-8859-1").getLines.drop(1)
    val runways_data = Source.fromFile(new File(runways_file), "ISO-8859-1").getLines.drop(1)

}