# Checkpoint 3 — Domain Driven Design

Nome: Lucas Alves Piereti - RM: 559533
Nome: Rafaela Heer Robinson - RM: 560249
Nome: Julia Hadja - RM: 559410

## API de Ciclo de Vida de Pedido de Restaurante

Este projeto foi desenvolvido como parte do Checkpoint 3 da disciplina de Domain Driven Design.
O objetivo foi modelar uma API REST que representasse ações reais do domínio de um restaurante, evitando o uso de operações genéricas de CRUD.

A aplicação simula o ciclo de vida de um pedido, desde a sua criação até a sua entrega ou cancelamento.

## Sobre o Projeto

A proposta da atividade não era construir um sistema completo com persistência de dados ou regras complexas, mas sim projetar corretamente a interface REST com base no comportamento do domínio.

Por isso, o sistema foi implementado de forma stateless, sem utilização de banco de dados ou armazenamento em memória.

Cada requisição representa uma ação de negócio que é executada e registrada apenas através de mensagens no console.

## Estados do Pedido

Um pedido pode passar pelos seguintes estados:

* INITIATED
* CONFIRMED
* IN_PREPARATION
* READY
* DELIVERED
* CANCELLED

As transições entre esses estados são realizadas através de endpoints específicos que representam ações do restaurante.

## Endpoints Disponíveis

* POST /orders/initiation
* POST /orders/items/addition
* POST /orders/items/removal
* POST /orders/confirmation
* POST /orders/preparation/start
* POST /orders/preparation/finish
* POST /orders/delivery
* POST /orders/cancellation

A escolha por utilizar POST em todos os endpoints foi feita porque cada rota representa uma ação que altera o estado do pedido, e não uma simples operação de atualização de recurso.

## Organização do Projeto

O projeto foi estruturado em camadas:

* Camada de domínio: contém as entidades Order e OrderItem, além do enum OrderStatus.
* Camada de aplicação: responsável por coordenar as ações de negócio através do OrderApplicationService.
* Camada de exposição: responsável por expor os endpoints REST por meio do controller.

Essa separação permite manter a lógica de negócio isolada da camada de interface.

## Como Executar

1. Abrir o projeto no IntelliJ
2. Aguardar o Maven importar as dependências
3. Executar a classe `OrdersApplication`
4. A aplicação será iniciada na porta 8080

## Exemplos de Requisição

### Confirmar pedido

POST http://localhost:8080/orders/confirmation

---

### Iniciar pedido

POST http://localhost:8080/orders/initiation

Body:

```
{
  "customer": "Lucas"
}
```

---

### Adicionar item

POST http://localhost:8080/orders/items/addition

Body:

```
{
  "name": "Pizza",
  "quantity": 2
}
```
