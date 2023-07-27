<%--
  Created by IntelliJ IDEA.
  User: nguyenvv
  Date: 27/07/2023
  Time: 12:41
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
<form action="/addCtsp" method="post">
    <div class="mb-3">
        <label class="form-label">Mã Sản phầm</label><br/>
        <select class="form-select form-select-lg mb-3" aria-label=".form-select-lg example" name="idSp">
         <c:forEach items="${listSp}" var="sp">
            <option value="${sp.id}">${sp.ten}</option>

         </c:forEach>
        </select>
    </div>
    <div class="mb-3">
        <label class="form-label">Nam BH</label>
        <input type="text" class="form-control" name="namBh">
    </div>
    <div class="mb-3">
        <label class="form-label">Mô tả</label>
        <input type="text" class="form-control" name="moTa">
    </div>
    <div class="mb-3">
        <label class="form-label">Số lượng tồn</label>
        <input type="text" class="form-control" name="soLuongTon">
    </div>
    <div class="mb-3">
        <label class="form-label">giá nhập</label>
        <input type="text" class="form-control" name="giaNhap">
    </div>
    <div class="mb-3">
        <label class="form-label">Giá bán</label>
        <input type="text" class="form-control" name="giaBan">
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
        <td>Tên SP</td>
        <td>Năm BH</td>
        <td>Mô tả</td>
        <td>Số lượng tồn</td>
        <td>giá nhập</td>
        <td>Giá bán</td>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${listCtsp}" var="ctsp">
    <tr>
        <td>${ctsp.id}</td>
        <td>${ctsp.sanPham.ten}</td>
        <td>${ctsp.namBh}</td>
        <td>${ctsp.moTa}</td>
        <td>${ctsp.soLuongTon}</td>
        <td>${ctsp.giaNhap}</td>
        <td>${ctsp.giaBan}</td>
        <td>
            <a class="btn btn-primary" href="/detailSP?id=${sp.id}">Detail</a>
            <a class="btn btn-primary" href="/deleteSp?id=${sp.id}">Xoa</a>
        </td>
    </tr>
        </c:forEach>

    </tbody>
</table>

</body>
</html>
