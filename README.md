# Cadastro de Clientes de um Clube de Natação

Este projeto foi desenvolvido para a disciplina de **Programação Orientada a Objetos**, com foco na implementação de um sistema CRUD (Create, Read, Update, Delete) para o gerenciamento de alunos de um clube de natação. A aplicação utiliza uma interface gráfica desenvolvida com **Java Swing** e um banco de dados **MySQL** para armazenamento de informações.

---

## Estrutura do Projeto:

- **Pacote `cadastrodaluno`**:
  - **`CadastroAluno.java`**: Implementa a lógica de cadastro de novos alunos no sistema.

- **Pacote `conectarcombanco`**:
  - **`ConexaoBancoDados.java`**: Responsável pela configuração e gerenciamento da conexão com o banco de dados MySQL utilizando JDBC.

- **Pacote `fichaaluno`**:
  - **`Alunos.java`**: Representa a classe **Aluno**, que define o modelo dos dados de um aluno.

- **Pacote `interfaces`**:
  - **`DAO.java`**: Interface para **Data Access Object (DAO)**, definindo os métodos principais para interagir com o banco de dados (adicionar, atualizar, buscar, remover).

- **Pacote `janelaTabela`**:
  - **`JanelaTable.java`**: Implementa a interface da tabela onde os dados dos alunos são exibidos.

- **Pacote `modelotabelaaluno`**:
  - **`AlunoTableModel.java`**: Fornece o modelo para a tabela de alunos, estendendo `AbstractTableModel`.

- **Pacote `principal`**:
  - **`Main.java`**: Classe principal que inicializa o sistema e carrega a interface gráfica da aplicação.

- **Pacote `telacadastro`**:
  - **`TelaCadastro.java`**: Implementa a interface de cadastro de novos alunos.

---
## Funcionalidade CRUD:

O sistema permite criar, visualizar, atualizar e deletar registros de alunos.

## Tecnologias Utilizadas:

- **Java**: Linguagem principal usada para implementar a lógica do sistema.
- **Java Swing**: Usado para criar a **GUI** (Graphical User Interface).
- **JDBC**: Conector utilizado para a comunicação com o banco de dados MySQL.
- **MySQL**: Sistema de banco de dados para persistir os dados dos alunos.

## Padrões de Design e Boas Práticas:

- **POO (Programação Orientada a Objetos)**: Utilizado para encapsulamento de dados e separação de responsabilidades.
- **DAO (Data Access Object)**: Implementação para isolar a lógica de acesso aos dados.

## Considerações Finais:

Este projeto é um exemplo de uma aplicação bem estruturada em Java com um fluxo CRUD para gerenciar o cadastro de alunos. A arquitetura modular, com separação de camadas de dados, lógica de negócios e interface gráfica, promove uma boa manutenção e extensibilidade do sistema.
