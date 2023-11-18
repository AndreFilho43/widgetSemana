ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.0"

enablePlugins(JavaAppPackaging)

lazy val root = (project in file("."))
  .settings(
    name := "widgetSemana",
    version := "1.0",
    scalaVersion := "3.1.0",
    libraryDependencies ++= Seq(
      "org.openjfx" % "javafx-controls" % "17",
      "org.openjfx" % "javafx-fxml" % "17",
      "org.openjfx" % "javafx-graphics" % "17",
      "org.openjfx" % "javafx-base" % "17"
    )
  )
