
package views.html.partials

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""home"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Sat Oct 10 15:17:28 PHT 2015
                  SOURCE: /Volumes/Development/Sublime Projects/scala-test/app/views/partials/home.scala.html
                  HASH: 61cedc25db96ee378d1502d63d8047f3cdf49df6
                  MATRIX: 616->0
                  LINES: 25->1
                  -- GENERATED --
              */
          