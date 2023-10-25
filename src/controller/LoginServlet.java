package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import model.ContoCorrente;
import model.Correntista;
import model.Dipendente;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dipendente dip2;
		
		
		  Dipendente dip= service.Dao.selectDip(request.getParameter("email"));
			/*	 if(dip!=null){
					// dip2= service.Dao.selectDip(dip,request.getParameter("pwd")); 
					 if(dip.getPwd().equals(request.getParameter("pwd"))==false){
						 request.getSession().setAttribute("msg", "pwd errata");
						 response.sendRedirect("errore.jsp");
					 }else{
						 request.getSession().setAttribute("x", dip);
						 response.sendRedirect("index.jsp");
					 }
					 
				   } 
	                else{
					 request.getSession().setAttribute("msg", "Email inesistente");
					 response.sendRedirect("errore.jsp");
				   }*/
 
				 if(dip==null){
					 request.getSession().setAttribute("msg", "Email inesistente");
					 response.sendRedirect("errore.jsp");
				 }
				 else{
					  if(dip.getPwd().equals(request.getParameter("pwd"))== true){
						  request.getSession().setAttribute("x", dip);
						  response.sendRedirect("index.jsp");
					  }else{
						 
						  request.getSession().setAttribute("msg", "pwd errata");
							response.sendRedirect("errore.jsp");
		 
					  }
	
				 }
				 }
	}
