import Dependencies._
ThisBuild / scalaVersion := "2.13.3"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "me.akilegaspi"
ThisBuild / organizationName := "me.akilegaspi"
ThisBuild / licenses := List(
  "Apache-2.0" -> url("http://www.apache.org/licences/LICENSE-2.0")
)
developers := List(
  Developer(
    "akilegaspi",
    "Adrian King Legaspi",
    "aki.legaspi@gmail.com",
    url("http://akilegaspi.me")
  )
)

lazy val root = (project in file(".")).settings(
    name := "zio-netty",
    libraryDependencies := Dependencies.zio ++ Dependencies.netty,
    testFrameworks := Dependencies.testFramework
  )
