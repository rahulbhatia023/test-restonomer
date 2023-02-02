name := "test-restonomer"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.13.10"

resolvers += "Restonomer Github Repo" at "https://maven.pkg.github.com/teamclairvoyant/restonomer/"

libraryDependencies += "com.clairvoyant.restonomer" %% "restonomer-core" % "1.0"