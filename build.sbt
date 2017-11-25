val ScalatraVersion = "2.6.2"

organization := "pe.softweb"

name := "accesos"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.4"

resolvers += Classpaths.typesafeReleases

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
  "ch.qos.logback" % "logback-classic" % "1.1.5" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "9.2.15.v20160210" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
)

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.10"
libraryDependencies += "com.typesafe.slick" % "slick_2.12" % "3.2.1"
libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.6.4"

enablePlugins(SbtTwirl)
enablePlugins(ScalatraPlugin)

containerPort in Jetty := 8090