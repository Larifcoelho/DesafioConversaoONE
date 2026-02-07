Conversor de Moedas API Client (Java)
-------

*Visão Geral*

Aplicação Java backend desenvolvida para consumo de API de cotações cambiais, permitindo conversão de valores em Real Brasileiro (BRL) para múltiplas moedas internacionais.

O projeto demonstra conceitos fundamentais de desenvolvimento backend, incluindo integração com APIs externas, manipulação de JSON, boas práticas de orientação a objetos e organização em camadas.

----

*Funcionalidades*

Conversão BRL → USD, GBP, EUR, JPY, ARS, CHF

Consumo de API REST externa

Desserialização JSON com Gson

Arquitetura orientada a responsabilidades

Interface CLI interativa (menu via terminal)

------

*Arquitetura do Projeto*
 
src/
 ├── Menu.java          → Interface com usuário (CLI)
 ├── Busca.java         → Cliente HTTP / Consumo da API
 ├── Conversor.java     → Regra de negócio de conversão
 ├── RespostaApi.java   → DTO para mapear resposta JSON

------
*Melhorias Futuras*

Cache de cotações

Tratamento avançado de erros de API

Sistema de logs

Testes unitários (JUnit + Mockito)

Interface gráfica

Suporte a mais moedas

------
 *Objetivos de Aprendizado Demonstrados*

Integração com APIs

Fundamentos de Backend

Clean Code

Manipulação de dados externos

Collections Java (Map)
