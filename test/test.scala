import models.airport
import models.Query
import models.Report
import org.scalatest.matchers.must.Matchers


object test {

    class testControl extends Matchers {
        
        Report.topCountries() shouldBe a [List[(String, Int)]]

    }

}