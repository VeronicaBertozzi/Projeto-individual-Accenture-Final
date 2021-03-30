# Descrição do desafio

## Criar uma aplicação Selenium para testar o site Tricentis
### Caso de teste
Preencher as abas para avaliacao de seguro de carro

**Cenário:** Preencher aba Enter Vehicle Data<br>
  Quando que estou no site "http://sampleapp.tricentis.com/101/app.php"<br>
  E clico para escolher uma opção no campo Make<br>
  E escrevo no próximo campo Enginee Performance "80"<br>
  E escrevo no próximo campo Date<br>
  E clico para escolher uma opção no campo Number of Seats<br>
  E clico para escolher uma opção no campo Fuel Type<br>
  E escrevo no próximo campo List Price "76000"<br>
  E escrevo no próximo campo Annual Mileage "9000"<br> 
  Então clico no botão "Next"<br>
				
**Cenário:** Preencher aba Enter Insurance Data<br>
  Dado que escrevo no campo First Name "Veronica"<br>
  E escrevo no campo Last Name "Bertozzi"<br>
  E escrevo no campo Date of Birth "01/04/1996"<br>
  E clico no botão do Gender<br>
  E seleciono o campo Country<br>
  E escrevo no campo Zip Code "11740000"<br>
  E seleciono o campo Occupation<br>
  E seleciono o campo Hobbies<br>
  Então clico no segundo botão "Next"<br>
				
**Cenário:** Preencher aba enter Product Data<br>
  Dado que escrevo no campo Start Date "07/05/2021"<br>
  E seleciono o campo Insurance Sum<br>
  E seleciono o campo Merit Rating<br>
  E seleciono o campo Damage Insurance<br>
  E seleciono uma opção no campo Optional Products<br>
  E seleciono o campo Courtesy car<br>
  Então clico no terceiro botão "Next"<br>
			
**Cenario:** Preencher aba Select Price Option<br>
  Dado que eu seleciono o preço desejado<br>
  Então clico no quarto botão "Next"<br>
			 
**Cenario:** Preencher aba Send Quote<br>
  Dado que escrevo o email "usuario@hotmail.com"<br>
  E escrevo no campo Username "UsuarioVB"<br>
  E escrevo no campo Password "Usuario1"<br>
  E escrevo no campo Confirm Password "Usuario1"<br>
  E clico no ultimo botão "Send"<br>
  Então devo ver a mensagem "Sending e-mail success!"<br>
		
---------------------------------------------------------------------------

## Tecnologias utilizadas
- [x] Java
Linguagem de programação para desenvolvimento da aplicação

- [x] Maven
Gerenciador de dependências para o Java

- [x] Cucumber
Framework responsável por traduzir uma linguagem humana em código Java

- [x] Selenium
Framework responsável por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento

-----------------------------------------------------------------------------

## Como utilizar
### Pré requisitos

* Instalar o java: https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR

* Instalar jdk https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html

* Verificar se o JAVA_HOME está configurado em seu computador

* Fazer clone do projeto
```
https://github.com/VeronicaBertozzi/Projeto-individual-Accenture-Final.git
```
* Entrando na pasta do projeto
```
cd Projeto-individual-Accenture-Final
```
* Configurando selenium em seu computador - Fazer o download do Chrome Webdriver e trocar o arquivo descompactado dentro da pasta driver na raiz do projeto:
https://chromedriver.chromium.org/downloads
Exemplo:
```
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
```
* Limpando e validando maven Unix
```
./mvnw clean
```
* Limpando e validando maven Windows
```
mvnw.cmd clean
```
* Executando teste no Unix
```
./test.sh
```
* Executando teste no Windows
```
test.bat
```
----------------------------------------------------------------------
## Estrutura de arquivos
```
  driver 

      |-- chromedriver -- Este é o arquivo do selenium webdriver, substitua este arquivo com a versão da sua máquina

  mvnw

  mvnw.cmd

  pom.xml

  src

    |-- test

    |  |-- java

    |  |  |-- io

    |  |  |  |-- cucumber

    |  |  |  |  |-- Veronica

    |  |  |  |  |  |-- servico -- Pasta para colocar Classes em Java para usar nos arquivos Steps
    
    |  |  |  |  |  |  |-- Configuracao.java -- Conjunto de classes em java para facilitar o processo das Steps

    |  |  |  |  |  |-- EnterInsuranceDataSteps.java -- Passos escritos em java com selenium para preencher aba de Insurance Data
 
    |  |  |  |  |  |-- EnterProductDataSteps.java -- Passos escritos em java com selenium para preencher aba de Product Data
    
    |  |  |  |  |  |-- EnterVehicleDataSteps.java -- Passos escritos em java com selenium para preencher aba de Vehicle Data 
    
    |  |  |  |  |  |-- RunCucumberTest.java -- Arquivo que configura a inicialização do Java test(Caso utilize o editor de código Eclipse sera necessario rodar o test nesse arquivo primeiro)
  
    |  |  |  |  |  |-- SelectPriceOptionStep.java -- Passos escritos em java com selenium para preencher aba de Price Option

    |  |  |  |  |  |-- SendQuoteSteps.java -- Passos escritos em java com selenium para preencher aba Send Quote

    |  |-- resources

    |  |  |-- io

    |  |  |  |-- cucumber

    |  |  |  |  |-- Veronica

    |  |  |  |  |  |-- PreencherAbasSiteTricentis.feature -- Gherkin com os cenários de teste de acordo com o meu cliente

  test.bat -- Arquivo para rodar teste no Windows
  
  test.sh -- Arquivo para rodar teste no Unix
```

