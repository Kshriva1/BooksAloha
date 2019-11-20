package com.semanticsquare.booksaloha.controllers;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.semanticsquare.booksaloha.entities.Book;
import com.semanticsquare.booksaloha.managers.BooksManager;

/**
 * Servlet implementation class MyBooks
 */
@WebServlet("/MyBooks")
public class MyBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyBooks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/*response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>"+
				"<meta charset=\"ISO-8859-1\">"+
				"<title>Books</title>"+
				"</head>"+
				"<body style=\"font-family:Arial;font-size:20px;\">"+
				"<div style=\"height:65px;align: center;background: #DB5227;font-family: Arial;color: white;\">"+
					"<br><b>"+
					"<a href=\"\" style=\"font-family:garamond;font-size:34px;margin:0 0 0 10px;color:white;text-decoration: none;\">Books<i>Aloha!</i></a></b>"+            	    	
				"</div>"+
				"<br><br>"+
				"<table>"+
				  "<tr>"+
				    "<td>"+
				     "<img src=\"http://photo.goodreads.com/books/1170846378m/73968.jpg\">"+
				    "</td>"+
				    
				    "<td style=\"color:gray;\">"+
				    " By <span style=\"color: #B13100;\">Erich Segal</span>"+
				     "<br><br>"+
				     "Rating: <span style=\"color: #B13100;\">3.44</span>"+
				    "</td>"+
				  "</tr>"+
				  "<tr>"+
				     "<td>&nbsp;</td>"+
				  "</tr>"+
				  "<tr>"+
				    "<td>"+
				    " <img src=\"http://ecx.images-amazon.com/images/I/21WBe6pNO5L._SX106_.jpg\" />"+
				    "</td>"+
				    "<td style=\"color:gray;\">"+
				    " By <span style=\"color:#B13100;\">Lillian Eichler Watson</span>"+
				    " <br><br>"+
				    "Rating: <span style=\"color: #B13100;\">5.0</span>"+
				    "</td>"+
				  "</tr>"+
				  
				   
				"</table>"+
				"</body>");
		out.println("</html>");*/
		
		//1.Get data from the model
		Collection<Book> myBooks = BooksManager.getInstance().getMyBooks();
		request.setAttribute("myBooks", myBooks);
		System.out.println(myBooks);
		
		//2.Forwarding to view
		RequestDispatcher dispatcher = request.getRequestDispatcher("MyBooks.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
