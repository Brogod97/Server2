package edu.kh.jsp.student.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kh.jsp.student.model.service.StudentService;
import edu.kh.jsp.student.model.vo.Student;

@WebServlet("/student/selectAll")
public class SelectAllServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 서비스 객체 생성
		StudentService service = new StudentService();

		try {
			// 학생 전체 조회 서비스 호출 후 결과 반환 받기
			List<Student> stdList = service.selectAll();

			// 조회 결과 request에 세팅
			req.setAttribute("stdList", stdList);

			// 요청 위임
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/student/selectAll.jsp");

			dispatcher.forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}