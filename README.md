# maratona-java
Trata-se de um projeto de aprendizagem para aprender a linguagem Java. 
Estou compartilhando desde o inicio, para que fique em um ambiente as falhas e acertos durante o processo de aprendizagem. 
Existe uma premissa que java é uma linguágem complexa e estou tentando quebrar com esse pré-conceito, que acabou sendo internalizado através de uma experiência ruim. 
Estou iniciando meus conceitos também no GitHub, portanto estou aprendendo com os meus erros. Aceito retornos construtivos. 
=======
# 📚 Cadastro de Livros

Este projeto é uma aplicação simples em Java para cadastrar e exibir informações sobre livros. O objetivo é permitir que o usuário cadastre livros, armazenando seus dados (título, autor e ano de publicação), e visualize os livros cadastrados.

## 📂 Estrutura do Projeto

O projeto é composto por duas classes principais:

### 1. **Classe `Livro`**
Representa um livro e contém as seguintes propriedades e métodos:

- **Propriedades**:
  - `titulo` (String): O título do livro.
  - `autor` (String): O autor do livro.
  - `ano` (int): O ano de publicação do livro.

- **Métodos**:
  - `Livro(String titulo, String autor, int ano)`: Construtor para inicializar o livro com título, autor e ano.
  - `getTitulo()`: Retorna o título do livro.
  - `getAutor()`: Retorna o autor do livro.
  - `setAno(int ano)`: Modifica o ano de publicação do livro.
  - `exibirInfo()`: Exibe as informações do livro no console.

### 2. **Classe `Cadastro`**
Responsável pela interação com o usuário e o gerenciamento dos livros cadastrados. O fluxo de execução é controlado por um menu de opções, onde o usuário pode escolher entre cadastrar livros ou exibir os livros cadastrados.

- **Funções**:
  - Cadastrar livros com título, autor e ano.
  - Exibir os livros já cadastrados.
  - Sair do programa.

## ⚙️ Como Executar

1. **Clonando o repositório:**

   Clone este repositório ou baixe os arquivos do projeto para sua máquina local.

2. **Compilando e executando:**
   
   Para compilar e executar o programa, use um ambiente de desenvolvimento Java, como o Eclipse ou IntelliJ, ou compile via terminal usando o comando `javac`:

   ```bash
   javac Cadastro.java Livro.java
   java Cadastro
   ```

3. **Interação com o programa:**

   O programa exibirá um menu com opções para o usuário. Para interagir, basta seguir as instruções no console.

## 🖥️ Exemplo de Execução

```bash
Cadastro de Livros
1. Cadastrar livros
2. Exibir livros cadastrados
3. Sair
Escolha uma Opção: 1
Digite o título do livro: O Senhor dos Anéis
Digite o autor do livro: J.R.R. Tolkien
Digite o ano de publicação: 1954
Livro cadastrado com sucesso.

Cadastro de Livros
1. Cadastrar livros
2. Exibir livros cadastrados
3. Sair
Escolha uma Opção: 2

Livros cadastrados:
Título: O Senhor dos Anéis
Autor: J.R.R. Tolkien
Ano: 1954
```

## 🔧 Tecnologias Utilizadas

- **Java 8+**
- **Estruturas de Dados**: `ArrayList`, `Scanner`

## 🎯 Funcionalidades

- **Cadastrar livros**: Permite inserir livros com título, autor e ano.
- **Exibir livros cadastrados**: Exibe todos os livros cadastrados até o momento.
- **Interface simples e funcional**: Interface de texto simples, mas eficiente.

## 🚀 Como Contribuir

Se você tem sugestões de melhorias ou encontrou algum erro, sinta-se à vontade para abrir uma *issue* ou enviar um *pull request*. Fico feliz em revisar contribuições!

## 📝 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
>>>>>>> 60ee3d99084ff9efc3d8a5953a837dab6c71149a
