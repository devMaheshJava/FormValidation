package com.he.formValidation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.he.formValidation.Regex;

public class CommentServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    {
            try {
				request.getRequestDispatcher("/WEB-INF/jsp/comment.jsp").forward(request, response);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String name=    request.getParameter("name");
            String email=    request.getParameter("email");
            String url=    request.getParameter("url");
            String comment=    request.getParameter("comment");
            String gender=    request.getParameter("gender");
            if(name==null) {
                request.setAttribute("invalidName", "Please enter a valid name");
            }else if(!name.matches("/^[a-zA-Z\\s]*$/")) {
            	request.setAttribute("invalidName", "Please use English characters and white space");
            }
            if(email==null) {
                request.setAttribute("invalidEmail", "Please enter a valid email");
            }else if(!email.matches(Regex.getEmailRegex())) {
                request.setAttribute("invalidEmail", "Please enter a valid email");
            }
            if(url==null) {
                request.setAttribute("invalidWebsite", "Please enter a valid website url");
            }else if(!url.matches(Regex.getUrlRegex())) {
                request.setAttribute("invalidWebsite", "Please enter a valid website url");
            }
            if(gender==null) {
                request.setAttribute("invalidName", "Please enter a valid name");
            }else {
            	//female,male,other
            	if("female".equalsIgnoreCase(gender))
            	request.setAttribute("invalidGender", "Please choose valid gender option");
            	else if("male".equalsIgnoreCase(gender)) {
                	request.setAttribute("invalidGender", "Please choose valid gender option");               		
            	}else if("other".equalsIgnoreCase(gender)) {
                	request.setAttribute("invalidGender", "Please choose valid gender option");               		
            	}
            }
			request.getRequestDispatcher("/WEB-INF/jsp/comment.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
}
