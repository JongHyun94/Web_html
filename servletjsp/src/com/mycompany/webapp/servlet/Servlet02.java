package com.mycompany.webapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet02 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
	System.out.println("Servlet02 - serviece() 실행");
	System.out.println("클라이언트 IP:" + req.getRemoteHost());//웹브라우저가 실행하는 컴퓨터의 ip주소 얻기

	
	RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/view02.jsp"); //dispatcher는 분배의 의미
	rd.forward(req, resp);
	//응답 내용을 전송
	}
}
