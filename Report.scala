

object Report {

    //Creation Liste Tuple (country, nbAirports), Runways

    val countryAndNbAirports: List[(String, Int)] = airportsData.map(_.split(",")(8)).groupBy(identity).mapValues { _.size }.toList
    
    val runwaysLatitude: List[String] = runwaysData.map(x => Try { x.split(",")(8) }).groupBy(identity)
    .mapValues { _.size }.toList

    //Liste Triée de façon croissante ou décroissante
    
    val listeCountriesTrieeAsc: List[(String, Int)] = countryAndNbAirports.sortWith(_._2 < _._2)
    val listeCountriesrieeDesc: List[(String, Int)] = countryAndNbAirports.sortWith(-_._2 < -_._2)

    val listeRunways: List[String] = runwaysLatitude.sortWith(-_._2 < -_._2)

    //Top 10 
    
    val topTenLowestCountries: List[(String, Int)] = listeTrieeAsc.map { case (code, nb) => (getCountryWithCodeOrCountry(code), nb) }.take(10)
    val topTenHighestCountries: List[(String, Int)] = listeTrieeDesc.map { case (code, nb) => (getCountryWithCodeOrCountry(code), nb) }.take(10)

    val topTenRunways: List[String] = runwaysLatitude.take(10)    
    
    
    val runwaysType: Map[String, String] = runwaysData.map { x => (x.split(",")(2), x.split(",")(5)) }.toMap



}