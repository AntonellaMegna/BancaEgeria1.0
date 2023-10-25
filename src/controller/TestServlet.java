package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ContoCorrente;
import model.Correntista;
import service.EmailUtil;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public TestServlet() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		 String msg=null;
		  ContoCorrente conto = service.Dao.selectConto();
	      Correntista cor = new Correntista(request.getParameter("codFiscale"),
	    		  request.getParameter("nome"),
	    		  request.getParameter("cognome"),
	    		  request.getParameter("via"),
	      		  conto,
	      		  LocalDate.now(),
	      		  LocalTime.now(), request.getParameter("email"), request.getParameter("pwd"));
	     
	    
	      if( service.Dao.insertCor(cor, conto)== true){
          	msg ="tutto ok ";
          	final String fromEmail = "esercizioemailjava@gmail.com"; //requires valid gmail id
      		final String password = "zfddjrtqdhrrwmji"; // correct password for gmail id
      		final String toEmail = "leuciopiograsso@gmail.com"; // can be any email id 
      		
      		System.out.println("TLSEmail Start");
      		Properties props = new Properties();
      		props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
      		props.put("mail.smtp.port", "587"); //TLS Port
      		props.put("mail.smtp.auth", "true"); //enable authentication
      		props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
      		//props.put("mail.smtp.ssl.protocols", "TLSv1.2");

            //create Authenticator object to pass in Session.getInstance argument
	Authenticator auth = new Authenticator() {
		//override the getPasswordAuthentication method
		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(fromEmail, password);
		}
	};
	Session session = Session.getInstance(props, auth);
	
	EmailUtil.sendEmail(session, toEmail,"TLSEmail Testing Subject", "TLSEmail Testing Body");
          }
          else{msg ="fallito ";}
    
	  	  System.out.println(msg);
	 
	}

}
