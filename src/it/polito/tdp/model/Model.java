package it.polito.tdp.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Model {
	
	Parola pp1;
	private int flag=0;
	
	private List<Parola> listaParole = new ArrayList<Parola>();
	 
	public void aggiungiParola(String parola){      //ok
		pp1=new Parola(parola);                 
//		listaParole.add(pp1);
		flag=0;
		if(!listaParole.isEmpty()){
			for(Parola p: listaParole){
				if(!p.getParola().equals(pp1.getParola())){
					flag=1;
				}
			}
		}
		else{
			  listaParole.add(pp1);
		}
		
		if(flag==1) listaParole.add(pp1);	
	}
	
	
	public List<Parola> ritornaListaParole(){     //in ordine alfa
		Collections.sort(listaParole);
		System.out.println(listaParole);
		return listaParole;
	}

	public void cancellaTutte(){
		listaParole.clear();
	}
	
	public void stampaLista(){
		System.out.println(listaParole);
	}
	
//	public static void main(String [] args){
//		Model m = new Model();
//		//m.aggiungiParola( new Parola("casa"));
//		//m.aggiungiParola( new Parola("scuola"));
//		//m.aggiungiParola( new Parola("cane"));
//		//m.aggiungiParola( new Parola("pc"));
//		//m.aggiungiParola( new Parola("phone"));
//		//m.aggiungiParola( new Parola("light"));
//		//m.aggiungiParola( new Parola("home"));
//		//m.aggiungiParola( new Parola("house"));
//		
//		Parola p1 = new Parola("home");
//		Parola p2 = new Parola("home");
//		//Parola p3 = new Parola("live");
//		//Parola p4 = new Parola("roma");
//		//Parola p5 = new Parola("roma");    //questa la aggiunge
//		//m.aggiungiParola( p1);
//		m.aggiungiParola("home");
//		m.aggiungiParola("home");
//		//m.aggiungiParola(p3);
//		//m.aggiungiParola(p4);
//		//m.aggiungiParola(p5);
//		
//		m.stampaLista();
//	}
}
