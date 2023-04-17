class Teste {
  public static void main(String[] args) {

    Moto moto = new Moto("Yamaha", 30, false);
    Carro carro = new Carro("VW", 80, true);
    Caminhao caminhao = new Caminhao("volvo", 250, true);

    moto.potencia = 50;
    carro.temPorta = false;

    // error: marca has private access in Caminhao
    caminhao.marca = "scania";

  }
}