
package views.html.templates

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object base_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class base extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
        """),_display_(/*6.10*/header("Welcome to Play")),format.raw/*6.35*/("""
    """),format.raw/*7.5*/("""<body>
        """),_display_(/*8.10*/content),format.raw/*8.17*/("""
    """),format.raw/*9.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


}

/**/
object base extends base_Scope0.base
              /*
                  -- GENERATED --
                  DATE: Sat Oct 10 15:15:52 PHT 2015
                  SOURCE: /Volumes/Development/Sublime Projects/scala-test/app/views/templates/base.scala.html
                  HASH: 2c5844edb25b541ed0465754567fff2237c2a535
                  MATRIX: 533->1|643->16|671->18|740->61|785->86|816->91|858->107|885->114|916->119
                  LINES: 20->1|25->1|27->3|30->6|30->6|31->7|32->8|32->8|33->9
                  -- GENERATED --
              */
          