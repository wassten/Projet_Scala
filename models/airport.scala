import java.io.File
  

case class airportsAndRunways(country: String, airportName: String, runways: List[String] = List[String]())

object Airport {

    // Chargement données depuis les csv

    val airportsData = Source.fromFile(new File("./data/airports.csv"), "ISO-8859-1").getLines.drop(1).toList
    val countriesData = Source.fromFile(new File("./data/countries.csv"), "ISO-8859-1").getLines.drop(1).toList
    val runwaysData = Source.fromFile(new File("./data/runways.csv"), "ISO-8859-1").getLines.drop(1).toList


    // Tuple (code, country)

    val codeAndCountry: Map[String, String] = countriesData.map { x => (x.split(",")(1), x.split(",")(2)) }.toMap

    def getCodeWithCodeOrCountry(input: String): String = input.length match {
        case 2 => input
        case _ => codeAndCountry.get(input).get
    }

    def getCountryWithCodeOrCountry(input: String): String = input.length match {
        case 2 => codeAndCountry.get(input).get
        case _ => input
    }

}