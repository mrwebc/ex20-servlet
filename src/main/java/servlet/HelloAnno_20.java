package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
  ▣ 같은의미 다른표현
			1. 다이나믹웹프로젝트 = 웹어플리케이션 = 컨텍스트(context)
			2. 톰캣 = 서블릿이 존재하는 공간 = 서블릿 컨텍스트 = 톰캣컨테이너 = 서블릿엔진 = 서블릿컨테이너 = WAS(Web Application Server)

  html과 서블릿에 "/helloAno"라고 작성했을 때 경로의미는 약간 다르다.

  1. html은 port번호까지만 포함한 URL을 의미
      http://localhost:8081/helloAno  -> 컨텍스트 미포함
      
      따라서 아래처럼 컨텍스트를 포함해서 작성하거나 ./를 작성해야 한다.
      <form action="/ex2-servlet/helloAno>"
      <form action="./helloAno>"
      <form action="helloAno>"

  2. 서블릿은 컨텍스트까지 포함한 URL을 의미
      http://localhost:8081/ex2-servlet/helloAno
      
  3. @WebServlet()은 브라우저의 경로와 해당 서블릿을 연결하는 설정이다.
*/
@WebServlet("/helloAno")
public class HelloAnno_20 extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    System.out.println("Hello Anotation~!");
    
    //요청-데이터를 요구하는 것
    //응답-서버 프로그램이 데이터를 만들어 브라우저로 보내는 것
    
    //요청과 응답에 대한 인코딩설정
    request.setCharacterEncoding("utf-8");
    response.setContentType("text/html;charset=utf-8");
    
    String name = request.getParameter("name");
    
    //PrintWriter 객체를 이용해서 브라우저쪽으로 출력처리
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
    out.printf("Hello %s~!",name);
    out.write("</h1>\r\n");
    out.write("</body>\r\n");
    out.write("</html>");
    
    out.close();
    
  }

  

}






