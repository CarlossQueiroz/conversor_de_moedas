# Conversor de Moeda - Challenge ONE - Java - Back end

![Capa: conversor de moedas](https://github.com/user-attachments/assets/83314d39-14ad-4bcd-a09f-d337faadf8e8)

Projeto de console desenvolvido em Java, que simula um conversor de moedas, permitindo ao usuário realizar conversões com base em taxas de câmbio atualizadas em tempo real através da [Exchange-Rate API ](http://https://www.exchangerate-api.com/ "Exchange Rate API ").

## 🎯 Objetivos
- Desenvolver uma aplicação Java com interação via console;
- Disponibilizar ao usuário um menu com no mínimo 6 opções distintas de conversão de moedas;
- Consumir uma API REST para obter taxas de câmbio dinâmicas;
- Trabalhar com requisições HTTP, manipulação de JSON, e boas práticas de programação orientada a objetos.

## 🧱 Estrutura do Projeto
O projeto está dividido em pacotes conforme suas responsabilidades:

**br.com.conversorDeMoedas.Modelos**: Contém a classe que representa os dados utilizados na aplicação.
1. **Moeda**: Classe que modela uma moeda com seus respectivos atributos (moedaOrigem, moedaDestino, valorOriginal, taxaDeCambio e valorConvertido).

**br.com.conversorDeMoedas.Principal**: Contém a classe principal do projeto.
1. **Main**: Exibe o menu inicial e orquestrar o fluxo geral do sistema.

**br.com.conversorDeMoedas.Servicos**: Contém as classes de serviço, responsáveis pela lógica da aplicação.
1. **MenuOpcoes**: Exibe o menu com as opções de conversão e lida com a entrada do usuário.
2. **RequisicaoHttp**: Realiza as chamadas HTTP para a API, trata as respostas e converte os dados JSON.
3. **TaxasDeCambio**: Responsável por representar a resposta recebida da ExchangeRate-API, especificamente a parte que contém as taxas de conversão entre moedas.


## 🌐 Sobre a API
- A ExchangeRate-API é gratuita e permite obter taxas de câmbio atualizadas.
- Documentação oficial: https://www.exchangerate-api.com/docs
- Para utilizar, é necessário obter uma API Key gratuita.

## Autor

| [<img loading="lazy" src="https://avatars.githubusercontent.com/u/162513026?v=4" width=115><br><sub>Carlos Queiroz</sub>](https://github.com/CarlossQueiroz) |
| :---: |
