package com.example.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register") //  servlet mapping
public class BookRegisterUiController  extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("실행됨");
        // register.jsp(등록폼)
        // forward(포워딩)
        RequestDispatcher rd =req.getRequestDispatcher("/WEB-INF/views/register.jsp");
        rd.forward(req, resp);
    }
}
