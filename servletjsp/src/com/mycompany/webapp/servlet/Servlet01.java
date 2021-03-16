package com.mycompany.webapp.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet01")
public class Servlet01 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Servlet01 - serviece() 실행");
		//요청 내용을 확인
		System.out.println("클라이언트 IP:" + req.getRemoteHost());//웹브라우저가 실행하는 컴퓨터의 ip주소 얻기
		//요청 처리
		
		//응답내용을 생성
//		resp.setContentType("text/html; charset=UTF-8");
//		Writer writer = resp.getWriter();  //PrintWriter로 만들어도됨
//		writer.write("<html>");
//		writer.write("<head></head>");
//		writer.write("<body>");
//		writer.write("Servlet01<hr/>");
//		writer.write("</body>");
//		writer.write("</html>");
//		writer.flush();
//		writer.close();
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/view01.jsp"); //dispatcher는 분배의 의미
		rd.forward(req, resp);
		//응답 내용을 전송
	}

}
