abstract class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract void Acao();
}

// public class Pessoa extends SQLClass {
// @Key

// String nome;
// String idade;
// String funcao;

// Pessoa() {
// this.setTableName("PESSOA");
// }

// public void printCliente() {
// System.out.println(

// this.nome + ", " +
// this.idade);
// }
// }
