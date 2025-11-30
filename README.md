# 🏨 Sistema Integrado de Gestão Hoteleira

> Um sistema de gestão robusto e modular, focado na aplicação de princípios de arquitetura de software e desenvolvimento baseado em componentes.

## 📖 Sobre o Projeto

Este projeto foi desenvolvido com o objetivo central de criar um sistema modularizado, onde cada componente do domínio é empacotado como um arquivo `.jar` independente. O sistema simula o funcionamento de um hotel, desde o cadastro de hóspedes até o controle financeiro e checkout.

A arquitetura prioriza o desacoplamento e a coesão, utilizando o gerenciamento de dependências via **Maven** para integrar os módulos.

---

## 🏗 Arquitetura e Design

O projeto segue uma arquitetura baseada em componentes, dividida em três módulos de domínio e um módulo integrador:

### 📦 Módulos (Componentes)
1.  **`HOTEL-INTEGRATION`**: Módulo central que direciona as dependências e orquestra o sistema.
2.  **`cadastro-hospede`**: Gerencia o ciclo de vida dos dados dos hóspedes (CRUD).
3.  **`hospedagem-quarto`**: Responsável pela reserva, alocação de quartos e verificação de status.
4.  **`controle-financeiro`**: Gerencia pagamentos, cobranças de diárias e lançamento de produtos/serviços.

### 📐 Padrões Utilizados

* **BCE (Boundary-Control-Entity):** Cada módulo foi dividido internamente nestas três camadas para garantir separação de responsabilidades.
    * *Boundary:* Interação com o usuário (Console).
    * *Control:* Regras de negócio.
    * *Entity:* Modelagem dos dados.
* **Strategy Pattern:** Utilizado no módulo financeiro para processar diferentes formas de pagamento e descontos.

---

## 🧠 Princípios SOLID Aplicados

Este projeto serviu como estudo de caso para a aplicação prática dos princípios SOLID:

* **SRP (Single Responsibility Principle):** Classes com responsabilidades únicas (ex: `Validador` apenas valida dados, `HospedeRepository` apenas persiste dados).
* **OCP (Open/Closed Principle):** A hierarquia de `Quarto` permite adicionar novos tipos (Luxo, Superior) sem alterar o código cliente existente.
* **LSP (Liskov Substitution Principle):** As subclasses de quartos podem substituir a classe base sem quebrar a lógica de cálculo de diárias.
* **ISP (Interface Segregation Principle):** Interfaces focadas, como `ICadastroHospede`, definem apenas os métodos estritamente necessários para o cliente.
* **DIP (Dependency Inversion Principle):** Módulos de alto nível dependem de abstrações (interfaces), não de implementações concretas (ex: `PagamentoStrategy`).

---

## ⚙️ Funcionalidades

O sistema é executado via console e possui os seguintes fluxos:

### 1. Gestão de Hóspedes
* Cadastrar novo hóspede.
* Buscar hóspede por CPF.
* Listar todos os hóspedes cadastrados.

### 2. Hospedagem e Quartos
* Listar quartos disponíveis (Standard, Superior, Luxo).
* Iniciar hospedagem (Check-in).
* Encerrar hospedagem (Check-out).

### 3. Controle Financeiro
* Lançar consumo de produtos (ex: frigobar).
* Lançar serviços adicionais (ex: massagem, lavanderia).
* Quitar diárias com cálculo automático de valor total.
* Avaliar a experiência da hospedagem.

---

## 🚀 Tecnologias

* **Java** (Linguagem Core)
* **Maven** (Gerenciamento de dependências e Build)
* **Git/GitHub** (Versionamento)

---

## 👥 Autores

* **Angelo Zovaro** - *Módulo Hospedagem-Quarto*
* **Luiza Nanni** - *Módulo Cadastro-Hospede*
* **Thales Miranda** - *Módulo Controle-Financeiro*

---
*Projeto desenvolvido para fins acadêmicos da Matéria de Desenvolvimento de Componentes pelo Instituto Federal do Estado de São Paulo - Câmpus Bragança Paulista.*