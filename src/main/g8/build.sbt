import AssemblyKeys._

Statika.distributionProject

name := "$name$"

description := ""

organization := "$organization$"

libraryDependencies ++= Seq(
  "ohnosequences" % "fastapasta_2.10" % "0.3.0-SNAPSHOT"
)

resolvers += Resolver.sonatypeRepo("snapshots")

metadataObject := name.value

mergeStrategy in assembly <<= (mergeStrategy in assembly) { (old) =>
{
  case "about.html" => MergeStrategy.first
  case "avsl.conf" => MergeStrategy.first
  case x => old(x)
}
}
