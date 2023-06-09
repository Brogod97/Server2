package edu.kh.jsp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kh.jsp.model.vo.Person;

@WebServlet("/forEach")
public class forEachServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<Person> pList = new ArrayList<>();

		pList.add(new Person("홍길동", 25, "서울시 중구"));
		pList.add(new Person("가길동", 21, "서울시 서구"));
		pList.add(new Person("나길동", 22, "서울시 종로구"));
		pList.add(new Person("다길동", 23, "서울시 용산구"));
		pList.add(new Person("라길동", 24, "서울시 서대문구"));

		req.setAttribute("pList", pList);

		// 요청 위임
		RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/views/forEach.jsp");

		dispatcher.forward(req, resp);
	}
}