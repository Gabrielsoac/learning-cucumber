package com.gabrielsoacc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    private int contador = 0;
    @Given("o valor do contador é {int}")
    public void oValorDoContadorÉ(Integer int1) {
        contador = int1;
    }
    
    @When("eu incrementar em {int}")
    public void euIncrementarEm(Integer int1) {
        contador += int1;
    }

    @Then("o valor do contador será {int}")
    public void oValorDoContadorSerá(Integer int1) {
        assertEquals(int1, contador);
    }

    LocalDate date;
    LocalDate lateDate;
    @Given("que a entrega é dia {string}")
    public void queAEntregaÉDia(String dateInText) throws ParseException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        date = LocalDate.parse(dateInText, dtf);
    }

    @When("a entrega atrasar em {int} dias")
    public void aEntregaAtrasarEmDias(Integer days) {
        lateDate = date.plusDays(days);
    }

    @Then("a entrega será efetuada em {string}")
    public void aEntregaSeráEfetuadaEm(String dateInText) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate expectedData = LocalDate.parse(dateInText, dtf);
        assertEquals(expectedData, lateDate);
    }
}
