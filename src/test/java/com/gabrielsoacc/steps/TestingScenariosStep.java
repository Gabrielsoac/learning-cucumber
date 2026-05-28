package com.gabrielsoacc.steps;

import java.math.BigDecimal;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestingScenariosStep {

    String ticket;
    BigDecimal ticketValue;
    String passengerName;
    String phoneNumber;
    String specialTicket;
    @Given("que o ticket é {string}")
    public void queOTicketÉ(String ticketInputed) {
        ticket = ticketInputed;
    }

    @Given("que o valor da passagem é R$ {money}")
    public void queOValorDaPassagemÉR$(BigDecimal value) {
        ticketValue = value;
        System.out.println(ticketValue); 
    }

    @Given("que o nome do passageiro é {string}")
    public void queONomeDoPassageiroÉ(String name) {
        passengerName = name;
    }
    @Given("que o telefone do passageiro é {string}")
    public void queOTelefoneDoPassageiroÉ(String inputPhoneNumber) {
        phoneNumber = inputPhoneNumber;
    }

    @Given("que o ticket especial é {string}")
    public void queOTicketEspecialÉ(String specialTicketInput) {
        specialTicket = specialTicketInput;
    }

    @When("criar os steps")
    public void criarOsSteps() {
        System.out.println("Steps criados...");
    }
    @Then("o teste vai funcionar")
    public void oTesteVaiFuncionar() {
        System.out.println("Funcionou... Valores:");
        System.out.println(ticket);
        System.out.println(ticketValue);
        System.out.println(passengerName);
        System.out.println(phoneNumber);
        System.out.println(specialTicket);
    }
}
