package com.example.sd18104.servlet;

import com.example.sd18104.entity.Account;
import com.example.sd18104.repository.AccountRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        AccountRepository accountRepository = new AccountRepository();
        Account account = accountRepository.getByUsername(username);
        if (account == null) {
            response.getWriter().append("Ban chua co tai khoan");
        } else if (!account.getPassword().equals(password)) {
            response.getWriter().append("Thong tin tai khoan mat khau khong chinh xac");
        } else {
            // login thanh cong
            HttpSession session = request.getSession();
            session.setAttribute("role", account.getRole());
            System.out.println("role: " + session.getAttribute("role").toString());
            response.sendRedirect("/home");

        }
    }
}

/*
/home => tat ca moi nguoi deu duoc vao
/detail chi co admin duoc xem
 */
