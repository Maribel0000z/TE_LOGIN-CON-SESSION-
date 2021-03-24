package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_005f2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=divice-width, initial-sacle=1\"> \n");
      out.write("        <link rel = \"preconnect\" href = \"https://fonts.gstatic.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@600&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/a81368914c.js\"></script>\n");
      out.write("        <title> Animated Login Form</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <img class=\"wave\"src=\"img/wave.png\" />\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"img\">\n");
      out.write("                <img class=\"img\" src=\"img/img.svg\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"login-container\">\n");
      out.write("                <form action=\"Controlador\">\n");
      out.write("                    <img class=\"avatar\" src=\"img/avatar.svg\">\n");
      out.write("                    <h2>BIENVENIDO</h>\n");
      out.write("                    <div class=\"input-div one\">\n");
      out.write("                        <div class=\"i\">\n");
      out.write("                             <i class=\"fas fa-user\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div>\n");
      out.write("                            <h5>Usuario</h5>\n");
      out.write("                             <input class=\"input\" type=\" text\" name=\"txtnom\" placeholder=\"Ingrese Nombres\"> \n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"input-div two\">\n");
      out.write("                        <div class=\"i\">\n");
      out.write("                            <i class=\"fas fa-lock\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div>\n");
      out.write("                            <h5>Contraseña</h5>\n");
      out.write("                            <input class=\"input\" type=\"email\" name=\"txtCorreo\" placeholder=\"example@gmail.com\"> \n");
      out.write("                        </div>  \n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"#\">Forgot Password</a>\n");
      out.write("                    <input type=\"submit\" class=\"btn\" name=\"accion\" value=\"Ingresar\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"main.js\" type=\"text/javascript\"></script>\n");
      out.write("  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
