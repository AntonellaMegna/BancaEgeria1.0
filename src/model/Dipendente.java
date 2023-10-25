package model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

 

@NoArgsConstructor
@AllArgsConstructor
@Getter 
@Setter 

@Entity
@Table(name = "dipendente")
public class Dipendente {
	  @Id   
	  // solo se cambia il nome della variabile@Column(name = "email")
	  private String email;
	  private String cognome;
	  private String nome;
	  private String pwd;
	  
	  
	public Dipendente(String email, String pwd) {
		super();
		this.email = email;
		this.pwd = pwd;
	}
	
	 
	
}
