package class


case class Country(idCountry: String, codeCountry: String, nameCountry: String)



case class Airport(idAirport: String, identAirport: String, typesAirport: String, nameAirport: String, latitudeDegAirport: String, longitudeDegAirport: String,
                    elevationFtAirport: String, continentAirport: String, isoCountryAirport: String, isoRegionAirport: String,
                    municipalityAirport: String, scheduledServiceAirport: String, gpsCodeAirport: String, iataCodeAirport: String,
                    localCodeAirport: String, homeLinkAirport: String, wikipediaLinkAirport: String, keywordsAirport: String)



case class Runway(idRunway: String, airportRefRunway: String, airportIdentRunway: String, lengthFtRunway: String, widthFtRunway: String,
                    surfaceRunway: String, lightedRunway: String, closedRunway: String, leIdentRunway: String, leLatitudeDegRunway: String,
                    leLongitudeDegRunway: String, leElevationFtRunway: String, leHeadingDegTRunway: String,
                    leDisplacedThreshold_ftRunway: String, heIdentRunway: String, heLatitudeDegRunway: String, heLongitudeDegRunway: String,
                    heElevationFtRunway: String, heHeadingDegTRunway: String, heDisplacedThresholdFtRunway: String)