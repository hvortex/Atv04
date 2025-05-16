# 📐 Projeto Fatorial em Java

[![Testes](https://github.com/hvortex/Atv04/actions/workflows/tests.yml/badge.svg)](https://github.com/hvortex/Atv04/actions/workflows/tests.yml)
[![Licença MIT](https://img.shields.io/badge/licen%C3%A7a-MIT-green.svg)](LICENSE)
[![Versão](https://img.shields.io/badge/vers%C3%A3o-1.0.0-blue.svg)](https://semver.org/)
[![Cobertura de Testes](https://img.shields.io/badge/cobertura-100%25-brightgreen.svg)](https://github.com/hvortex/Atv04)

Este projeto consiste em uma implementação simples em Java para o cálculo do **fatorial de um número inteiro positivo**. Ele inclui testes unitários utilizando JUnit 5 e segue os padrões de **commits semânticos com emojis**.

---

## ✨ Funcionalidades

- Cálculo do fatorial de números inteiros positivos
- Tratamento de erros para entradas inválidas (como números negativos)
- Testes automatizados com cobertura total
- Validação de mensagens de commit com Conventional Commits

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- JUnit 5
- Git & GitHub
- Git Hooks (`commit-msg.sh`)
- GitHub Actions (para CI)

---

## 🚀 Como Executar o Projeto

### 1. Clonar o repositório

```bash
git clone https://github.com/hvortex/Atv04.git
cd Atv04
```

### 2. Compilar o projeto

```bash
javac Fatorial.java
```

### 3. Executar os testes com JUnit (via Maven ou Console)

#### Usando Maven:

```bash
mvn test
```

#### Ou, com JUnit Console:

```bash
java -jar junit-platform-console-standalone.jar --class-path . --scan-classpath
```

---

## 🧪 Exemplo de Uso

```java
long resultado = Fatorial.calcular(5);
System.out.println(resultado); // Saída: 120
```

---

## ✅ Estrutura do Projeto

```
.
├── Fatorial.java
├── FatorialTest.java
├── .git/
│   └── hooks/
│       └── commit-msg
├── README.md
└── LICENSE
```

---

## 💬 Padrão de Commits

Este projeto usa [Conventional Commits](https://www.conventionalcommits.org/) com emojis. Exemplos:

```bash
:sparkles: feat: Implementar cálculo de fatorial
:white_check_mark: test: Criar testes unitários
:bug: fix: Corrigir erro para entrada negativa
```

---

## 🛡️ Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).

---

## 🙋‍♀️ Contribuindo

Contribuições são bem-vindas!

1. Faça um fork
2. Crie uma branch (`git checkout -b feat/nova-funcionalidade`)
3. Commit com padrão semântico (`git commit -m ":sparkles: feat: nova funcionalidade"`)
4. Envie um Pull Request

---

> Desenvolvido por [@hvortex](https://github.com/hvortex) 💻