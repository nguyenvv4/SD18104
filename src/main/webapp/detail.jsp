<%--
  Created by IntelliJ IDEA.
  User: nguyenvv
  Date: 11/07/2023
  Time: 13:27
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
<form action="/update" method="post">
    <div class="mb-3">
        <label class="form-label">Id</label>
        <input type="text" class="form-control"  value="${detail.id}" name="id">
    </div>
    <div class="mb-3">
        <label class="form-label">Ho Ten</label>
        <input type="text" class="form-control" value="${detail.hoTen}" name="hoTen">
    </div>
    <div class="mb-3">
        <label class="form-label">Lop</label>
        <input type="text" class="form-control" value="${detail.lop}" name="lop">
    </div>
    <div class="mb-3">
        <label class="form-label">Dia chi</label>
        <input type="text" class="form-control" value="${detail.diaChi}" name="diaChi">
    </div>
    <button class="btn btn-primary">
        Update
    </button>
</form>
</body>
</html>
