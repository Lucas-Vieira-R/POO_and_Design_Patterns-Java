class Pessoa {
  // Atributos ---------------------------------
  private int peso;
  private double altura;
  private String nome;

  // Construtores --------------------------------
  Pessoa(int peso) {
    this.peso = peso;
  }

  Pessoa(double altura) {
    this.altura = altura;
  }

  Pessoa(String nome) {
    this.nome = nome;
  }

  Pessoa(int peso, double altura, String nome) {
    this.peso = peso;
    this.altura = altura;
    this.nome = nome;
  }

  // Getters e Setters ----------------------------------
  public String getNome() {
    System.out.println(this.nome);
    return this.nome;
  }

  public int getPeso() {
    System.out.println(this.peso);
    return this.peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
    System.out.println("peso atribuido");
  }

  public double getAltura() {
    System.out.println(this.altura);
    return this.altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
    System.out.println("altura atribuido");
  }

}