<%--
  Created by IntelliJ IDEA.
  User: nguyenvv
  Date: 29/06/2023
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<c:set--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<p>Tên tôi là: ${ten}</p>
<p>Thông tin sinh viên</p>
<p>Họ tên: ${sinhVien.hoTen}</p>
<p>Lớp: ${sinhVien.lop}</p>
<p>Địa chỉ: ${sinhVien.diaChi}</p>

<p>Danh sach sinh vien</p>

<table class="table">
    <thead>
        <tr>
            <td>Ho ten</td>
            <td>Lop</td>
            <td>Dia chi</td>
        </tr>
    </thead>
    <tbody>
    <c:forEach items="${listSinhVien}" var="sinhVien">
        <tr>
            <td>${sinhVien.hoTen}</td>
            <td>${sinhVien.lop}</td>
            <td>${sinhVien.diaChi}</td>
        </tr>
    </c:forEach>

    </tbody>
</table>

</body>
</html>
