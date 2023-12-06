package homework;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
//    @Overridepackage homework;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@WebServlet("/hello")
//public class HelloServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            response.setContentType("text/html");
//            try (PrintWriter writer = response.getWriter()) {
//                writer.println("<html>");
//                writer.println("<head><title>Hello</title></head>");
//                writer.println("<body>");
//                writer.println("<h1>Hello from servlet!</h1>");
//                writer.println("</body>");
//                writer.println("</html>");
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        try(PrintWriter writer = resp.getWriter()){
//            writer.write("Hello");
//        }
//    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException{
        try{
            getServletContext().getRequestDispatcher("/photo.html").forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }
}
