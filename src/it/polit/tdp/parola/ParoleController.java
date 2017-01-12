package it.polit.tdp.parola;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import it.polito.tdp.model.Model;
import it.polito.tdp.model.Parola;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ParoleController {
	
	private Model model = new Model();
	
	public void setModel(Model model){
		this.model= model;
	}

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtText;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnCancella;

    @FXML
    void doCancella(ActionEvent event) {
    	txtResult.clear();
    	txtText.clear();
    	model.cancellaTutte();                  //azzera elenco
    }

    @FXML
    void doInserisci(ActionEvent event) {
    	String s =txtText.getText();
    	if(s.isEmpty()){
    		txtResult.appendText("Inserisci parola! \n ");
    		return;
    	}
    	for(int i =0; i<s.length(); i++){
    		if(!Character.isLetter(s.charAt(i))){
    		txtResult.appendText("Il formato non è valido ! \n ");
    		return;
    	    }
    	}
    	model.aggiungiParola(s);
    	txtResult.appendText("La parola inserita è " + s + "\n ");
    	List<Parola> listaParolePrecedenti = model.ritornaListaParole();
    	txtResult.appendText("La lista di parole è : " +listaParolePrecedenti + "\n");
    	return;

    }

    @FXML
    void initialize() {
        assert txtText != null : "fx:id=\"txtText\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Parole.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Parole.fxml'.";

    }
}
