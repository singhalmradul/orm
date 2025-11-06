lazy val root = (project in file(".")).
settings(
  inThisBuild(List(
    organization := "io.github.singhalmradul",
    scalaVersion := "3.5.2",
  )),
  name := "orm",
)

libraryDependencies ++= Seq(
  "org.postgresql" %% "postgresql" % "42.7.8",
  "org.scalatest" %% "scalatest"  % "3.2.19" % Test,
)
