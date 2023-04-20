public interface GerenciadorEstoque{
  public boolean adicionarProduto(String nome, int qtd);
  public boolean removerProduto(String nome);
  public int consultarQtd(String nome);

  
}