
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
    <link rel="stylesheet" media="screen" href=""""),_display_(/*6.50*/routes/*6.56*/.Bower.versioned("foundation/css/foundation.css")),format.raw/*6.105*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*7.55*/routes/*7.61*/.Assets.versioned("images/favicon.png")),format.raw/*7.100*/("""">
    <script src=""""),_display_(/*8.19*/routes/*8.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*8.66*/("""" type="text/javascript"></script>
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
                  DATE: Sat Oct 10 15:41:01 PHT 2015
                  SOURCE: /Volumes/Development/Sublime Projects/scala-test/app/views/templates/header.scala.html
                  HASH: 696ace63f1982f41f12172e1fbe3732b65b5e188
                  MATRIX: 539->1|649->16|677->18|722->37|747->42|831->100|845->106|906->147|984->199|998->205|1068->254|1151->311|1165->317|1225->356|1272->377|1286->383|1347->424
                  LINES: 20->1|25->1|27->3|28->4|28->4|29->5|29->5|29->5|30->6|30->6|30->6|31->7|31->7|31->7|32->8|32->8|32->8
                  -- GENERATED --
              */
          