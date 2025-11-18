/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package murach.email;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.WebServlet;
/**
 *
 * @author ASUS
 */
@WebServlet("/test")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, 
                         HttpServletResponse response)
            throws ServletException, IOException {
        
        // Thiết lập kiểu nội dung trả về cho trình duyệt
        response.setContentType("text/html");
        
        // Dùng PrintWriter để viết thẳng văn bản ra trình duyệt
        PrintWriter out = response.getWriter();
        // Bước 4: Hiển thị thông báo "TestServlet Get"
        out.println("<h1>TestServlet Get</h1>");
        out.println("<p>Yeu cau GET da duoc xu ly thanh cong.</p>");
    }
    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response)
            throws ServletException, IOException {
        
        // Thiết lập kiểu nội dung trả về cho trình duyệt
        response.setContentType("text/html");
        
        // Dùng PrintWriter để viết thẳng văn bản ra trình duyệt
        PrintWriter out = response.getWriter();
        out.println("<h1>TestServlet Post</h1>");
        out.println("<p>Yeu cau POST da duoc xu ly thanh cong.</p>");
    }
}