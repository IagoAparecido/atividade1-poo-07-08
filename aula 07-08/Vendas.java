class Vendas {
  Cliente cliente;
  Vendedor vendedor;
  Produto produto;
  int quantidade;
  boolean vendaFinalizada;

  public Vendas(Cliente cliente, Vendedor vendedor, Produto produto, int quantidade) {
    this.cliente = cliente;
    this.vendedor = vendedor;
    this.produto = produto;
    this.quantidade = quantidade;
    this.vendaFinalizada = false;
  }

  public void finalizarVenda() {
    if (!vendaFinalizada) {
      System.out.println("Venda Finalizada:");
      cliente.Acao();
      vendedor.Acao();
      System.out.println("Produto vendido: " + produto.getNome() + ", Quantidade: " + quantidade +
          ", Valor Total: " + (produto.getPreco() * quantidade));
      vendaFinalizada = true;
    } else {
      System.out.println("A venda já foi finalizada.");
    }
  }
}
