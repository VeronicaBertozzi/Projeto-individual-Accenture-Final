package io.cucumber.Veronica;

import io.cucumber.Veronica.servico.Configuracao;
import io.cucumber.java.pt.*;

public class EnterInsuranceDataSteps{
	
	
	@Quando("que escrevo no campo first name {string}")
	public void que_escrevo_no_campo_first_name(String string){
		Configuracao.id("firstname").sendKeys(string);
	}
	
	@Dado("escrevo no campo last name {string}")
	public void escrevo_no_campo_last_name(String string) {
		Configuracao.id("lastname").sendKeys(string);
	}
	
	@Dado("escrevo no campo date of birth {string}")
	public void escrevo_no_campo_date_of_birth(String string) {
		Configuracao.id("birthdate").sendKeys(string);
	}
	
	@Dado("clico no botao do gender")
	public void clico_no_botao_do_gender() {
		Configuracao.cssSelector("span[class='ideal-radio']").click();
	}
	@Dado("seleciono o campo country")
	public void seleciono_o_campo_country() {
		Configuracao.id("country").click();
		Configuracao.cssSelector("option[value='Brazil']").click();
	}
	@Dado("escrevo no campo zip code {string}")
	public void escrevo_no_campo_zip_code(String string) {
		Configuracao.id("zipcode").sendKeys(string);
	}
	@Dado("seleciono o campo occupation")
	public void seleciono_o_campo_occupation() {
		Configuracao.id("occupation").click();
		Configuracao.cssSelector("option[value='Employee']").click();
	}
	@Dado("seleciono o campo hobbies")
	public void seleciono_o_campo_hobbies() {
		Configuracao.cssSelector("span[class='ideal-check']").click();
	}
	@Entao("clico no segundo botao {string}")
	public void clico_no_segundo_botao(String string) {
		Configuracao.id("nextenterproductdata").click();
	}
		
}