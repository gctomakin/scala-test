
package views.html.templates

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object header_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<head>
    <title>"""),_display_(/*4.13*/title),format.raw/*4.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*5.50*/routes/*5.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*5.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*6.55*/routes/*6.61*/.Assets.versioned("images/favicon.png")),format.raw/*6.100*/("""">
    <script src=""""),_display_(/*7.19*/routes/*7.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*7.66*/("""" type="text/javascript"></script>
</head>"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object header extends header_Scope0.header
              /*
                  -- GENERATED --
                  DATE: Sat Oct 10 15:14:03 PHT 2015
                  SOURCE: /Volumes/Development/Sublime Projects/scala-test/app/views/templates/header.scala.html
                  HASH: b229e0dcf2a20c758c7eb85099b76d4945435097
                  MATRIX: 539->1|649->16|677->18|722->37|747->42|831->100|845->106|906->147|989->204|1003->210|1063->249|1110->270|1124->276|1185->317
                  LINES: 20->1|25->1|27->3|28->4|28->4|29->5|29->5|29->5|30->6|30->6|30->6|31->7|31->7|31->7
                  -- GENERATED --
              */
          