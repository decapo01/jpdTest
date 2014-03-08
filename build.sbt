name := "jpdTest"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "japid42" % "japid42_2.10" % "0.9.16"
)     


resolvers += Resolver.url("My GitHub Play Repository", url("http://branaway.github.io/releases/"))(Resolver.ivyStylePatterns)

play.Project.playJavaSettings
