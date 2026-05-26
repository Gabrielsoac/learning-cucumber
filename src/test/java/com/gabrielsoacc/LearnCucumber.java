package com.gabrielsoacc;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LearnCucumber {

    @Given("que eu criei o arquivo corretamente")
    public void que_eu_criei_o_arquivo_corretamente() throws Throwable {
        System.out.println("ok");
    }
    
    @When("executá-lo")
    public void executa_lo() throws Throwable {
        System.out.println("Passou aqui");
    }
    
    @Then("a especificação deve finalizar com sucesso")
    public void a_especificacao_deve_finalizar_com_sucesso() throws Throwable {
        System.out.println("Passou aqui");
    }
}
