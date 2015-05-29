organization := "net.hamnaberg"

name := "scalaz-stream-kafka"

scalaVersion := "2.11.6"

resolvers += "Scalaz Bintray Repo" at "https://dl.bintray.com/scalaz/releases"

libraryDependencies += "org.scalaz.stream" %% "scalaz-stream" % "0.7a"

libraryDependencies += "org.apache.kafka" %% "kafka" % "0.8.2.1"
