package it.polito.tdp.model;

public class Parola implements Comparable <Parola>{
	
	private String parola;
	
	//lista di parole

	public Parola(String parola) {
		super();
		this.parola = parola;
	}

	@Override
	public int compareTo(Parola altra) {
		return this.parola.compareTo(altra.getParola());
	}

	public String getParola() {
		return parola;
	}
	
	public String toString(){                   //se tolgo toString stampa una roba strana
		String risultato="";
		risultato = parola+ " \n ";
		return risultato;
	}

}
