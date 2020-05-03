Feature: Navegar para a pagina de contato da FISGlobal
	Scenario: Pagina de contato funciona?
		When Usuário navega para a pagina de contato FISGlobal
		And Preenche os campos do formulário "José Carlos", "da Silva Borges", "lbotsistemas@gmail.com"
		Then Os campos estão preenchidos contato fisglobal