import scala.util.Try
import target.airport._

object Report {

    //Creation Liste Tuple (country, nbAirports), Runways

    val countryAndNbAirports: List[(String, Int)] = airportsData.map(_.split(",")(8)).groupBy(identity).view.mapValues { _.size }.toList
    

    def topCountries: Unit = {

        //Liste Triée de façon croissante ou décroissante
        
        val listeCountriesTrieeAsc: List[(String, Int)] = countryAndNbAirports.sortWith(_._2 < _._2)
        val listeCountriesrieeDesc: List[(String, Int)] = countryAndNbAirports.sortWith(-_._2 < -_._2)


        //Top 10 
        
        val topTenLowestCountries: List[(String, Int)] = listeCountriesTrieeAsc.take(10)
        val topTenHighestCountries: List[(String, Int)] = listeCountriesrieeDesc.take(10)

        println("Top 10 countries with highest number of airports :" + '\n')
        topTenHighestCountries.foreach(println)
        println('\n')
        println("Top 10 countries with lowest number of airports: " + '\n')
        topTenLowestCountries.foreach(println)
 
    }   
    
    def topRunways(): Unit = {
        val runwaysAndLat: List[String] = runwaysData.map(x => Try { x.split(",")(8) }.getOrElse("")).groupBy(identity)
      .view.mapValues { _.size }.toListé.take(10).map { case (id, count) => id }

        runwaysAndLat.foreach{println()
        }        
  }    



}