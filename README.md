LibraryMS

Este é um projeto de sistema de gerenciamento de biblioteca desenvolvido em Java com Spring Boot.

Visão Geral

O LibraryMS é uma aplicação que permite o gerenciamento de livros, usuários e empréstimos em uma biblioteca. Ele oferece funcionalidades para:

•
Cadastro e consulta de livros.

•
Cadastro e consulta de usuários.

•
Registro e controle de empréstimos e devoluções.

Tecnologias Utilizadas

•
Java: Linguagem de programação principal.

•
Spring Boot: Framework para construção de aplicações Java robustas e escaláveis.

•
Maven: Ferramenta de automação de build e gerenciamento de dependências.

•
H2 Database: Banco de dados em memória para desenvolvimento e testes (pode ser configurado para outros bancos de dados).

Estrutura do Projeto

O projeto segue a estrutura padrão de uma aplicação Spring Boot:

Plain Text


. 
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── codingSamurai
│   │   │           └── libraryMS
│   │   │               ├── controllers
│   │   │               ├── dto
│   │   │               ├── entities
│   │   │               ├── repositories
│   │   │               └── services
│   │   └── resources
│   └── test
│       └── java
│           └── com
│               └── codingSamurai
│                   └── libraryMS
└── pom.xml


•
src/main/java/com/codingSamurai/libraryMS/controllers: Contém os controladores REST que lidam com as requisições HTTP.

•
src/main/java/com/codingSamurai/libraryMS/dto: Contém os objetos de transferência de dados (DTOs) usados para comunicação entre camadas.

•
src/main/java/com/codingSamurai/libraryMS/entities: Contém as entidades de domínio que representam as tabelas do banco de dados.

•
src/main/java/com/codingSamurai/libraryMS/repositories: Contém as interfaces de repositório para acesso a dados, utilizando Spring Data JPA.

•
src/main/java/com/codingSamurai/libraryMS/services: Contém a lógica de negócio da aplicação.

•
src/main/resources: Contém arquivos de configuração, como application.properties e templates.

•
src/test: Contém os testes unitários e de integração.

•
pom.xml: Arquivo de configuração do Maven, listando dependências e informações do projeto.

Como Executar o Projeto

Para executar este projeto localmente, siga os passos abaixo:

1.
Pré-requisitos:

•
Java Development Kit (JDK) 17 ou superior.

•
Maven 3.x.



2.
Clonar o Repositório:

3.
Compilar e Executar:

Endpoints da API (Exemplos)

•
Livros:

•
GET /api/books: Lista todos os livros.

•
GET /api/books/{id}: Obtém um livro por ID.

•
POST /api/books: Adiciona um novo livro.

•
PUT /api/books/{id}: Atualiza um livro existente.

•
DELETE /api/books/{id}: Exclui um livro.



•
Usuários:

•
GET /api/users: Lista todos os usuários.

•
GET /api/users/{id}: Obtém um usuário por ID.

•
POST /api/users: Adiciona um novo usuário.

•
PUT /api/users/{id}: Atualiza um usuário existente.

•
DELETE /api/users/{id}: Exclui um usuário.



•
Empréstimos:

•
GET /api/loans: Lista todos os empréstimos.

•
GET /api/loans/{id}: Obtém um empréstimo por ID.

•
POST /api/loans: Registra um novo empréstimo.

•
PUT /api/loans/{id}: Atualiza um empréstimo existente.

•
DELETE /api/loans/{id}: Exclui um empréstimo.



Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

