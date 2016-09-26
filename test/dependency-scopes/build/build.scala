import cbt._
import com.netflix.discovery.shared._

class Build(override val context: Context) extends BasicBuild(context) {

  def foo = {
    new MonitoredConnectionManager("test")
  }
}