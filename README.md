# Medical Schedule API

Sistema de gestão de agendamentos médicos construído com **Java 21**, **Spring Boot 3** e os princípios da **Arquitetura Limpa (Clean Architecture), SOLID e CLEAN CODE**.

---
##  Tecnologias Utilizadas
* **Java 21** 
* **Spring Boot 3**
* **PostgreSQL** 
* **Flyway** 
* **UUID v7**
---

##  Estrutura do Projeto (Clean Architecture)

O projeto é dividido em camadas rigorosamente separadas para garantir que a regra de negócio seja independente de tecnologia.

### 1.  Core (Business Logic)
O coração da aplicação, escrito em Java Puro, sem dependências de frameworks.
* `core.domain`
* `core.application.usecases`
* `core.application.ports.in`
* `core.application.ports.out`

### 2.   Infrastructure (Technological Detail)
Camada que implementa as tecnologias e comunica-se com o Core.
* `infrastructure.web`
* `infrastructure.persistence`
* `infrastructure.gateway`
* `infrastructure.config`

##  Como Executar o Projeto

1. Clone o repositório.
2. Certifique-se de ter o **PostgreSQL** rodando.
3. Execute o comando:
   ```bash
   ./mvnw spring-boot:run 
   ```