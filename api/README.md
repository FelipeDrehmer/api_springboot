# API Sistema-Estudantes

>API REST desenvolvida com Spring Boot para gerenciamento de cursos e estudantes.
O sistema permite consultar informações institucionais, listar cursos e buscar alunos por matrícula ou semestre.
---
## `Autor`

Nome: Felipe Karling Drehmer

Matrícula: ------

---
## `Tecnologias Utilizadas`

- Java 21.0.10
- Spring Boot
- Maven
- Lombok
- REST API

---
## `Como Executar o Projeto`

1- **Clonar o repositório:**

    git clone <url-do-repositorio>

2- **Acessar a pasta do projeto:**

    cd api_sistema-estudantes

3- **Executar o projeto:**

3.1 *Via terminal:*

    ./mvnw spring-boot:run

3.2 *Ou executar a classe:*

    ApiApplication.java

4- **A aplicação será iniciada em:**

    http://localhost:8080
---
## `Endpoints Disponíveis`


1- **Informações do Sistema**

>*Método: **GET***

**Endpoint:**
````
/api/sistema/info
````
Exemplo:
````
http://localhost:8080/api/sistema/info
````
Descrição: Retorna informações gerais do sistema.

---
2. **Listar Todos os Cursos**

>*Método: **GET***

**Endpoint:**
````
/api/cursos
````
Exemplo:
````
http://localhost:8080/api/cursos
````
Descrição: Retorna a lista de todos os cursos cadastrados.

---
3. **Buscar Curso por ID**

>*Método: **GET***

**Endpoint:**
````
/api/cursos/{idCurso}
````
Exemplo:
````
http://localhost:8080/api/cursos/1
````
Descrição: Retorna um curso específico pelo ID informado.

````
> Respostas possíveis:

- 200 OK – Curso encontrado

- 404 Not Found – Curso não encontrado
````

---
4. **Buscar Aluno por Matrícula**

>*Método: **GET***

**Endpoint:**
````
/api/estudantes/{matricula}
````
Exemplo:
````
http://localhost:8080/api/estudantes/1001
````
Descrição: Retorna as informações de um aluno específico.
````
> Respostas possíveis:

- 200 OK – Aluno encontrado

- 404 Not Found – Aluno não encontrado
````

---
5. **Buscar Alunos por Semestre**

>*Método: **GET***

**Endpoint:**
````
/api/estudantes/semestre/{semestre}
````
Exemplo:
````
http://localhost:8080/api/estudantes/semestre/2024.1
````
Descrição: Retorna uma lista de alunos pertencentes ao semestre informado.

---
## Estrutura do Projeto
src/main/java/dev/java10x/api  
│  
├── controller  
├── service  
├── dto  
└── ApiApplication

---
## Descrição das camadas:

- controller: Responsável pelos endpoints REST.

- service: Contém as regras de negócio.

- dto: Objetos de transferência de dados (Data Transfer Objects).

- ApiApplication: Classe principal da aplicação Spring Boot.