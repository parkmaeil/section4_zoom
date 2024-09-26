<%@ page contentType="text/html;charset=UTF-8" language="java"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="cpath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>

    <div class="container">
      <h2>Web MVC Framework Advanced</h2>
      <div class="card">
        <div class="card-header">Book Detail</div>
        <div class="card-body">
           <table class="table table-bordered">
                <tr>
                   <td>번호</td>
                   <td>${dto.num}</td>
                </tr>
                <tr>
                   <td>제목</td>
                   <td>${dto.title}</td>
                </tr>
                <tr>
                   <td>가격</td>
                   <td>${dto.price}</td>
                </tr>
                <tr>
                   <td>저자</td>
                   <td>${dto.author}</td>
                </tr>
                <tr>
                   <td>페이지</td>
                   <td>${dto.page}</td>
                </tr>
                <tr>
                 <td colspan="2">
                     <button class="btn btn-sm btn-primary" id="updateBtn">수정</button>
                     <button class="btn btn-sm btn-danger" id="delBtn">삭제</button>
                     <!--
                     <button class="btn btn-sm btn-success" onclick="location.href='${cpath}/list'">리스트</button>
                     -->
                     <button class="btn btn-sm btn-success" id="listBtn">리스트</button>
                 </td>
                </tr>
           </table>
        </div>
        <div class="card-footer">박매일</div>
      </div>
    </div>
   <script>
       document.getElementById("listBtn").addEventListener("click", ()=>{
                    location.href="${cpath}/list";
       });
       document.getElementById("delBtn").addEventListener("click", ()=>{
                    location.href="${cpath}/delete?num="+${dto.num}; // GET(QueryString)
       });
      document.getElementById("updateBtn").addEventListener("click", ()=>{
                    location.href="${cpath}/updateForm?num="+${dto.num}; // GET(QueryString)
       });
   </script>
</body>
</html>