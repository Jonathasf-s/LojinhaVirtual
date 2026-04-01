# 🛒 Lojinha Virtual API
Este projeto consiste em uma API REST desenvolvida com Spring Boot para o gerenciamento de uma loja virtual simplificada. A aplicação permite o cadastro de clientes, gerenciamento de produtos e a finalização de pedidos com processamento de pagamento simulado.

## 🚀 Tecnologias Utilizadas
Java 21

Spring Boot 4.0.5

Spring Data JPA: Para persistência de dados.

H2 Database: Banco de dados em memória utilizado para fins de teste e desenvolvimento, dispensando a necessidade de um front-end ou banco de dados externo.

Lombok: Para redução de código boilerplate (Getters, Setters, Construtores).

## 🏛️ Padrões de Projeto e Arquitetura
O projeto segue a arquitetura em camadas (Controller, Service, Repository, Model) e implementa padrões específicos:

Singleton: Utilizado na classe PagamentoService para garantir uma única instância do processador de pagamentos em toda a aplicação.

Mapeamento Objeto-Relacional (ORM): Utilização de relacionamentos @ManyToOne (Cliente e Pedidos) e @ManyToMany (Pedidos e Produtos).

## 🛠️ Como Executar
Como o projeto utiliza o banco de dados H2, não é necessário configurar servidores externos:

Clone o repositório ou baixe os arquivos.

Importe o projeto em sua IDE (IntelliJ, Eclipse ou VS Code).

Execute a classe LojinhaVirtualApplication.java.

O console do H2 poderá ser acessado (se configurado no application.properties) via http://localhost:8080/h2-console.

# 🛤️ Endpoints da API

## 👤 Clientes (/cliente)
Método --- Endpoint --- Descrição

POST ------ /add --------- Cadastra um novo cliente.

GET --------	/listar	-------- Lista todos os clientes cadastrados.

GET -------- /Id/{id} ------- Busca um cliente pelo ID.

GET -------- /cpf/{cpf} ---- Busca um cliente pelo CPF.

DELETE ---- /delete/{id} -- Remove um cliente pelo ID.


## 📦 Produtos (/produto)
Método --- Endpoint --- Descrição

POST ------ /add -------- Adiciona um novo produto ao catálogo.

GET ------- /listar -------- Lista todos os produtos.

GET ------- /Id/{id} ------- Busca um produto pelo ID.

DELETE --- /deletar/{id} -- Remove um produto do catálogo.

## 🛍️ Pedidos ou Carrinho (/pedidos)
Método --- Endpoint --- Descrição

POST ------ /finalizar ---- Processa o pagamento via Singleton e salva o pedido no banco.

GET ------- /listar -------- Lista todos os pedidos realizados.

GET ------- /listar/{id} --- Detalha um pedido específico por ID.

## 📝 Exemplo de JSON para Finalizar Compra (POST /pedidos/finalizar)

{

  "cliente": {
  
    "clienteId": 1
    
  },
  
  "produtos": [
  
    { "produtosId": 1 },
    { "produtosId": 2 }
  ],
  
  "pagamento": "PIX"
  
}

## 📋 Observação Acadêmica
Este projeto foi desenvolvido com base nos requisitos do projeto "Atividade Lojinha" da disciplina Arquitetura de Software da faculdade, focando na aplicação prática de CRUD, integração de serviços e utilização do banco de dados em memória H2.
