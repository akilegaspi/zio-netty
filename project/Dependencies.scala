import sbt._
import Versions._

object Dependencies {
  val zio = Seq(
    zioOrg %% "zio" % zioVersion,
    zioOrg %% "zio-test" % zioVersion % "test",
    zioOrg %% "zio-test-sbt" % zioVersion % "test"
  )
  val netty = Seq(
    nettyOrg % "netty-all" % nettyVersion
  )
  val testFramework = Seq(new TestFramework("zio.test.sbt.ZTestFramework"))
}
