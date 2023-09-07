import sbt._

object Dependencies {
  lazy val scalactic: ModuleID = "org.scalactic" %% "scalactic" % "3.2.17"
  lazy val scalatest: ModuleID = "org.scalatest" %% "scalatest" % "3.2.16" % Test
}
