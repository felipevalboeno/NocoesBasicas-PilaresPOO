# 📚 Fundamentos de Programação Orientada a Objetos em Java

Este repositório explica conceitos essenciais de **POO (Programação Orientada a Objetos)** em Java com exemplos e analogias super simples.  

---
# 👨‍👧 Herança: Explicação simples
**Herança é como quando um filho herda coisas do pai ou da mãe.**


Na programação, uma classe filha herda coisas (características e habilidades) de uma classe mãe (superclasse).

### Exemplo com animais
Imagine:


  - Animal é a classe mãe.

    - Todo animal sabe comer e dormir.

    
  - Cachorro é a classe filha.


    - Ele herda comer e dormir do Animal.
   
      
    - E ainda ganha a habilidade de latir.

✅ Assim:  

1- Animal (classe mãe):  
   - comer()  
   - dormir()  
   
2- Cachorro (classe filha):  
   - comer() (herdado)  
   - dormir() (herdado)  
   - latir() (próprio)



Em java seria essa a ideia:
```java
class Animal {
    void comer() {
        System.out.println("Animal comendo");
    }
    void dormir() {
        System.out.println("Animal dormindo");
    }
}

class Cachorro extends Animal {
    void latir() {
        System.out.println("Cachorro latindo");
    }
}
```
***O cachorro já sabe comer e dormir sem precisar reescrever esses métodos!***
<p align="center">
<img src="https://github.com/felipevalboeno/assets/blob/main/heran%C3%A7a.png" width="50%"/>
</p>

### Em palavras bem simples:
A classe filha pega as coisas prontas da classe mãe e ainda pode ter as suas próprias coisas.


Ou seja: "É como quando você herda os olhos da mamãe e o cabelo do papai, mas também tem seu próprio jeito de falar e brincar!"

---
# 🎭 Polimorfismo: Explicação simples


**Polimorfismo é quando coisas diferentes sabem fazer a mesma coisa, mas cada uma do seu jeitinho.**

🐾 Exemplo com animais
Imagina:
Todos os animais fazem som.
Mas cada animal faz um som diferente:
- Cachorro: late
- Gato: mia
-  Coelho: não faz som ou faz som baixinho

Ou seja: “É como se todos os bichinhos soubessem falar, mas cada um falasse de um jeito!”

<p align="center">
<img src="https://github.com/felipevalboeno/assets/blob/main/polimorfismo.png" width="50%"/>
</p>

Em java:
```java
class Animal {
    void fazerSom() {
        System.out.println("Som de animal");
    }
}

class Cachorro extends Animal {
    void fazerSom() {
        System.out.println("Au Au!");
    }
}

class Gato extends Animal {
    void fazerSom() {
        System.out.println("Miau!");
    }
}

class Coelho extends Animal {
    void fazerSom() {
        System.out.println("...");
    }
}
```

---
# 🔒 Encapsulamento: Explicação simples


**Encapsulamento é como guardar coisas importantes dentro de uma caixa com tampa.**


✅ Você protege o que está dentro.


✅ Só quem tiver a chave certa pode abrir ou mudar o que está dentro.


🗃️ Exemplo com brinquedos:


  - Você tem uma caixa de brinquedos.


  - Os brinquedos estão guardados dentro, ninguém pega sem abrir.


  - Você mesmo decide quando e como abrir a caixa para pegar ou colocar brinquedos.

✅ Em POO:


  - Os atributos ficam privados (dentro da caixa).

    
  - Você cria métodos públicos (getters e setters) para pegar ou alterar os valores.

    
✅ Você controla quem acessa e como acessa.


✅ Assim você controla quem mexe nos brinquedos!

Ou seja: “Encapsulamento é como guardar algo importante em uma caixa com tampa. Você decide quem abre e quem mexe!”

Em Java:
```java
public class CaixaDeBrinquedos {
    private String brinquedo;

    // Getter (para ver o que tem na caixa)
    public String getBrinquedo() {
        return brinquedo;
    }

    // Setter (para colocar um brinquedo na caixa)
    public void setBrinquedo(String brinquedo) {
        this.brinquedo = brinquedo;
    }
}

```
✅ Atributo brinquedo está guardado na caixa (privado/private).


✅ Só podemos acessar usando as chaves certas (get e set).

<p align="center">
<img src="https://github.com/felipevalboeno/assets/blob/main/encapsulamento.png" width="50%"/>
</p>

---
# 💡 Abstração: Explicação simples
**Abstração é como mostrar só o que importa e esconder os detalhes complicados.**

🎮 Exemplo com videogame


Imagina que você tem um controle de videogame:

✅ Você vê e usa os botões:
- pular ⭕
- correr ✖️
- atirar [R1]


✅ Mas você não vê os fios e circuitos dentro dele!


Ou seja: “Você só precisa saber apertar o botão para pular, não precisa saber como o videogame faz ele pular!”

✅ Em POO
Abstração cria modelos simples para usar objetos sem se preocupar com os detalhes internos.
Você usa sem precisar saber como funciona por dentro.

Em java:
```java
abstract class Animal {
    abstract void fazerSom();
}

class Cachorro extends Animal {
    void fazerSom() {
        System.out.println("Au Au!");
    }
}
```
✅ Animal é abstrato: define o que precisa ter (fazerSom), mas não diz como fazer.


✅ Cada animal implementa do seu jeito.

<p align="center">
<img src="https://github.com/felipevalboeno/assets/blob/main/abstracao.png" width="50%"/>
</p>

---
# Extras
---
## 🟠 1️⃣ Construtores

> **Construtores** são como o **manual de instruções** para montar um objeto. Eles definem como o objeto nasce, inicializando os valores necessários.
> Os construtores em Java servem para criar e inicializar objetos da classe. Quando criamos um objeto com o new(Usuario usuario = new Usuario();), o construtor é chamado para configurar o estado inicial daquele objeto.

### ✅ Analogia:


Imagina que um construtor é como um "manual" para montar um brinquedo.


Quando você ganha um brinquedo novo, ele vem desmontado dentro da caixa, certo? O manual mostra como montar o brinquedo para ele ficar pronto para brincar.


No Java, quando a gente quer criar um objeto (que é como montar um brinquedo), o construtor é esse manual que ensina como montar o objeto direitinho.

### Por que isso é importante?


Se o brinquedo não vier com o manual, você pode montar errado ou ficar sem montar nada. No Java, se você não tiver um construtor para ajudar a montar o objeto, o programa não sabe como criar o objeto direito.

A imagem vai mostrar:
1. **Construtor vazio:**  É importante especialmente para frameworks (como JPA/Hibernate) que precisam instanciar objetos via reflexão sem argumentos. Ele cria o objeto sem inicializar nenhum atributo. Figura desmontada, só a caixa.
2. **Construtor com nome, email, senha:** figura montada, mas sem etiqueta (id).
3. **Construtor com id, nome, email, senha:** figura montada e com etiqueta (id).

<p align="center">
<img src="https://github.com/felipevalboeno/assets/blob/main/construtor.png" width="50%"/>
</p>

# 🧩 Construtores em Java: Analogia com Manual de Montagem

## 📦 Caixa de Brinquedo "Usuário"

```plaintext
┌──────────────────────────────────────┐
│                                      │
│   [FIGURA DESMONTADA]                │
│   (Peças soltas: nome, email, senha) │
│                                      │
│   ┌────────────────────────────────┐ │
│   │         MANUAIS                │ │
│   │  (Construtores)                │ │
│   │                                │ │
│   │ 1. Manual Básico:              │ │
│   │    Usuario() {}                │ │
│   │    (monta sem configurações)   │ │
│   │                                │ │
│   │ 2. Manual Completo:            │ │
│   │    Usuario(nome, email, senha) │ │
│   │    (monta com dados essenciais)│ │
│   │                                │ │
│   │ 3. Manual Premium:             │ │
│   │    Usuario(id, nome, email,    │ │
│   │             senha)             │ │
│   │    (monta com ID e dados)      │ │
│   └────────────────────────────────┘ │
│                                      │
└──────────────────────────────────────┘

[LEGENDA]
• A caixa representa a classe Usuario
• Os manuais são os construtores
• A figura montada é o objeto instanciado
• Cada manual produz uma versão diferente do objeto

┌──────────────────────────────────────┐
│  USUÁRIO PRONTO                      │
│  ┌──────────────────────────────┐    │
│  │ ID: 1234 (etiqueta fixa)     │    │
│  │ Nome: João                   │    │
│  │ Email: joao@exemplo.com      │    │
│  │ Senha: ********              │    │
│  └──────────────────────────────┘    │
└──────────────────────────────────────┘
```
📝 Legenda:


📦 Caixa -->	Classe Usuario


📖 Manuais  -->	Construtores da classe


🧸 Figura Montada  -->	Objeto instanciado


1️⃣ Manual Básico  -->	Construtor padrão Usuario()


2️⃣ Manual Completo  -->	Construtor com parâmetros essenciais


3️⃣ Manual Premium  -->	Construtor com todos os atributos


### ✅ Código Java:

```java
public class Usuario {
    private Long id;
    private String nome;
    private String email;
    private String senha;

    // Construtor vazio
    public Usuario() {
    }

    // Construtor com todos os atributos
    public Usuario(Long id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Construtor sem id
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
}
```
## Resumo do que construtores fazem:
1. Inicializam os objetos.
2. Permitem criar objetos de formas diferentes (com diferentes dados).
3. Facilitam a manipulação dos dados da classe desde a criação do objeto.
4. Podem garantir que o objeto seja criado com os dados mínimos necessários.


## 🟠 2️⃣ Getters and Setters

✅ Exemplo super simples com a classe Usuario:


```java
public class Usuario {
    private String nome;

    // Getter
    public String getNome() {
        return nome;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }
}
```

👉 Resumidamente:
**Getter:** serve para pegar/ler uma informação do objeto.
**Setter:** serve para mudar/atualizar uma informação do objeto.

🌟 Getter and Setter: Imaginando o personagem
Pensa assim: você tem a figura de ação que já tem nome, email, senha, id.

✅ Getter = “olhar a etiqueta”


É como se você lesse o que está escrito na etiqueta ou na roupa do boneco:


“Qual o nome dele?”


“Qual o email?”


“Qual o id?”

Você chama usuario.getNome() e ele devolve o nome.
```java
public String getNome() {
    return nome;
}
```

✅ Setter = “trocar a etiqueta”


É como se você colasse uma nova etiqueta ou trocasse a roupa do boneco:

“Vou mudar o nome dele para Batman!”


“Vou trocar o email.”


“Vou dar uma nova senha.”

Você chama usuario.setNome("Batman") e pronto: o nome mudou!
```java
public void setNome(String nome) {
    this.nome = nome;
}
```
Ou seja: "Getter é para descobrir algo sobre o boneco. Setter é para mudar algo no boneco."


