package io.cucumber.Veronica;

import io.cucumber.java.pt.*;

import io.cucumber.Veronica.servico.*;

public class EnterProductDataSteps{
	
	@Dado("que escrevo no campo start date {string}")
	public void que_escrevo_no_campo_start_date(String string) {
		Configuracao.id("startdate").sendKeys(string);
	}
	
	@Dado("seleciono o campo Insurance Sum")
	public void seleciono_o_campo_Insurance_Sum() {
	    Configuracao.id("insurancesum").click();
	    Configuracao.cssSelector("option[value='5000000']").click();
	}
	
	@Dado("seleciono o campo Merit Rating")
	public void seleciono_o_campo_Merit_Rating() {
		Configuracao.id("meritrating").click();
	    Configuracao.cssSelector("option[value='Bonus 2']").click();
	}
	
	@Dado("seleciono o campo Damage Insurance")
	public void seleciono_o_campo_Damage_Insurance() {
		Configuracao.id("damageinsurance").click();
	    Configuracao.cssSelector("option[value='Full Coverage']").click();
		
	}
	
	@Dado("seleciono uma opcao no campo Optional Products")
	public void seleciono_uma_opcao_no_campo_Optional_Products() {
		Configuracao.xpath("//label[text()='Euro Protection']").click();
	}
	
	@Dado("seleciono o campo Courtesy car")
	public void seleciono_o_campo_Courtesy_car() {
		Configuracao.id("courtesycar").click();
	    Configuracao.cssSelector("option[value='No']").click();
	}
	
	@Entao("clico no terceiro botao {string}")
	public void clico_no_terceiro_botao(String string) {
	    Configuracao.cssSelector("button[id='nextselectpriceoption']").click();
	}
}