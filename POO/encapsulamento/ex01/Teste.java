class Teste{
  public static void main(String[] args){
    Pessoa p1 = new Pessoa("Roberto");
    p1.getNome();

    Pessoa p2 = new Pessoa(68);
    p2.getPeso();

    Pessoa p3 = new Pessoa(1.75);
    p3.getAltura();

    Pessoa p4 = new Pessoa(70, 1.80, "João Victor");
    p4.getNome();
    p4.getPeso();
    p4.getAltura();
    
  }
}