# README - API de Cadastro Médico e Paciente

Este projeto é uma API em Java para gerenciar o cadastro de médicos e pacientes em um ambiente de saúde. A API oferece uma variedade de funcionalidades para criar, recuperar, atualizar e excluir registros de médicos e pacientes, bem como informações de endereço, telefone e ativação dos registros.

## Requisitos

- Java 8 ou superior
- Maven
- Banco de dados (por exemplo, MySQL)

## Configuração

1. Clone este repositório:

```
git clone https://github.com/seu-usuario/sua-api-medicos-pacientes
```

2. Configure o arquivo `application.properties` com as informações do seu banco de dados:

```
spring.datasource.url=jdbc:mysql://localhost/vollmed_api
spring.datasource.username=root
spring.datasource.password=12345
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

3. Execute a aplicação:

```
mvn spring-boot:run
```

## Migrações de Banco de Dados

As migrações de banco de dados estão organizadas em scripts SQL numerados. Aqui estão os scripts disponíveis:

- `V1__create-table-medicos.sql`: Cria a tabela "medicos" com campos como nome, email, crm, especialidade, endereço, e outros.
- `V2__alter-table-medicos-add-column-telefone.sql`: Adiciona a coluna "telefone" à tabela "medicos".
- `V3__alter-table-medicos-add-column-ativo.sql`: Adiciona a coluna "ativo" à tabela "medicos" e atualiza os registros existentes.
- `V4__create-table-pacientes.sql`: Cria a tabela "pacientes" com campos como nome, email, cpf, endereço, telefone, ativo, e outros.

## Como Usar

Após a configuração e execução da aplicação, você pode começar a usar a API para gerenciar médicos e pacientes.

## Endpoints

A API oferece os seguintes endpoints:

- **Médicos:**

  - `POST /medicos`: Cria um novo médico.
  - `GET /medicos`: Retorna a lista de médicos ativos.
  - `PUT /medicos`: Atualiza as informações de um médico.
  - `DELETE /medicos/{id}`: Remove um médico.

- **Pacientes:**

  - `POST /pacientes`: Cria um novo paciente.
  - `GET /pacientes`: Retorna a lista de pacientes ativos.
  - `PUT /pacientes`: Atualiza as informações de um paciente.
  - `DELETE /pacientes/{id}`: Remove um paciente.

## Contribuições

Contribuições são bem-vindas! Se você deseja melhorar ou estender esta API, sinta-se à vontade para enviar pull requests ou relatar problemas.

Isso é apenas um exemplo de como você pode estruturar o README da sua API. Lembre-se de personalizá-lo de acordo com as necessidades específicas do seu projeto.




