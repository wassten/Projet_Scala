import java.io.File
  

case class airportsAndRunways(country: String, airportName: String, airportId: String, runways: List[String] = List[String]())

object Airport {

    val airportsData = Source.fromFile(new File("./data/airports.csv"), "ISO-8859-1").getLines.drop(1).toList
    val countriesData = Source.fromFile(new File("./data/countries.csv"), "ISO-8859-1").getLines.drop(1).toList
    val runwaysData = Source.fromFile(new File("./data/runways.csv"), "ISO-8859-1").getLines.drop(1).toList

}

Airport.airportsData