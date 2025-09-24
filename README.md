# 🚀 Sistema de Gerenciamento de Cursos

## 📌 Descrição do Projeto
Esta aplicação web, desenvolvida em **Spring Boot**, implementa um sistema de gerenciamento com operações **CRUD**. Ela permite gerenciar entidades inter-relacionadas, como **Produtos**, **Categorias** e **Fornecedores**, e implementa quatro tipos de relacionamentos:

- Um-para-Um  
- Um-para-Muitos  
- Muitos-para-Um 

💡 Ideal para estudo de **Spring Boot**, **JPA** e **REST API**.

---

## 🛠 Tecnologias Utilizadas
- Java 17  
- Spring Boot 3.x  
- Spring Data JPA  
- H2 Database (desenvolvimento) / MySQL (produção)  
- Maven  
- Lombok (opcional)  
- REST API  

---

## 🏷 Entidades do Sistema

### 1️⃣ Produto
- `id` (Long)  
- `nome` (String)  
- `descricao` (String)  
- `preco` (BigDecimal)  
- `categoria` (Muitos-para-Um com Categoria)  
- `fornecedores` (Muitos-para-Muitos com Fornecedor)  

### 2️⃣ Categoria
- `id` (Long)  
- `nome` (String)  
- `descricao` (String)  
- `produtos` (Um-para-Muitos com Produto)  

### 3️⃣ Fornecedor
- `id` (Long)  
- `nome` (String)  
- `produtos` (Muitos-para-Muitos com Produto)  

---

## 🔗 Relacionamentos
- **Um-para-Um:** Produto → DetalhesProduto (opcional)  
- **Um-para-Muitos:** Categoria → Produtos  
- **Muitos-para-Um:** Produto → Categoria  
- **Muitos-para-Muitos:** Produto ↔ Fornecedor  

---

## ⚡ Funcionalidades CRUD

### Produto
- **GET /produtos** – Lista todos os produtos  
- **POST /produtos** – Adiciona um produto  
- **DELETE /produtos/{id}** – Remove um produto  

---

### 💻 Como Executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/gabriel-freitas96/Sistema-de-Gerenciamento-de-Cursos.git
