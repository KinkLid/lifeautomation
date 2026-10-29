name := "LifeAutomation"
scalaVersion := "3.10.0"
version := "0.1.0"

val zioVersion = "2.1.26"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio" % zioVersion,
  "dev.zio"  %% "zio-http" % "3.11.6"
)