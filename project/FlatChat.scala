import sbt._
import sbt.Keys._

object FlatChatBuild extends Build {

    // make library => 'sbt + package' & 'sbt + make-pom' & 'sbt + publish'

    lazy val root = Project(id = "flat-chat", base = file("."),
        settings = Project.defaultSettings ++ Seq(
            name := "flat-chat",
            organization := "",
            description := "",

            version := "0.1-SNAPSHOT",

            scalaVersion := "2.10.3",

            libraryDependencies ++= Seq(
                "org.scalatest" %% "scalatest" % "1.9.2" % "test"
            )
        )
    )
}
