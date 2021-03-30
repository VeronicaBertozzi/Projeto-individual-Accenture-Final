#language: pt

Funcionalidade: Seguro de carro
    Preencher as abas para avaliacao de seguro de carro

    	Cenario: Preencher aba enter Vehicle Data
        Quando que estou no site "http://sampleapp.tricentis.com/101/app.php"
        E clico para escolher uma opcao no campo make
				E escrevo no proximo campo enginee performance "80"
				E escrevo no proximo campo date
				E clico para escolher uma opcao no campo number of seats
				E clico para escolher uma opcao no campo fuel type
				E escrevo no proximo campo list price "76000"
				E escrevo no proximo campo annual mileage "9000" 
				Entao clico no botao "Next" 
				
			Cenario: Preencher aba enter Insurance Data
				Dado que escrevo no campo first name "Veronica"
				E escrevo no campo last name "Bertozzi"
				E escrevo no campo date of birth "01/04/1996"
				E clico no botao do gender
				E seleciono o campo country 
				E escrevo no campo zip code "11740000"
				E seleciono o campo occupation
				E seleciono o campo hobbies
				Entao clico no segundo botao "Next"
				
			Cenario: Preencher aba enter Product Data
				Dado que escrevo no campo start date "07/05/2021"
				E seleciono o campo Insurance Sum
				E seleciono o campo Merit Rating
				E seleciono o campo Damage Insurance
				E seleciono uma opcao no campo Optional Products
				E seleciono o campo Courtesy car
				Entao clico no terceiro botao "Next"
				
			Cenario: Preencher aba Select Price Option
			  Dado que eu seleciono o preco desejado
			  Entao clico no quarto botao "Next"
			 
			Cenario: Preencher aba Send Quote
			  Dado que escrevo o email "usuario@hotmail.com"
			  E escrevo no campo Username "UsuarioVB"
			  E escrevo no campo Password "Usuario1"
			  E escrevo no campo Confirm Password "Usuario1"
			  E clico no ultimo botao "Send"
			  Entao devo ver a mensagem "Sending e-mail success!"			  
				
				