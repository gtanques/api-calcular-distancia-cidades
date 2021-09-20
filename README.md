## Calcula a distância entre as cidades do Brasil
<img src="https://img.shields.io/badge/JAVA-Spring%20Boot-green"/><img src="https://img.shields.io/badge/BD-PostgreSQL-blue"/><img src="https://img.shields.io/badge/Lombok-red"/>

### - [Configuração](https://github.com/gtanques/buscador-cidades-brasil/tree/main/src/main/resources)
### - [Criar tabelas e alimentar banco](https://github.com/gtanques/cidades-estados-brasil-sql)
### - [Extensões PostgreSQL](https://www.postgresql.org/docs/current/earthdistance.html) 
    CREATE EXTENSION cube; 
    CREATE EXTENSION earthdistance;

### Testes
#### País
    GET - http://localhost:8080/paises
    GET - http://localhost:8080/paises/{id} 
#### Estado
    GET - http://localhost:8080/estados
    GET - http://localhost:8080/estados/{id}
    
#### Cidade
    GET - http://localhost:8080/cidades
    GET - http://localhost:8080/cidades/{id}

##### Cálculo distância aproximada em milha 
    GET - http://localhost:8080/cidades/distancia/{idOrigem}/{idDestino}

### - Referência 
[@andrelugomes - Digital Innovation One](https://github.com/andrelugomes/digital-innovation-one/tree/master/cities-api)
    
