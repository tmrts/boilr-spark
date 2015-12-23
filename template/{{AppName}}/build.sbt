name := "{{ProjectName}}"

version := "{{ProjectVersion}}"

scalaVersion := "{{ScalaVersion}}"

description := "{{ProjectDescription}}"

organization := "{{OrganizationPackage}}"

organizationName := "{{OrganizationName}}"

homepage := Some(url("{{OrganizationWebsite}})")

libraryDependencies ++= Seq(
"org.apache.spark" %% "spark-core" % "1.1.0" % "provided",
"org.apache.spark" %% "spark-streaming" % "1.1.0" % "provided",
"org.apache.spark" %% "spark-mllib" % "1.1.0" % "provided",
"org.scalatest" %% "scalatest" % "2.2.1" % "test"
)
