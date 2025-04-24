# 💸 Currency Converter Java

Um simples e funcional **conversor de moedas** em Java, com integração via API para taxas de câmbio em tempo real.

> Projeto feito com foco em aprendizado de `HTTP requests`, `parsing JSON` e boas práticas com `Scanner`, `Exceptions` e estrutura de classes.

---

## 🚀 Funcionalidades

- Conversão entre as principais moedas:  
  `BRL`, `USD`, `EUR`, `ARS`
- Leitura de valores e escolha de opções via terminal
- Exibição do valor convertido **+ taxa de câmbio utilizada**
- Tratamento de exceções para entrada de dados incorretos

---

## 💻 Como rodar localmente

1. Clone este repositório:
   ```bash
   git clone https://github.com/luizherber/challenge-conversor-de-moedas.git


Compile o projeto:

javac Main.java

Execute:

    java Main

    Requer: Java 11+
    Dica: use uma IDE como IntelliJ ou VSCode com extensão Java para facilitar.

🛠️ Tecnologias utilizadas

    Java 11

    HttpClient (Java padrão)

    Gson (para parsear JSON)

🌍 API usada

    ExchangeRate API (v6)

        Endpoint utilizado: /pair/{from}/{to}/{amount}

        Gratuita com chave de API

📦 Estrutura do projeto

├── Main.java           → Classe principal
├── MainMenu.java       → Exibe o menu de opções
├── Consult.java        → Trata lógica da conversão
├── ApiConnect.java     → Conexão com a API e parsing JSON

📝 Licença

Este projeto está sob a licença MIT.
Sinta-se livre para usar, modificar e contribuir!
🙋‍♂️ Autor

Feito com ☕ por Luiz Herber
🏷️ Tags

#java #api #conversor #moedas #projeto-estudo
#httpclient #json #terminal-app #javadev #gson #openapi