error id: file://<WORKSPACE>/build.sbt:
file://<WORKSPACE>/build.sbt
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -zioVersion.
	 -zioVersion#
	 -zioVersion().
	 -scala/Predef.zioVersion.
	 -scala/Predef.zioVersion#
	 -scala/Predef.zioVersion().
offset: 158
uri: file://<WORKSPACE>/build.sbt
text:
```scala
name := "LifeAutomation"
scalaVersion := "3.10.0"
version := "0.1.0"

val zioVersion = "2.1.26"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio" % zioVersio@@n
)
```


#### Short summary: 

empty definition using pc, found symbol in pc: 