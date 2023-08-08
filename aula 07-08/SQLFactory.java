public class SQLFactory {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Roberto", 20);
        Vendedor vendedor1 = new Vendedor("Maria", 28);

        Produto produto1 = new Produto("Madeira", 500);
        // Produto produto2 = new Produto("Mesa de Madeira", 150);

        Vendas pedido1 = new Vendas(cliente1, vendedor1, produto1, 2);
        pedido1.finalizarVenda();

        // Vendas pedido2 = new Vendas(cliente1, vendedor1, produto2, 3);
        // pedido2.finalizarVenda();

        // produto. = "Fabrício";
        // produto.cnh = "5533777777";
        // produto.id_veiculo = 1;

        // vendas.marca_veiculo = "DAF";
        // vendas.modelo_veiculo = "DAF FX";
        // vendas.placa_veiculo = "CX0JD17";
        // vendas.carga_maxima = 40.000;

        // vendas.id_motorista = 1;

        // try {
        // Database.inserirRegistro(cliente1);

        // Database.inserirRegistro(produto);

        // Database.inserirRegistro(viagem1);

        // Database.inserirRegistro(vendas);

        // System.out.println("\nDados inseridos com sucesso!\n");

        // } catch (Exception e) {
        // System.out.println("\nNao foi possivel inserir os dados");
        // }

    }
}
