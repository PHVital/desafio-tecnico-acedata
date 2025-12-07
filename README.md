# ☕ Avaliação Técnica - Acedata Software

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen?style=for-the-badge)

Este repositório contém a solução desenvolvida para a avaliação prática de desenvolvedor da **Acedata Software**. O projeto consiste em um sistema unificado de linha de comando (CLI) que resolve três desafios de lógica de programação distintos.

## 📋 Sobre o Projeto

O sistema foi desenvolvido em **Java**, priorizando a orientação a objetos, código limpo (Clean Code) e otimização de algoritmos. A aplicação conta com um menu interativo que permite navegar entre os três exercícios propostos.

### 🚀 Funcionalidades e Decisões Técnicas

#### 1. Cálculo Salarial (`CalculoSalarial.java`)
Sistema para cálculo de folha de pagamento de horistas.
* **Destaque:** Implementação encapsulada das regras de negócio para as faixas de "Salário Família" conforme especificado no edital.
* **Foco:** Precisão decimal e clareza nas regras condicionais.

#### 2. Análise de Sequência Numérica (`SequenciaNumerica.java`)
Análise estatística de uma entrada de dados definida pelo usuário.
* **Otimização:** A lógica de busca do maior e menor número foi implementada manualmente utilizando um **único loop de repetição**.
* **Complexidade:** $O(n)$ - O algoritmo percorre a lista apenas uma vez, garantindo performance superior a métodos de ordenação ($O(n \log n)$).

#### 3. Sequência de Fibonacci (`Fibonacci.java`)
Geração e verificação matemática da sequência.
* **Geração:** Cria a lista dos N primeiros termos (iniciando em 1, 1).
* **Verificação Avançada:** Para verificar se um número `N` pertence à sequência, foi implementada uma lógica matemática que verifica a **série infinita**, não se limitando apenas à lista gerada visualmente. Isso garante que o sistema responda corretamente mesmo para casos de borda.
* **DRY (Don't Repeat Yourself):** A lógica de geração e verificação foi separada para evitar duplicidade de código.

---

## 📂 Estrutura do Projeto

O projeto foi organizado em classes com responsabilidades únicas para facilitar a manutenção e a legibilidade.

```text
src/
├── SistemaAvaliacao.java   # Classe Principal (Entry Point e Menu)
├── CalculoSalarial.java    # Lógica do Exercício 1
├── SequenciaNumerica.java  # Lógica do Exercício 2
└── Fibonacci.java          # Lógica do Exercício 3