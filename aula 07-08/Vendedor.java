class Vendedor extends Pessoa {

    public Vendedor(String nome, int idade) {
        super(nome, idade);
    }

    public void Acao() {
        System.out.println("Vendedor " + getNome() + " está vendendo.");
    }
}