💰 Sistema Bancário em Java (POO + Console)
Projeto desenvolvido para praticar Programação Orientada a Objetos em Java, aplicando conceitos como:

Encapsulamento

Herança

Polimorfismo

Tratamento de exceções

Estruturas de dados (Map)

Menu interativo via console

🧠 Conceitos Aplicados
🔹 Encapsulamento
Atributos privados

Saldo protegido contra alteração direta

Modificação apenas via métodos controlados

🔹 Herança
ContaCorrente e ContaPoupanca estendem Conta

🔹 Polimorfismo
Uso de referência do tipo Conta para objetos diferentes:

Conta conta = new ContaCorrente(...);
conta.sacar(100);
🔹 Exceções Personalizadas
SaldoInsuficienteException

ValorInvalidoException

Regras de negócio protegidas por validações.

⚙️ Funcionalidades
Criar Conta Corrente

Criar Conta Poupança

Depositar

Sacar

Transferir entre contas

Consultar saldo

Menu interativo no console

▶️ Como Executar
Clone o repositório

Abra em uma IDE Java (IntelliJ, Eclipse ou VS Code)

Execute a classe Main

Utilize o menu no console

🏗️ Arquitetura
O projeto segue uma separação simples de responsabilidades:

model → Regras de negócio

exception → Tratamento de erros

Main → Interface com usuário (console)

🚀 Possíveis Melhorias Futuras
Implementar histórico de transações

Persistência em arquivo ou banco de dados

Criar camada service

Implementar testes unitários (JUnit)

Transformar em API REST com Spring Boot

Dockerizar aplicação

📚 Objetivo do Projeto
Projeto criado com foco em evolução como desenvolvedor Backend Java, consolidando fundamentos essenciais antes de avançar para frameworks como Spring Boot.
