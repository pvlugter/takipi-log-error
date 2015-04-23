lazy val takipiLogError = project
  .in(file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "takipi-log-error",
    organization := "org.sample",
    version := "0.1-SNAPSHOT",
    autoScalaLibrary := false,
    libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.12",
    bashScriptExtraDefines += """addJava -agentlib:TakipiAgent""",
    bashScriptExtraDefines += """addJava -Dtakipi.silent=false"""
  )
