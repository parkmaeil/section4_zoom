package com.example.controller;

import com.example.entity.BookDTO;
import com.example.repository.BookDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update")
public class BookUpdateController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         // 파라메터 5개를 가져오기(num, title, price, author, page)
         // ->BookDTO : 1. 파라메터를 수집(DTO)
        req.setCharacterEncoding("utf-8");
        int num=Integer.parseInt(req.getParameter("num"));
        String title=req.getParameter("title");
        int price=Integer.parseInt(req.getParameter("price"));
        String author=req.getParameter("author");
        int page=Integer.parseInt(req.getParameter("page"));
        BookDTO dto=new BookDTO();
        //dto.setNum(num);
        dto.setTitle(title);
        dto.setPrice(price);
        dto.setAuthor(author);
        dto.setPage(page);

         BookDAO dao=new BookDAO();
       //  dao.update(num, dto); // 수정성공
         resp.sendRedirect("/s3/list");
    }
}
