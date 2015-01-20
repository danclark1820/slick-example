name := "slick-example"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "com.typesafe.play" %% "play-slick" % "0.6.1",
  "postgresql" % "postgresql" % "9.1-901.jdbc4"
)

play.Project.playScalaSettings
