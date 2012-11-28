import sbt._
import Keys._

object ApplicationBuild extends Build {

  val appName         = "spray-json-example"

  
  scalaVersion := "2.9.2"

  val main = Project(appName, new java.io.File(".")).settings(
    (libraryDependencies += "io.spray" %  "spray-json_2.9.2" % "1.2.2"),
    (resolvers += "spray repo" at "http://repo.spray.io"),
    (testOptions in Test := Nil)
  )

}

