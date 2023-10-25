<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import ="model.Dipendente" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<% Dipendente d=(Dipendente)session.getAttribute("x"); %>  

  <h1 >Ciao <%=d.getNome() %> </h1>

<div class="row" style="border: 1px grey solid ; margin-left: 320px; margin-top:40px;width: 500px; align-self: center;background-color: gainsboro ;">
    <form action="TestServlet" method="post" style="left: 20px;">
      
    <div class="mb-3 row">
      <label for="codFiscale" class="col-sm-offset-5 ">Codice fiscale</label>
      <div class="col-sm-offset-5">
        <input type="text"  name="codFiscale"  class="form-control-plaintext">
      </div>
    </div>
    <div class="mb-3 row">
      <label for="nome" class="col-sm-offset-5 col-form-label">Nome</label>
      <div class="col-sm-offset-5">
        <input type="text"  name="nome"  class="form-control-plaintext">
      </div>
    </div>
    <div class="mb-3 row">
      <label for="cognome" class="col-sm-offset-5 col-form-label">Cognome</label>
      <div class="col-sm-offset-5">
        <input type="text"  name="cognome"  class="form-control-plaintext">
      </div>
    </div>
    <div class="mb-3 row">
      <label for="via" class="col-sm-offset-5 col-form-label">Indirizzo</label>
      <div class="col-sm-offset-5">
        <input type="text"  name="via"   class="form-control-plaintext">
      </div>
      </div>
					<input type="email" name="email" class="form-control" placeholder="pio@libero.it">
						
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="password" name ="pwd" class="form-control" placeholder="password">
					</div>
    </div>
    <br>
     <div class="col-sm-offset-5">
       <input type="submit" value="Salva" class="btn btn-secondary">
      </div>
      
      
      </form>
      </div>
</body>
</html>