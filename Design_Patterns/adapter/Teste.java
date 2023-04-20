public class Teste{
  public static void main(String[] args){
    SistemaLegadoEstoque sistemaLegado = new SistemaLegadoEstoque();
    GerenciadorEstoque adaptador = new SistemaLegadoEstoqueAdapter(sistemaLegado);

    adaptador.adicionarProduto("Produto1",10);
    adaptador.adicionarProduto("Produto2",5);
    System.out.println(adaptador.consultarQtd("Produto2"));
    
  }
}