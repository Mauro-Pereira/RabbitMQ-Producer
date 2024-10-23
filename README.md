# 🚀 RabbitMQ Producer - Messaging System

![RabbitMQ Logo](https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/RabbitMQ_logo.svg/640px-RabbitMQ_logo.svg.png)

## 📖 Sobre o RabbitMQ

RabbitMQ é um broker de mensagens amplamente utilizado para troca de mensagens entre diferentes sistemas e serviços. Ele funciona como um intermediário, garantindo que as mensagens sejam entregues corretamente entre um **produtor** (quem envia a mensagem) e um **consumidor** (quem recebe a mensagem). É ideal para sistemas distribuídos, microserviços, filas de tarefas, e outros cenários que demandam comunicação assíncrona.

### 🔧 Como Funciona?

O RabbitMQ utiliza um sistema de **filas** (queues) para gerenciar o tráfego de mensagens. O produtor envia uma mensagem para uma **exchange**, que roteia essa mensagem para a fila apropriada. O consumidor, então, recupera essa mensagem da fila. A arquitetura simplificada do RabbitMQ é a seguinte:


1. **Producer** (Produtor): Gera e envia mensagens.
2. **Exchange**: Determina para qual fila a mensagem deve ser enviada.
3. **Queue** (Fila): Armazena as mensagens até que os consumidores as processem.
4. **Consumer** (Consumidor): Recebe e processa as mensagens da fila.

### 🛠️ Casos de Uso

RabbitMQ é amplamente utilizado em cenários onde há a necessidade de comunicação assíncrona e desacoplamento entre serviços, como:

- Sistemas de microserviços
- Filas de tarefas para processamento em segundo plano
- Integração de sistemas de diferentes tecnologias
- Logística de grandes volumes de mensagens (event-driven systems)

## 🔑 O que é um "Produtor de Mensagem"?

O **Produtor** é o responsável por criar e enviar mensagens para o RabbitMQ. Ele se conecta à exchange e envia os dados que serão processados ou armazenados até que um consumidor os recupere.

Neste projeto, o nosso **Producer** é responsável por gerar e enviar uma mensagem para o RabbitMQ, que será consumida por um **Consumer**.

## 🎯 O que é um "Consumidor de Mensagem"?

O **Consumer** é a entidade que consome as mensagens enviadas para as filas. Ele escuta a fila específica e processa cada mensagem conforme elas são disponibilizadas. Neste projeto, o Consumer deve ser configurado separadamente.

---

## ⚙️ Como Executar este Projeto

Para executar este projeto, siga os passos abaixo:

### 📁 1. Clonando o Projeto

Clone o repositório para sua máquina local usando o seguinte comando:

```bash
git clone https://github.com/Mauro-Pereira/RabbitMQ-Producer.git
cd RabbitMQ-Producer
```

### 🐋 2. Usando Docker

Certifique-se de que você tem o Docker instalado em sua máquina. Depois de clonar o projeto, execute o seguinte comando para iniciar o RabbitMQ e o Producer:

```bash
    docker-compose up
```

Este comando irá levantar as instâncias do RabbitMQ e do Producer, permitindo o envio de mensagens.

### 🛠️ 3. Executando em uma IDE

Caso prefira rodar o projeto diretamente em uma IDE (como IntelliJ ou Eclipse), siga estes passos:

1. **Java** 17 e **Maven** devem estar instalados em sua máquina.
2. Importe o projeto em sua IDE de preferência.
3. Execute o projeto como uma aplicação Spring Boot.

---

## ⚙️ Como Acessar o Admin do RabbitMQ?

Para acessar a página de Admin do RabbitMQ para fazer gerenciamento você fará da seguinte forma:

1. Com projeto rodando, você acessará a seguite URL: http://localhost:15672;
2. Ao fazer isso, aparecerá uma página de login. Entre com usuário e senha abaixo:

```bash
    usuário: guest
    senha: guest
```

### 📦 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **RabbitMQ**
- **Docker**
- **Maven**

---

### 👨‍💻 Contribua ou Use em Seus Projetos

Este projeto foi desenvolvido com foco na simplicidade e modularidade, sendo um ótimo exemplo para quem quer entender como funciona a comunicação via RabbitMQ. Fique à vontade para contribuir ou usá-lo como base em seus projetos reais.

---

### 🌐 Link Útil 

- [Documentação Oficial do RabbitMQ](https://www.rabbitmq.com/)

---

### 🤝 Contribuições

Sinta-se à vontade para abrir issues ou enviar pull requests! Estou aberto a colaborações que tornem este projeto ainda mais completo.