<%--
  Created by IntelliJ IDEA.
  User: nguyenvv
  Date: 22/07/2023
  Time: 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <label class="form-label">Mã</label>
        <input type="text" class="form-control">
    </div>
    <div class="mb-3">
        <label class="form-label">Tên</label>
        <input type="text" class="form-control">
    </div>
    <div class="mb-3">
        <label class="form-label">Giá bán</label>
        <input type="text" class="form-control">
    </div>
    <button class="btn btn-primary">
        Submit
    </button>
</form>
<h1 style="text-align: center">Danh sach san pham</h1>

<table class="table">
    <thead>
    <tr>
        <td>Id</td>
        <td>Ma</td>
        <td>Ten</td>
        <td>Gia Ban</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listSanPham}" var="sp">
        <tr>
            <td>${sp.id}</td>
            <td>${sp.ma}</td>
            <td>${sp.ten}</td>
            <td>${sp.giaBan}</td>
            <td>
                <a class="btn btn-primary" href="/detailSP?id=${sp.id}" >Detail</a>
<%--                <a class="btn btn-primary" href="/delete?id=${sinhVien.id}">Xoa</a>--%>
            </td>
        </tr>
    </c:forEach>

    </tbody>
</table>

</body>
</html>
