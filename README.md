# Factory Pattern em Java 📚

Projeto desenvolvido em Java para demonstrar a implementação do **Factory Pattern (Padrão de Projeto Factory)**.

A ideia do projeto é utilizar o padrão Factory para criar diferentes tipos de livros sem precisar instanciar diretamente suas classes, deixando o código mais organizado, flexível e fácil de manter.

## 💡 Sobre o projeto

O sistema simula uma fábrica de livros, onde é possível criar diferentes formatos de leitura:

- 📖 Livro físico
- 🎧 Audiobook
- 📱 Ebook

A criação dos objetos é feita através de uma Factory, que fica responsável por decidir qual classe deve ser criada conforme o tipo solicitado.

## 🏗️ Estrutura do projeto

```text
Factory-Java/
│
├── src/
│   │
│   ├── factory/
│   │   └── LivroFactory.java
│   │
│   ├── model/
│   │   ├── Livro.java
│   │   ├── LivroFisico.java
│   │   ├── Ebook.java
│   │   └── Audiobook.java
│   │
│   └── Main.java
│
├── .gitignore
└── README.md
```

## 🧠 Conceitos aplicados

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Herança
- Polimorfismo
- Interfaces
- Factory Pattern

## ⚙️ Funcionamento

A Factory recebe o tipo de livro informado e retorna o objeto correspondente.

Exemplo:

```java
Livro livro = LivroFactory.criarLivro("ebook");
```

A classe principal não precisa saber qual implementação será criada, deixando essa responsabilidade para a Factory.

## 🚀 Como executar

1. Clone o repositório:

```bash
(https://github.com/PedroSouza77/Factory-Java)
```

2. Abra o projeto em uma IDE Java ou no VS Code.

3. Compile o Java

```text
javac -d bin src\Main.java src\factory\*.java src\model\*.java
```
4. Execute a Main
```
java -cp bin Main
```

## 🛠️ Tecnologias utilizadas

<div align="center">

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="70" height="70"/>
&nbsp;&nbsp;&nbsp;
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/git/git-original.svg" width="70" height="70"/>
&nbsp;&nbsp;&nbsp;
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/github/github-original.svg" width="70" height="70"/>
&nbsp;&nbsp;&nbsp;
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/vscode/vscode-original.svg" width="70" height="70"/>

</div>

<br>

## 🎯 Objetivo

Projeto criado para praticar o uso do **Factory Pattern** e entender como aplicar padrões de projeto para melhorar a organização e manutenção de aplicações Java.

---

Desenvolvido por Pedro Benevides Souza e Everton Rodrigues para estudos de Design Patterns em Java 🚀
