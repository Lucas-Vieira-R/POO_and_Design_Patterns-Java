public class Teste{
  public static void main(String[] args){
    RandomGenerator gerador;

    gerador = RandomGenerator.getInstance();

    System.out.println(gerador.nextDouble());
  }
}