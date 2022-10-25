package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastraproduto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Cadastro de Produto</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouttopo.jsp", out, false);
      out.write("\r\n");
      out.write("  <form method=\"POST\" action=\"/cadastraproduto\">\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"mb-3\">\r\n");
      out.write("    <label for=\"descricao\" class=\"form-label\">Descrição</label>\r\n");
      out.write("    <input type=\"text\" class=\"form-control\" id=\"descricao\" name=\"descricao\">\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("   <div class=\"mb-3\">\r\n");
      out.write("    <label for=\"quantidade\" class=\"form-label\">Quantidade</label>\r\n");
      out.write("    <input type=\"text\" class=\"form-control\" id=\"quantidade\" name=\"quantidade\">\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("   <div class=\"mb-3\">\r\n");
      out.write("    <label for=\"valor\" class=\"form-label\">Valor</label>\r\n");
      out.write("    <input type=\"text\" class=\"form-control\" id=\"valor\" name=\"valor\">\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("   <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("   \r\n");
      out.write("  </form>\r\n");
      out.write("  \r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layoutrodape.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
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
