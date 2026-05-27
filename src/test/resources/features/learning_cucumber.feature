Feature: Aprender Cucumber
    Como um aluno
    Eu quero aprender a utilizar Cucumber
    Para que eu possa automatizar critérios de aceitação

Scenario: Deve executar especificação
    Given que eu criei o arquivo corretamente
    When executá-lo
    Then a especificação deve finalizar com sucesso

Scenario: Deve somar corretamente
    Given o valor do contador é 15
    When eu incrementar em 3
    Then o valor do contador será 18

Scenario: Deve calcular atraso na entrega
    Given que a entrega é dia "17/09/2026"
    When a entrega atrasar em 2 dias
    Then a entrega será efetuada em "19/09/2026"