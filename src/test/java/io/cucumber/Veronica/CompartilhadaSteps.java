package io.cucumber.Veronica;

import io.cucumber.Veronica.servico.Configuracao;
import io.cucumber.java.pt.Quando;

public class CompartilhadaSteps{
	
	@Quando("que estou no site {string}")
	public void que_estou_no_site(String string) {
	    Configuracao.abrir(string);
	}
	
}