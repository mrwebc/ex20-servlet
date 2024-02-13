package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/anoServlet")
public class AnoServlet_40 extends HttpServlet{

  private static final long serialVersionUID = 1L;

  @Override
  protected void service(HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException {
    
      //응답인코딩 설정
      res.setCharacterEncoding("utf-8");
      res.setContentType("text/html;charset=utf-8");
    
      PrintWriter out = res.getWriter();            
      
      for(int i=0;i<10;i++) {
        out.println((i+1)+". 어노테이션으로 설정한 servlet <br />");        
      }
      
      out.close();
  }  
}
