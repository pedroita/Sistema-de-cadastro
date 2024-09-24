# Cadastro de Clientes de um Clube de Natação

Este projeto foi desenvolvido para a disciplina de **Programação Orientada a Objetos**, com foco na implementação de um sistema CRUD (Create, Read, Update, Delete) para o gerenciamento de alunos de um clube de natação. A aplicação utiliza uma interface gráfica desenvolvida com **Java Swing** e um banco de dados **MySQL** para armazenamento de informações.

---
## Histórias de Usuário

### História de Usuário 1: Registro de Alunos
**Eu, como secretário**, desejo registrar novos alunos no sistema, fornecendo informações necessárias como nome, endereço, e-mail, turma e turno, para manter o cadastro atualizado.

#### Critérios de Aceitação:
- O sistema deve permitir a inserção de nome, endereço, e-mail, turma e turno.
- O sistema deve exibir uma mensagem de confirmação após o cadastro bem-sucedido.
- Os campos obrigatórios devem ser validados e não permitir o cadastro caso estejam vazios.

### História de Usuário 2: Consulta de Alunos
**Eu, como secretário**, desejo consultar a lista de alunos cadastrados, para visualizar suas informações detalhadas e verificar o cadastro.

#### Critérios de Aceitação:
- O sistema deve exibir uma tabela com todos os alunos cadastrados.
- A tabela deve conter as colunas: nome, endereço, e-mail, turma e turno.
- O sistema deve permitir a filtragem e ordenação dos registros.

### História de Usuário 3: Atualização de Dados de Alunos
**Eu, como secretário**, desejo atualizar as informações de um aluno, para garantir que os dados estejam corretos e atualizados.

#### Critérios de Aceitação:
- O sistema deve permitir selecionar um aluno na tabela e editar suas informações.
- As mudanças devem ser salvas e uma mensagem de confirmação deve ser exibida após a atualização.

### História de Usuário 4: Remoção de Alunos
**Eu, como secretário**, desejo remover o registro de um aluno, para excluir os dados de alunos que não fazem mais parte do clube.

#### Critérios de Aceitação:
- O sistema deve permitir a remoção de um aluno selecionado na tabela.
- Uma mensagem de confirmação deve ser exibida antes da remoção definitiva do aluno.
- O aluno deve ser removido do banco de dados e da tabela após a confirmação.

---
## Casos de Uso

### Caso de Uso 1: Registro de Alunos
- **Ator**: Secretário
- **Descrição**: O secretário deve registrar novos alunos no sistema, inserindo informações como nome, endereço, e-mail, turma e turno.

### Caso de Uso 2: Consulta de Alunos
- **Ator**: Secretário
- **Descrição**: O secretário pode consultar a lista de alunos cadastrados, visualizando suas informações em uma tabela.

### Caso de Uso 3: Atualização de Dados
- **Ator**: Secretário
- **Descrição**: O secretário pode atualizar os dados de um aluno, alterando informações conforme necessário.

### Caso de Uso 4: Remoção de Alunos
- **Ator**: Secretário
- **Descrição**: O secretário pode remover alunos do sistema, excluindo seus registros.

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

## Configurações para Rodar o Sistema

### 1. Configuração do Banco de Dados

Antes de rodar o sistema, é necessário configurar o banco de dados MySQL. Siga as etapas abaixo:

#### 1.1. Instalação do Conector MySQL

Para que o Java possa se conectar ao MySQL, você precisará instalar o conector MySQL JDBC. Siga os passos abaixo:

1. Baixe o conector MySQL JDBC [aqui](https://dev.mysql.com/downloads/connector/j/).
2. Adicione o arquivo `.jar` do conector ao seu projeto Java, incluindo-o no classpath.

#### 1.2. Criação do Banco de Dados e da Tabela

Execute o seguinte código SQL no MySQL para criar o banco de dados e a tabela:

```sql
-- Criação do banco de dados
CREATE DATABASE fichadosalunos;

-- Seleciona o banco de dados criado
USE fichadosalunos;

-- Criação da tabela dadosaluno
CREATE TABLE dadosaluno (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    endereco VARCHAR(255) NOT NULL,
    email VARCHAR(100) NOT NULL,
    turma VARCHAR(50) NOT NULL,
    turno VARCHAR(50) NOT NULL
);

-- Exemplo de inserção de dados
INSERT INTO dadosaluno (nome, endereco, email, turma, turno)
VALUES ('João Silva', 'Rua das Flores, 123', 'joao.silva@email.com', 'Turma A', 'Manhã');
```

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

## Trabalhos de Melhorias para V1.2:

- **Normalização dos Dados**: Implementar a normalização do banco de dados para eliminar redundâncias e melhorar a integridade dos dados. Isso pode incluir a criação de tabelas adicionais para armazenar informações relacionadas, como turmas e turnos, separando essas entidades da tabela principal de alunos.

