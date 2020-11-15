package com.fosu.crm.settings.web.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("UserController!!!");

        String path = request.getServletPath();
        System.out.println(path);
        if("/settings/user/save.do".equals(path)){

        }else if(" ".equals(path)){

        }
    }
}
