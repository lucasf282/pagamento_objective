# account-transactions
autor: [Lucas Farias](https://www.linkedin.com/in/lucasf282/)

Este é um projeto desenvolvido com Java, utilizando o frmework Quarkus

## Executando a aplicação

1. **Empacotar o projeto com Maven:**
Execute o seguinte comando na raiz do projeto para empacotar a aplicação:

```shell script
./mvnw package
```
2. **Rodar o Docker Compose:**  Após empacotar o projeto, execute o Docker Compose para iniciar os serviços definidos no arquivo Dockercompose.yml:  

```shell script
docker-compose -f src/main/docker/Dockercompose.yml up --build
```

Após o término da execução, a aplicação se torna disponível em <http://localhost:8080/>
