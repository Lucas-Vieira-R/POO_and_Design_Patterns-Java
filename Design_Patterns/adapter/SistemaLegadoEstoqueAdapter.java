public class SistemaLegadoEstoqueAdapter implements GerenciadorEstoque{
  private SistemaLegadoEstoque sistemaLegado;
  
  public SistemaLegadoEstoqueAdapter(SistemaLegadoEstoque sistemaLegado){
    this.sistemaLegado = sistemaLegado;
  }
  @Override
  public boolean adicionarProduto(String nome, int qtd){
    return sistemaLegado.adicionar(nome,qtd);
  }
  @Override
  public boolean removerProduto(String nome){
    return sistemaLegado.remover(nome);
  }
  @Override
  public int consultarQtd(String nome){
    return sistemaLegado.consultar(nome);
  }
}