package io.cucumber.Veronica;

import io.cucumber.Veronica.servico.Configuracao;
import io.cucumber.java.pt.*;

public class EnterVehicleDataSteps{
	
	@Quando("que estou no site {string}")
	public void que_estou_no_site(String string) {
	    Configuracao.abrir(string);
	}
	
	@Quando("clico para escolher uma opcao no campo make")
	public void clico_para_escolher_uma_opcao_no_campo_make() {
		Configuracao.browser.navigate().refresh();
		Configuracao.id("make").click();
		Configuracao.cssSelector("option[value='Honda']").click();
	}
	
	@Quando("escrevo no proximo campo enginee performance {string}")
	public void escrevo_no_proximo_campo_enginee_performance(String string){
		Configuracao.id("engineperformance").sendKeys(string);
	}
	
	@Quando("escrevo no proximo campo date")
	public void escrevo_no_proximo_campo_date(){
		Configuracao.cssSelector("button[class='ui-datepicker-trigger']").click();
		Configuracao.linkText("1").click();
	}
	
	@Quando("clico para escolher uma opcao no campo number of seats")
	public void clico_para_escolher_uma_opcao_no_campo_number_of_seats() {
		Configuracao.id("numberofseats").click();
		Configuracao.cssSelector("option[value='5']").click();
	}
	
	@Quando("clico para escolher uma opcao no campo fuel type")
	public void clico_para_escolher_uma_opcao_no_campo_fuel_type() {
		Configuracao.id("fuel").click();
		Configuracao.cssSelector("option[value='Petrol']").click();
	}
	
	@Quando("escrevo no proximo campo list price {string}")
	public void escrevo_no_proximo_campo_list_price(String string){
		Configuracao.id("listprice").sendKeys(string);
	}
	
	@Quando("escrevo no proximo campo annual mileage {string}")
	public void escrevo_no_proximo_campo_annual_mileage(String string){
		Configuracao.id("annualmileage").sendKeys(string);
	}
	
	@Entao("clico no botao {string}")
	public void clico_no_botao(String string) {
		Configuracao.id("nextenterinsurantdata").click();
	}

}