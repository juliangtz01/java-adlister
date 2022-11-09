package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.MySQLAdsDao;
import com.codeup.adlister.dao.MySQLUsersDao;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {

        // TODO: show the registration form
        if(request.getSession().getAttribute("user") != null)
        {
            response.sendRedirect("/profile");
        }
        else
        {
            request.getRequestDispatcher("/WEB-INF/ads/register.jsp").forward(request, response);
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        // TODO: ensure the submitted information is valid
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        boolean validAttempt = !username.isEmpty() && !email.isEmpty() && !password.isEmpty();
        if(validAttempt)
        {
            // TODO: create a new user based off of the submitted information
            User newUser = new User();

            newUser.setUsername(username);
            newUser.setEmail(email);
            newUser.setPassword(password);
            newUser.setId(DaoFactory.getUsersDao().insert(newUser));

            // TODO: if a user was successfully created, send them to their profile
            request.getSession().setAttribute("user", newUser);
            response.sendRedirect("/profile");
        }
        else
            response.sendRedirect("/register");


    }
}
