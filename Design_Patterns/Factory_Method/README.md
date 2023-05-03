### Factory

![factory](../../imgs/factory.png)

O factory é um padrão criacional, que usa uma interface para criar objetos em uma classe pai, porém com flexibilidade para que os objetos de classes filhos, ou subclasses sejam de tipos distintos.

Imagine várias fabricas montadoras de carros. Em um primeiro momento, podemos trabalhar apenas por exemplo com carros da volkswagen, então instanciamos uma fábrica VW.

Porém caso outras marcas se incluam nesse escopo, tratar de diversas fábricas instanciando-as cada qual com suas características, pode se tornar complexo e cansativo.

E é aí que entra a Factory!! Com ele, a chamada de construtores, as instâncias são chamadas pelo método especial dele, e não diretamente. Assim temos a flexibilidade de utilizar da interface para fazer implementações diferentes para cada caso, usando um padrão comum.

Vamos ver o código:

Primeiro definimos a interface que vai servir de planta para todas as fábricas, possuindo o método de construir um carro qualquer:
```
public interface FabricaDeCarro{
  Carro criarCarro();
}
```

Com essa interface podemos criar classes de diferentes fábricas, e só alteramos o carro que cada fábrica retorna:
```
public class FabricaFiat implements FabricaDeCarro {
  
  @Override
  public Carro criarCarro(){
    
    return new Uno();
  }
}

public class FabricaVW implements FabricaDeCarro {
  
  @Override
  public Carro criarCarro(){
    
    return new Gol();
  }
}
```

Assim com esse padrão, fica fácil de estender códigos já existentes sem a necessidade de uma re-escrita de lógica, apenas adicionando novas subclasses.

Além disso o encapsulamento garante que não será necessário uma preocupação das subclasses com a superclasse, que já está bem definida.


No exemplo de código dessa pasta temos uma interface [FabricaDeCarro](./FabricaDeCarro.java) que serve de planta para duas classes: [FabricaFiat](./FabricaFiat.java) e [FabricaVW](./FabricaVW.java), que por sua vez constroem seus respectivos [Carros](./Carro.java), ou seja, um [Uno](./Uno.java) e um [Gol](./Gol.java).

Também há um [Cliente](./Cliente.java) que testa a funcionalidade desse código!
