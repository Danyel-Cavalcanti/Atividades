public class Carro {
    String modelo;
    int ano;

    void exibirInfo() {
        System.out.println("Carro: " + modelo + " - Ano: " + ano);
    }
}

public class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Oi, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}

public class Produto {
    String nome;
    double preco;

    void mostrarPreco() {
        System.out.println("Produto: " + nome + " custa R$" + preco);
    }
}

class Cachorro {
    String nome;
    int idade;

    void latir() {
        System.out.println(nome + " está latindo!");
    }
}

class Livro {
    String titulo;
    int paginas;

    void mostrarInfo() {
        System.out.println("Livro: " + titulo + " - Páginas: " + paginas);
    }
}
