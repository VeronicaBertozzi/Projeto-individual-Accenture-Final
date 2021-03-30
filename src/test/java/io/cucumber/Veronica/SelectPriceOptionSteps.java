package io.cucumber.Veronica;

import io.cucumber.java.pt.*;

import io.cucumber.Veronica.servico.*;

public class SelectPriceOptionSteps{
	
	@Dado("que eu seleciono o preco desejado")
	public void que_eu_seleciono_o_preco_desejado(){
		Configuracao.cssSelectors(".ideal-radio").get(4).click();
	}
	
	@Entao("clico no quarto botao {string}")
	public void clico_no_quarto_botao(String string) throws InterruptedException {
		Thread.sleep(5000);
		Configuracao.id("nextsendquote").click();
	}
}