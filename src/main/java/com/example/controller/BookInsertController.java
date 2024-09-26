package com.example.controller;

import com.example.entity.BookDTO;
import com.example.repository.BookDAO;
import com.example.repository.BookDAOMyBatis;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/insert")
public class BookInsertController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 폼에서 넘어온 파라메터를 받기(4개)
        req.setCharacterEncoding("utf-8"); // 추가
        String title=req.getParameter("title");
        int price=Integer.parseInt(req.getParameter("price")); // "11"->11
        String author=req.getParameter("author");
        int page=Integer.parseInt(req.getParameter("page")); // 11
        // DTO 담아서->DAO에서 테이블에 저장....->  다시 리스트페이지로 전송 : 숙제(월)
        BookDTO dto=new BookDTO();
        dto.setTitle(title);
        dto.setPrice(price);
        dto.setAuthor(author);
        dto.setPage(page);

        //BookDAO dao=new BookDAO();
        BookDAOMyBatis dao=new BookDAOMyBatis();
        int cnt=dao.bookInsert(dto);

        if(cnt>0){ // 성공
            resp.sendRedirect("/s4/list"); // http://localhost:8081/s4/list
        }else{
            throw new ServletException("error");
        }
    }
}
