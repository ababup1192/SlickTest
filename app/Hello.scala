import scala.slick.driver.H2Driver.simple._

object Hello extends App {
  Database.forURL("jdbc:h2:mem:test1", driver = "org.h2.Driver") withSession {
    // Add your code here:

  }
}
