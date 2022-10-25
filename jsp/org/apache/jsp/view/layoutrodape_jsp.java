package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class layoutrodape_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<footer class=\"text-white text-center text-lg-start\" \r\n");
      out.write("          style=\"background-color: #03567c;\">\r\n");
      out.write("          \r\n");
      out.write("            <!-- Grid container -->\r\n");
      out.write("            <div class=\"container p-4\">\r\n");
      out.write("              <!--Grid row-->\r\n");
      out.write("              <div class=\"row mt-4\">\r\n");
      out.write("                <!--Grid column-->\r\n");
      out.write("                <div class=\"col-lg-4 col-md-12 mb-4 mb-md-0\">\r\n");
      out.write("                  <h5 class=\"text-uppercase mb-4 text-white\">Sobre a empresa</h5>\r\n");
      out.write("        <p class=\"text-white\">\r\n");
      out.write("                    Sua viagem com a melhor agência, venha viajar com a InterWorld, \r\n");
      out.write("                    a mais de 10 anos no mercado, contamos com os melhores preços de passagem, hoteis e companhias áereas,\r\n");
      out.write("                     presente em mais de 20 paises, \r\n");
      out.write("                    entre eles Canada, Estados Unidos, Russia, Portugal.\r\n");
      out.write("                  </p>\r\n");
      out.write("        \r\n");
      out.write("                  <div class=\"mt-4\">\r\n");
      out.write("                    <!-- Facebook -->\r\n");
      out.write("                    <a type=\"button\" class=\"btn btn-floating btn-light btn-lg\"><i class=\"fab fa-facebook-f\" style=\"color:rgb(36, 129, 172);\"></i></a>\r\n");
      out.write("                    <!-- Dribbble -->\r\n");
      out.write("                    <a type=\"button\" class=\"btn btn-floating btn-light btn-lg\"><i class=\"fab fa-dribbble\" style=\"color:rgb(36, 129, 172);\"></i></a>\r\n");
      out.write("                    <!-- Twitter -->\r\n");
      out.write("                    <a type=\"button\" class=\"btn btn-floating btn-light btn-lg\"><i class=\"fab fa-twitter\" style=\"color:rgb(36, 129, 172);\"></i></a>\r\n");
      out.write("                    <!-- Google + -->\r\n");
      out.write("                    <a type=\"button\" class=\"btn btn-floating btn-light btn-lg\"><i class=\"fab fa-google-plus-g\" style=\"color:rgb(36, 129, 172);\"></i></a>\r\n");
      out.write("                    <!-- Linkedin -->\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--Grid column-->\r\n");
      out.write("        \r\n");
      out.write("                <!--Grid column-->\r\n");
      out.write("                <div class=\"col-lg-4 col-md-6 mb-4 mb-md-0\">\r\n");
      out.write("                  <h5 class=\"text-uppercase mb-4 pb-1\">PESQUISE ALGUMA COISA</h5>\r\n");
      out.write("        \r\n");
      out.write("                  <div class=\"form-outline form-white mb-4\">\r\n");
      out.write("                    <input type=\"text\" id=\"formControlLg\" class=\"form-control form-control-lg\" />\r\n");
      out.write("                    <label class=\"form-label\" for=\"formControlLg\">Buscar</label>\r\n");
      out.write("                  </div>\r\n");
      out.write("        \r\n");
      out.write("                  <ul class=\"fa-ul\" style=\"margin-left: 1.65em;\">\r\n");
      out.write("                    <li class=\"mb-3\">\r\n");
      out.write("                      <span class=\"fa-li\"><i class=\"fas fa-home\"></i></span><span class=\"ms-2\">\r\n");
      out.write("                        Rua Marechal Deodoro, Taquaritinga, SP\r\n");
      out.write("                      </span>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"mb-3\">\r\n");
      out.write("                      <span class=\"fa-li\"><i class=\"fas fa-envelope\"></i></span><span class=\"ms-2\">\r\n");
      out.write("                        InterWorldcontato@gmail.com\r\n");
      out.write("                      </span>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"mb-3\">\r\n");
      out.write("                      <span class=\"fa-li\"><i class=\"fas fa-phone\"></i></span><span class=\"ms-2\">\r\n");
      out.write("                        + 01 234 567 34\r\n");
      out.write("                      </span>\r\n");
      out.write("                    </li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--Grid column-->\r\n");
      out.write("        \r\n");
      out.write("                <!--Grid column-->\r\n");
      out.write("                <div class=\"col-lg-4 col-md-6 mb-4 mb-md-0\">\r\n");
      out.write("                  <h5 class=\"text-uppercase mb-4\">HORÁRIO DE FUNCIONAMENTO</h5>\r\n");
      out.write("        \r\n");
      out.write("                  <table class=\"table text-center text-white\">\r\n");
      out.write("                    <tbody class=\"fw-normal\">\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td>Seg - Ter:</td>\r\n");
      out.write("                        <td>8am - 9pm</td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td>Sex - Sab:</td>\r\n");
      out.write("                        <td>8am - 1am</td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td>Dom:</td>\r\n");
      out.write("                        <td>9am - 10pm</td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                  </table>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--Grid column-->\r\n");
      out.write("              </div>\r\n");
      out.write("              <!--Grid row-->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Grid container -->\r\n");
      out.write("        \r\n");
      out.write("            <div class=\"text-center p-3\" style=\"background-color: #00405e;\">\r\n");
      out.write("              <a target=\"_blank\" href=\"https://icons8.com/icon/A1uYqrWuzOIR/travel\">Travel</a> icon by <a target=\"_blank\" href=\"https://icons8.com\">Icons8</a>\r\n");
      out.write("              © 2022<a class=\"text-white\" href=\"/index.html\"> InterWorld.com</a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </footer>\r\n");
      out.write("  </main>\r\n");
      out.write("</main>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
