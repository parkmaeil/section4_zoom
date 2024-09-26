package com.example.controller;

import com.example.entity.BookDTO;
import com.example.repository.BookDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/detail")
public class BookDetailController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         //  요청파라메터를 얻기  ?num=3
        int num=Integer.parseInt(req.getParameter("num")); // "3"-->3
        //   DAO 와 연동
        BookDAO dao=new BookDAO(); // 객체생성?
       // BookDTO dto=dao.getById(num);
       // if(dto!=null){
       //  req.setAttribute("dto", dto); // 객체바인딩
         RequestDispatcher rd=req.getRequestDispatcher("/WEB-INF/views/detail.jsp");// ${dto}
         rd.forward(req, resp); // 포워딩(가장중요한기술)
        //}else{
        //    throw new ServletException("not found");  // ?(X)
       // }
    }
}
