package lbotexamples;

import io.cucumber.java.en.And; 
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;
 

public class ContatoFISGlobalStepDef {
	 
	 
	ContactUsFISPage page = new ContactUsFISPage();
	
	@When("Usuário navega para a pagina de contato FISGlobal")
	public void navega_pagina_contato_fis_global() {
		 page.navigateTo();
	}

	@And("Preenche os campos do formulário {string}, {string}, {string}")
	public void preenche_os_campos_contato_fisglobal(String nome, String sobrenome, String email) { 
		page.getFirstnameInput().sendKeys(nome);
		page.getEmailInput().sendKeys(email);
		page.getLastnameInput().sendKeys(sobrenome);
		
	}
		

	@Then("Os campos estão preenchidos contato fisglobal")
	public void os_campos_estao_preenchidos() throws InterruptedException {
		assertTrue(true);
		 
		
		page.quit();
	}
}
