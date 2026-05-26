package com.gabrielsoacc;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LearnCucumber {

    @Given("que eu criei o arquivo corretamente")
    public void queEuCrieiOArquivoCorretamente() throws Throwable {
        System.out.println("ok");
    }
    
    @When("executá-lo")
    public void executaLo() throws Throwable {
        System.out.println("Passou aqui");
    }
    
    @Then("a especificação deve finalizar com sucesso")
    public void AEspecificacaoDeveFinalizarComSucesso() throws Throwable {
        System.out.println("Passou aqui");
    }
}
