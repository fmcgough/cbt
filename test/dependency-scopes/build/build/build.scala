import cbt._

class Build(override val context: Context) extends BuildBuild {

  override def dependencies = super.dependencies ++
    Resolver(mavenCentral).bind(
      // Runtime dependency on apache httpcomponents (and a whole bunch of other stuff)
      MavenDependency("com.netflix.eureka", "eureka-client", "1.5.6",
        transitiveScope = TransitiveScope.runtime)
    )
}