package com.example.sd18104.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter("/detail")
public class AdminFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpSession session = httpServletRequest.getSession();
        String role = (String) session.getAttribute("role");
        if (role == null) {
            response.getWriter().append("Ban chua dang nhap");
        } else if (role.equals("User")) {
            response.getWriter().append("Ban khong duoc truy cap vao admin");
        } else {
            chain.doFilter(request, response);
        }
    }
}
