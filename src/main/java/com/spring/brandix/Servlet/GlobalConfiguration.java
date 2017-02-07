package com.spring.brandix.Servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * Created by Nuwan-PC on
 */
@WebServlet(name = "MyServlet",
        urlPatterns = {"/hello"})
public class GlobalConfiguration extends HttpServlet{
    //@Override
    public void doGet(ServletRequest req, ServletResponse res) throws ServletException,IOException {
        res.getWriter().println("Hello World!!");
        //communicating a simple String message.

        String message = "Example source code of Servlet to JSP communication.";
        req.setAttribute("message", message);
       req.getRequestDispatcher("index.jsp").forward(req,res);


    }
}
