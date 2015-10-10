
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/templates/*3.11*/.base/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""

    """),_display_(/*5.6*/partials/*5.14*/.home()),format.raw/*5.21*/("""

""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sat Oct 10 15:17:28 PHT 2015
                  SOURCE: /Volumes/Development/Sublime Projects/scala-test/app/views/index.scala.html
                  HASH: 91e84efc9fbf6e1d139a0599018536bad6463c8a
                  MATRIX: 527->1|639->18|667->21|684->30|697->35|736->37|768->44|784->52|811->59|843->62
                  LINES: 20->1|25->1|27->3|27->3|27->3|27->3|29->5|29->5|29->5|31->7
                  -- GENERATED --
              */
          