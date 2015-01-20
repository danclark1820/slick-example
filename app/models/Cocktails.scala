package models

import play.api.Play.current
import play.api.db.slick.Config.driver.simple._
import scala.slick.lifted._

case class Cocktail(id: Long, name: String)

class Cocktails(tag: Tag) extends Table[Cocktail](tag, "COCKTAILS") {
    def id = column[Long]("ID", O.PrimaryKey)
    def name = column[String]("NAME")
    def * = (id, name) <> (Cocktail.tupled, Cocktail.unapply _)
}





