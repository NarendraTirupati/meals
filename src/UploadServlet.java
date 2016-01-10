

import java.io.*;   
import javax.servlet.ServletException;   
import javax.servlet.http.*;   

import com.Upload.dao.MultipartRequest;
  
  
public class UploadServlet extends HttpServlet {  
	
  
public void doPost(HttpServletRequest request, HttpServletResponse response)   
    throws ServletException, IOException {   
  
response.setContentType("text/html");   
PrintWriter out = response.getWriter();   
           
MultipartRequest m=new MultipartRequest(request,"");   
out.print("successfully uploaded");   
} 
}