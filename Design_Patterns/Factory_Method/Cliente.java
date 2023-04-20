
public class Cliente{

  public static void main(String[] args){
    FabricaDeCarro fabrica = new FabricaFiat();
    Carro carro = fabrica.criarCarro();
    carro.exibirInfo();
    System.out.println();

    fabrica = new FabricaVW();
    carro = fabrica.criarCarro();
    carro.exibirInfo();
    System.out.println();
  }
}