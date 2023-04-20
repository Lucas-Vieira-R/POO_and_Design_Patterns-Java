public class Cliente{
  public static void main(String[] args){
    FabricaDeCarro fabrica = new FabricaFiat();
    CarroSedan sedan = fabrica.criarCarroSedan();
    CarroHatch hatch = fabrica.criarCarroHatch();

    sedan.exibirInfoSedan();
    System.out.println();
    hatch.exibirInfoHatch();
  }
}