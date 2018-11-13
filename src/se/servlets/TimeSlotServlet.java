package se.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TimeSlotServlet extends HttpServlet {
    
   private static final long serialVersionUID = 1L;
 
    
   public TimeSlotServlet() {
   }
 
   @Override
   protected void doPost(HttpServletRequest request,
           HttpServletResponse response) throws ServletException, IOException {
	   
	   String name = request.getParameter("name");
	   String startTime = request.getParameter("start");
	   String endTime = request.getParameter("end");
       
	   System.out.println("start: " + startTime);
       System.out.println("end: " + endTime);
	   
	   PrintWriter writer = response.getWriter();
	   
	   String htmlRespone = "<html>";
	   htmlRespone += "<h2>Name: " + name + "</h2>";
	   htmlRespone += "<h2>StartTime: " + startTime + "</h2>";
	   htmlRespone += "<h2>EndTime: " + endTime + "</h2>";
	   htmlRespone += "</html>";
	   

       writer.println(htmlRespone);
	   

   }
 
 
}