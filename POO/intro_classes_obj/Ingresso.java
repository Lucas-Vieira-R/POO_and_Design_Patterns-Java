class Ingresso {
  String nomeFilme;
  String dataFilme;
  String horario;
  int sala;
  double valor;
  Cliente cliente;

  public void calculaDescontoIdade(int anoAtual) {
    if ((anoAtual - this.cliente.anoNasc) >= 12 && (anoAtual - this.cliente.anoNasc) <= 15) {
      this.valor = this.valor * 0.6;
    } else if ((anoAtual - this.cliente.anoNasc) >= 16 && (anoAtual - this.cliente.anoNasc) <= 20) {
      this.valor = this.valor * 0.7;
    } else if ((anoAtual - this.cliente.anoNasc) > 20) {
      this.valor = this.valor * 0.8;
    }
  }

  public void imprimeIngresso() {
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("----- Dados do Filme -----");
    System.out.println("Nome do filme: " + this.nomeFilme);
    System.out.println("Data do filme: " + this.dataFilme);
    System.out.println("Horário do filme: " + this.horario);
    System.out.println("Sala do filme: " + this.sala);
    System.out.println("Valor do ingresso: " + this.valor);
    System.out.println("\n");
    System.out.println("----- Dados do Cliente -----");
    System.out.println("Nome do Cliente: " + this.cliente.nome);
    System.out.println("Nascimento do cliente: " + this.cliente.anoNasc);
    System.out.println("CPF do cliente: " + this.cliente.cpf);
    System.out.println("Telefone do cliente: " + this.cliente.telefone);
  }
}