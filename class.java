public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("João", 20);
        p1.apresentar();

        Carro c1 = new Carro("Fusca", 1980);
        c1.exibirInfo();

        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis");
        l1.mostrarDetalhes();

        Aluno a1 = new Aluno("Maria", 8.5);
        a1.verificarAprovacao();

        ContaBancaria conta = new ContaBancaria("Carlos", 1000);
        conta.depositar(500);
        conta.sacar(300);
    }
}

// Classe Pessoa
class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}

// Classe Carro
class Carro {
    String modelo;
    int ano;

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirInfo() {
        System.out.println("Carro: " + modelo + " - Ano: " + ano);
    }
}

// Classe Livro
class Livro {
    String titulo;
    String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarDetalhes() {
        System.out.println("Livro: " + titulo + " - Autor: " + autor);
    }
}

// Classe Aluno
class Aluno {
    String nome;
    double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public void verificarAprovacao() {
        if (nota >= 7) {
            System.out.println(nome + " foi aprovado!");
        } else {
            System.out.println(nome + " foi reprovado!");
        }
    }
}

// Classe ContaBancaria
class ContaBancaria {
    String titular;
    double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado. Novo saldo: " + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
