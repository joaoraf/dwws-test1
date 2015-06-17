// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// The Sonatype snapshots repository
resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.0")

// Use the Scalariform plugin to reformat the code
addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.3.0")

// Coverage tests
//
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.0.4")

// Publishes coverage results to Coverall
addSbtPlugin("org.scoverage" % "sbt-coveralls" % "1.0.0")


// Git access
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.8.4")

// Bintray
addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")
