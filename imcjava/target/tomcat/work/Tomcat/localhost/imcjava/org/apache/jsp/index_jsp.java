/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-05-06 03:28:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


	public String valor (HttpServletRequest req, String param, String padrao) {
	
		String result = req.getParameter(param);
		if(result == null) {
			result = padrao;
			}
		return result;
	}
	
	public double toDouble (HttpServletRequest req, String param, String padrao) {
		return Double.parseDouble(valor(req, param, padrao));
	}
		
	
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>IMC</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap.min.css\"/>\n");
      out.write("</head>\n");
      out.write("<body style=\"background:#D8F6CE\">\n");
      out.write("\t<h1 style=\"color:black\">&nbsp;IMC - Cálculo do índice de massa corporal - calculo imc</h1>\n");
      out.write("\t<form>\n");
      out.write("\t<h4 style=\"color:black\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Peso</h4>\n");
      out.write("\t<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name=\"peso\" placeholder=\"Ex: 52Kg\"></p>\n");
      out.write("\t<br>\n");
      out.write("\t<h4 style=\"color:black\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Altura</h4>\n");
      out.write("\t<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name=\"altura\" placeholder=\"Ex: 162cm\"></p>\n");
      out.write("\n");
      out.write("\t<br>\n");
      out.write("\t<h4 style=\"color:black\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Sexo</h4>\n");
      out.write("\t<div class=\"form-group\">\n");
      out.write("\t  <div class=\"col-md-2\">\n");
      out.write("\t\t<select name=\"selectsexo\" class=\"form-control\">\n");
      out.write("\t\t  <option value=\"1\">Masculino</option>\n");
      out.write("\t\t  <option value=\"2\">Feminino</option>\n");
      out.write("\t\t</select>\n");
      out.write("\t  </div>\n");
      out.write("\t</div>\n");
      out.write("\t<button>Calcular</button>\n");
      out.write("\t\n");
      out.write("\t");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t");



		Double pesoD = toDouble(request, "peso", "0");

		Double alturaD = toDouble(request, "altura", "0");

		int sexo = Integer.parseInt(valor(request, "selectsexo", "1"));
		
	
      out.write("\n");
      out.write("\t\t</form>\n");
      out.write("\t<br>\n");
      out.write("\t<br>\n");
      out.write("\t<br>\n");
      out.write("\t<b>Resultado: Calcular.calcular(peso, altura, sexo);\n");
      out.write("\t\n");
      out.write("\t%></b>\n");
      out.write("\t<TABLE BORDER=1 style=\"margin: 15px\">\n");
      out.write("\t\t\t\t<TR style=\"background:#BDBDBD\"><TH>Condição</TH><TH>IMC em Mulheres</TH><TH>IMC em Homens</TH></TR>\n");
      out.write("\t\t\t\t<TR><TD>abaixo do peso</TD><TD>< 19,1</TD><TD>< 20,7</TD></TR>\n");
      out.write("\t\t\t\t<TR><TD>no peso normal</TD><TD>19,1 - 25,8</TD><TD>20,7 - 26,4</TD></TR>\n");
      out.write("\t\t\t\t<TR><TD>marginalmente acima do peso</TD><TD>25,8 - 27,3</TD><TD>26,4 - 27,8</TD></TR>\n");
      out.write("\t\t\t\t<TR><TD>acima do peso ideal</TD><TD>27,3 - 32,3</TD><TD>27,8 - 31,1</TD></TR>\n");
      out.write("\t\t\t\t<TR><TD>obeso</TD><TD>> 32,3</TD><TD>> 31,1</TD></TR>\n");
      out.write("\t\t\t</TABLE>\n");
      out.write("\t\t<img src=\"sucos.png\" class=\"moveimg\">\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
