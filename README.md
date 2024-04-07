## CRUD em AngularJS com Spring Boot
Neste projeto, você encontrará um exemplo básico de um aplicativo CRUD (Create, Read, Update, Delete) desenvolvido usando AngularJS no frontend e Spring Boot no backend.

## Backend (Spring Boot)
O backend é construído utilizando Spring Boot para fornecer uma API RESTful para manipulação dos dados.

## Setup
Certifique-se de ter o Java JDK e o Maven instalados.
Clone o repositório.
Navegue até o diretório do backend.
Execute o seguinte comando para iniciar o servidor Spring Boot:

```bash
mvn spring-boot:run
```

## Endpoints da API
Listagem de Todos os Cursos:

### Método: GET
URL: http://localhost:8080/api/courses
Listagem de Cursos com Paginação:

### Método: GET
URL: http://localhost:8080/api/courses?page=0&pageSize=100
Detalhes de um Curso Específico:

### Método: GET
URL: http://localhost:8080/api/courses/{id}
Adição de um Novo Curso:

### Método: POST
URL: http://localhost:8080/api/courses
Corpo da Requisição (formato JSON):
```json
{
    "name": "Angular",
    "category": "Front-end",
    "lessons": [
        {
          "name": "Introdução",
          "youtubeUrl": "tPOMG0D57S0"
        },
        {
          "name": "Introdução2",
          "youtubeUrl": "tPOMG0D57S0"
        }
    ]
}
```
### Atualização de um Curso Existente:

Método: PUT
URL: http://localhost:8080/api/courses/{id}
Corpo da Requisição (formato JSON):
```json
{
    "name": "Angular com Spring",
    "category": "Back-end",
    "lessons": [
      {
        "id": 1,
        "name": "Introdução11111",
        "youtubeUrl": "01234567890"
      },
      {
        "id": 2,
        "name": "Angular11111",
        "youtubeUrl": "01234567891"
      }
    ]
}
```
### Remoção de um Curso Existente:

Método: DELETE
URL: http://localhost:8080/api/courses/{id}
Substitua {id} pelo ID do curso específico que você deseja manipular.

## Frontend (AngularJS)
O frontend é construído utilizando AngularJS para interagir com o backend e fornecer uma interface de usuário para o usuário final. Consulte o README do frontend para mais informações sobre como configurar e executar o frontend.

## Contribuindo
Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue para relatar problemas ou enviar um pull request com melhorias.
