import sbt._

object Dependencies {
  private val scalatestVersion: String = "3.2.14"

  lazy val scalactic: ModuleID = "org.scalactic" %% "scalactic" % scalatestVersion
  lazy val scalatest: ModuleID = "org.scalatest" %% "scalatest" % scalatestVersion % Test
}
