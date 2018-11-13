package se.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class RoomServlet extends HttpServlet {
    
   private static final long serialVersionUID = 1L;
 
    
   public RoomServlet() {
   }
 
   @Override
   protected void doPost(HttpServletRequest request,
           HttpServletResponse response) throws ServletException, IOException {

	   String name = request.getParameter("name");
	   String roomName = request.getParameter("room-name");
	   String capacity = request.getParameter("capacity");
       
	   PrintWriter writer = response.getWriter();
	   
	   String htmlRespone = "<html>";
	   htmlRespone += "<h2>Name: " + name + "</h2>";
	   htmlRespone += "<h2>RoomName: " + roomName + "</h2>";
	   htmlRespone += "<h2>Capacity: " + capacity + "</h2>";
	   htmlRespone += "</html>";
	   

       writer.println(htmlRespone);
	   

   }
 
 
}