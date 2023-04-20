public class FabricaFiat implements FabricaDeCarro{
  @Override
  public CarroSedan criarCarroSedan(){
    return new Siena();
  } 

  @Override
  public CarroHatch criarCarroHatch(){
    return new Argo();
  }
}