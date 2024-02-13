package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//서블릿은 브라우저로 접속해서 실행하는 자바 클래스(프로그램)이다.
//서블릿은 HTML 소스코드를 동적으로 생성해주는 자바 프로그램이다.
//서블릿 프로그램의 출력대상은 브라우저다.
public class HelloXml_10 extends HttpServlet{

private static final long serialVersionUID = 1L;

  @Override
  public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      System.out.println("Hello XML~!");
  
      //요청과 응답에 대한 인코딩설정
      request.setCharacterEncoding("utf-8");
      response.setContentType("text/html;charset=utf-8");
  
      String name = request.getParameter("name");
      PrintWriter out = response.getWriter();
      
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>직접 만든 서블릿</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <h1>");
      out.printf("HelloXml %s~!",name);
      out.write("</h1>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      
      out.close();
  }
}
