class Cliente extends Pessoa {

    public Cliente(String nome, int idade) {
        super(nome, idade);
    }

    public void Acao() {
        System.out.println("Cliente " + getNome() + " está comprando.");
    }
}