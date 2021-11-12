

object Query{

    def get airportsAndRunways(countryOrCode : String): List[airportsAndRunways] = {
        
        val countryCode: String = getCodeWithCodeOrCountry(countryOrCode)
        val countryName: String = getCountryWithCodeOrCountry(countryOrCode)

        val airports: List[airportsAndRunways] = airportsData.filter { _.split(",")(8) == countryCode }
        .map { x => airportsAndRunways(countryName, x.split(",")(3)) }.toList

    
    }




}