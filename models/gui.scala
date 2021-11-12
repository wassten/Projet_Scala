import java.awt.BorderLayout
import java.awt.Dimension
import javax.swing.table.TableCellEditor
import javax.swing.{AbstractCellEditor, JButton, JFrame, JScrollPane, JTable, JTextArea}

class SwingExample {
  val textArea = new JTextArea
  val mapSurfaceType: Map[String, String] = runwaysData.map { x => (x.split(",")(2), x.split(",")(5)) }.toMap

  val listCountryType: List[(String, String)] = airportsData.map { x =>
    (countryFromCode(x.split(",")(8)),
      Try { mapSurfaceType.get(x.split(",")(1)).get }.getOrElse(""))
  }

  val runwaysSurfacePerCountry: MapView[String, Set[String]] = listCountryType groupBy (_.1) mapValues
  { x => x.filterNot { .2 == "" }.map(._2).toSet }

  textArea.setText("Top 10 countries with highest number of airports :" )
  runwaysSurfacePerCountry.foreach(println)
  textArea.setText("Top 10 countries with lowest number of airports 😊 " +
    "textArea.setText("Top 10 countries with lowest number of airports :" + "\n" + runwaysSurfacePerCountry.mkString("\n"))


  val scrollPane = new JScrollPane(textArea)

  val frame = new JFrame("Hello, Swing")
  frame.getContentPane.add(scrollPane, BorderLayout.CENTER)
  frame.setSize(new Dimension(500, 500))
  frame.setLocationRelativeTo(null)
  frame.setVisible(true)

}

new SwingExample