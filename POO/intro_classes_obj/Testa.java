class Testa {
  public static void main(String[] args) {
    Cliente cli01 = new Cliente();
    cli01.nome = "João Paulo";
    cli01.cpf = "222333555-77";
    cli01.telefone = "00000000000";
    cli01.anoNasc = 2009;

    Cliente cli02 = new Cliente();
    cli02.nome = "André ";
    cli02.cpf = "555555555-66";
    cli02.telefone = "11111111111";
    cli02.anoNasc = 1998;

    Ingresso ing01 = new Ingresso();
    ing01.nomeFilme = "Senhor dos anéis: A Sociedade do Anel";
    ing01.dataFilme = "15/04/2023";
    ing01.horario = "19:30";
    ing01.sala = 3;
    ing01.valor = 30.00;
    ing01.cliente = cli01;

    Ingresso ing02 = new Ingresso();
    ing02.nomeFilme = "O jogo da imitação";
    ing02.dataFilme = "22/09/2024";
    ing02.horario = "22:00";
    ing02.sala = 1;
    ing02.valor = 30.00;
    ing02.cliente = cli02;

    ing01.calculaDescontoIdade(2023);
    ing02.calculaDescontoIdade(2023);

    ing01.imprimeIngresso();
    ing02.imprimeIngresso();
  }
}