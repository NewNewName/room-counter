package se.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  
public class SessionServlet extends HttpServlet {
    
   private static final long serialVersionUID = 1L;
 
    
   public SessionServlet() {
   }
 
   @Override
   protected void doPost(HttpServletRequest request,
           HttpServletResponse response) throws ServletException, IOException {

	   String name = request.getParameter("name");
	   String sessionName = request.getParameter("name");
	   String sessionNumber = request.getParameter("session-number");
	   String speaker = request.getParameter("speaker");
	   String timeSlot = request.getParameter("time-slot");
	   String room = request.getParameter("room");
       
	   PrintWriter writer = response.getWriter();
	   
	   String htmlRespone = "<html>";
	   htmlRespone += "<h2>Name: " + name + "</h2>";
	   htmlRespone += "<h2>Session Name: " + sessionName + "</h2>";
	   htmlRespone += "<h2>Session Number: " + sessionNumber + "</h2>";
	   htmlRespone += "<h2>Speaker: " + speaker + "</h2>";
	   htmlRespone += "<h2>Time Slot: " + timeSlot + "</h2>";
	   htmlRespone += "<h2>Room: " + room + "</h2>";
	   htmlRespone += "</html>";
	   

       writer.println(htmlRespone);
	   

   }
 
 
}