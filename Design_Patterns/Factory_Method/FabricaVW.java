public class FabricaVW implements FabricaDeCarro {
  
  @Override
  public Carro criarCarro(){
    
    return new Gol();
  }
}