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
<body class="container">
<form action="">
    <div class="mb-3">
        <label class="form-label">Ho Ten</label>
        <input type="text" class="form-control">
    </div>
    <div class="mb-3">
        <label class="form-label">Lop</label>
        <input type="text" class="form-control">
    </div>
    <div class="mb-3">
        <label class="form-label">Dia chi</label>
        <input type="text" class="form-control">
    </div>
    <button class="btn btn-primary">
        Submit
    </button>
</form>
<h1 style="text-align: center">Danh sach sinh vien</h1>

<table class="table">
    <thead>
    <tr>
        <td>Id</td>
        <td>Ho ten</td>
        <td>Lop</td>
        <td>Dia chi</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listSinhVien}" var="sinhVien">
        <tr>
            <td>${sinhVien.id}</td>
            <td>${sinhVien.hoTen}</td>
            <td>${sinhVien.lop}</td>
            <td>${sinhVien.diaChi}</td>
            <td>
                <a class="btn btn-primary" href="/detail?id=${sinhVien.id}" >Detail</a>
                <a class="btn btn-primary">Xoa</a>
            </td>
        </tr>
    </c:forEach>

    </tbody>
</table>

</body>
</html>
