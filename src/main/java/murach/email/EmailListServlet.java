/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package murach.email;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.WebServlet;

import murach.business.User;
//import murach.data.UserDB;

/**
 *
 * @author ASUS
 */
@WebServlet("/emailList")

public class EmailListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {

//        String url = "/index.html";
        String url = "/index.jsp";

        // get current action
        String action = request.getParameter("action");
        // ex5.1- 7.Open the code for the servlet and add a statement that prints a debugging
        // message to the Tomcat console. This message should show the value of the
        // action parameter that's passed to the servlet
        System.out.println("DEBUG: action parameter = " + action);
        
        // ex05.1-9.Repeat the previous two steps, but use a log file this time. If you're using
        // NetBeans, it should display a tab for the Tomcat log file within its Output
        // window
        this.getServletContext().log("LOG: action parameter = " + action);
        
        if (action == null) {
            action = "join";  // default action
        }
        
        // pe rform action and set URL to appropriate page
        if (action.equals("join")) {
//            url = "/index.html";    // the "join" page
            url = "/index.jsp";
        }
        else if (action.equals("add")) {                
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String dateOfBirth = request.getParameter("dateOfBirth");
            String heardFrom = request.getParameter("heardFrom");
            String wantAnnouncements = request.getParameter("wantAnnouncements");
            String wantSendEmail = request.getParameter("wantSendEmail");
            String contactMethod = request.getParameter("contactMethod");

            // store data in User object and save User object in db
//            User user = new User(firstName, lastName, email, dateOfBirth, heardFrom, wantAnnouncements, wantSendEmail, contactMethod);

            
            String message;
            if (firstName == null || lastName == null || email == null || dateOfBirth == null || firstName.isEmpty() || lastName.isEmpty() ||  email.isEmpty() ||  dateOfBirth.isEmpty()) {
                message = "Please fill out all four text boxes.";
                url = "/index.jsp";
                request.setAttribute("message", message);
            } else {
                User user = new User(firstName, lastName, email, dateOfBirth, heardFrom, wantAnnouncements, wantSendEmail, contactMethod);
                message = "";
                url = "/thanks.jsp"; 
//              UserDB.insert(user);
                request.setAttribute("user", user); 
                request.setAttribute("message", message);
            }
            
            // set User object in request object and set URL
//            request.setAttribute("user", user); 
//            request.setAttribute("message", message);
//            url = "/thanks.jsp";   // the "thanks" page
        }
        
        // forward request and response objects to specified URL
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, 
                         HttpServletResponse response) 
                         throws ServletException, IOException {
        doPost(request, response);
    }    
}
