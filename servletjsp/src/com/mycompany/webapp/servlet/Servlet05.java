package com.mycompany.webapp.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.webapp.controller.Controller05;
import com.mycompany.webapp.dto.Board;

public class Servlet05 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	System.out.println("Servlet05 - serviece() 실행");
	
	//컨트롤러 생성 및 요청 처리 메소드 호출
	Controller05 ctrl = new Controller05();
	String viewName = ctrl.getBoardList(request, response);
	String prefix="/WEB-INF/views/";
	String suffix = ".jsp";
	
	//응답 내용을 생성 및 전송
	RequestDispatcher rd = request.getRequestDispatcher(prefix+ viewName + suffix); //dispatcher는 분배의 의미
	rd.forward(request, response);
	}
}
