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

@WebServlet("/updateForm")
public class BookUpdateFormController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // ?num=3
        int num=Integer.parseInt(req.getParameter("num"));
        BookDAO dao=new BookDAO();
       // BookDTO dto=dao.getById(num); //                        _____________
       // req.setAttribute("dto", dto); // dto(번지)---->|____________|
        RequestDispatcher rd=req.getRequestDispatcher("/WEB-INF/views/update.jsp");
        rd.forward(req, resp); //------------------------------------------|
    }
}
