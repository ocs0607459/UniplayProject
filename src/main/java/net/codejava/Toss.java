package net.codejava;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Toss {
	
	@Id
	@GeneratedValue
	
	private Long id;

	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}

	private String bet;
	//private boolean married;

	public Toss(String bet, boolean married) {
		super();
		this.bet = bet;
		
	}

	



	public Toss() {
		// TODO Auto-generated constructor stub
	}

	public String getBet() {
		return bet;
	}

	public void setBet(String bet) {
		this.bet = bet;
	}

	@Override
	public String toString() {
		return "Toss [id=" + id + ", bet=" + bet + "]";
	}

}
