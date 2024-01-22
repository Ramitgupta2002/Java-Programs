package hg;

import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/check")

public class hel extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
{
//set response content type
res.setContentType("text/html");
//get printWrite obj
PrintWriter pw = res.getWriter();
//read form data from page as request parameter
String name = req.getParameter("name");
int age = Integer.parseInt(req.getParameter("age"));
if (age>=18)
{
pw.println("<font color='green' size='4'>Welcome "+name+" to this  site</font>");
}
else
pw.println("<font color='red' size='4'>Hello "+name+", you are not authorized to visit the  site</font>");
//add hyperlink to dynamic page
pw.println("<br><br><a href= 'NewFile.html'>back</a>");
//close the stream
pw.close();
}
}
