package controllers

import play.api._
import play.api.mvc._

import play.api.Logger
import models.Cocktails
import play.api.db.slick.Config.driver.simple._

object Application extends Controller {

  def index = Action {
    Ok(TableQuery[Cocktails].ddl.createStatements.mkString)
  }

}
