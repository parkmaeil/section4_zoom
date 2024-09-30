package com.example.controller;

import com.example.repository.BookDAOMyBatis;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class BookDeleteController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cpath=req.getContextPath(); // /s4
        System.out.println(cpath); // /s4
        // ?num=1
        //  요청파라메터를 얻기  ?num=3
        int num=Integer.parseInt(req.getParameter("num")); // "3"-->3
        //BookDAO dao=new BookDAO();
        BookDAOMyBatis dao=new BookDAOMyBatis();
        dao.deleteById(num); // 삭제성공
        resp.sendRedirect(   cpath+"/list");
    }
}
