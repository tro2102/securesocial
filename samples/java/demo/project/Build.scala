import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "ssdemo-java"
    val appVersion      = "1.0"

    val appDependencies = Seq(
	javaCore,
        "securesocial" %% "securesocial" % "2.1.0"
    )

    val main = play.Project(appName, appVersion, appDependencies).settings(
	resolvers += Resolver.url("sbt-plugin-releases", new URL("http://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)
    )

}
