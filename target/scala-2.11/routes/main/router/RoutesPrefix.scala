
// @GENERATOR:play-routes-compiler
// @SOURCE:/Volumes/Development/Sublime Projects/scala-test/conf/routes
// @DATE:Sat Oct 10 15:41:01 PHT 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
