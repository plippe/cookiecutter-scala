lazy val root = (project in file(".")).
  settings(
    name := "{{cookiecutter.app_name}}",
    version := "0.0.1",
    scalaVersion := "{{cookiecutter.scala_version}}",
    libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.0" % "test"
  )
