<%--
  Created by IntelliJ IDEA.
  User: nguyenvv
  Date: 22/07/2023
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body class="container">
<form action="/updateSp" method="post">
    <div class="mb-3">
        <label class="form-label">ID</label>
        <input type="text" class="form-control" value="${sanPham.id}" name="id">
    </div>
    <div class="mb-3">
        <label class="form-label">Mã</label>
        <input type="text" class="form-control" value="${sanPham.ma}" name="ma">
    </div>
    <div class="mb-3">
        <label class="form-label">Tên</label>
        <input type="text" class="form-control" value="${sanPham.ten}" name="ten">
    </div>
    <div class="mb-3">
        <label class="form-label">Giá bán</label>
        <input type="text" class="form-control" value="${sanPham.giaBan}" name="giaBan">
    </div>
    <button class="btn btn-primary">
        Submit
    </button>
</form>
</body>
</html>
