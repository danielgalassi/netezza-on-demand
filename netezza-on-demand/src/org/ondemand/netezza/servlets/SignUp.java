package org.ondemand.netezza.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUp
 */
@WebServlet(description = "Servlet to validate account name rules", urlPatterns = { "/signup" })
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String account = ((String) request.getAttribute("accountname")).toUpperCase();
		boolean isAccountNameInvalid = false;
		if (account.startsWith("BIA_") ||
			account.startsWith("EIM_") ||
			account.equals("ADMIN")) {
			isAccountNameInvalid = true;
		}
		
	}

}
