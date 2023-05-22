## Singleton

O singleton é um padrão criacional que tem a função de garantir que uma classe só tenha uma instância, enquanto fornece um acesso global à essa instância.

![singleton1](../../imgs/singleton1.png)

A razão comum do uso desse padrão é controlar acessos a recursos compartilhados, como banco de dados ou arquivos.

Pensando na prática, suponha que você desenvolveu uma classe com a funcionalidade de gerar um número aleatório. Ao instanciá-la a primeira vez, tudo ocorre conforme o esperado, o objeto é criado e você tem acesso aos métodos dessa classe.

![singleton1](../../imgs/singleton2.png)

Porém por motivos de memória e performance, não é ideal que seja instanciado essa classe a cada geração de um número aleatório. Então cada nova instanciação de um novo objeto, na realiadde retornará o objeto já criado.

Para essa funcionalidade, o construtor regular não é suficiente, então colocamos o construtor como privado para prevenir novas instâncias com o operador `new`.

```
  private RandomGenerator(){}
```

Além disso criamos um método estático que lida com novas chamadas, chamando o construtor regular dentro de uma lógica que verifica se uma instância já foi realizada:

```
  public static RandomGenerator getInstance(){
    if(instance ==null){
      instance = new RandomGenerator();
    }
    return instance;
  }
```

Caso já exista uma instância, ela é retornada nesse chamado, caso não, um novo objeto é criado e retornado.

No fim, a classe se parece com isso:

```
public class RandomGenerator{
  private static RandomGenerator instance = null;

  private RandomGenerator(){}

  public static RandomGenerator getInstance(){
    if(instance ==null){
      instance = new RandomGenerator();
    }
    return instance;
  }
  public double nextDouble(){
    return Math.random();
  }
  
}
```
Esse padrão é usado para controlar o acesso de recursos compartilhados e quando algum desses recursos só deva ter uma instância. Com ele podemos ter certeza que só há uma instância e também que existe um ponto de acesso global.

Um adendo especial que esse padrão viola o princípio de responsabilidade única, já que garante que a classe tenha uma única instância e também fornece um ponto de acesso global à ela.


###### Caso queira ver a implementação desse padrão em outra linugagem e de maneira mais concisa e aprofundada, recomendo o site [Refactoring Guru](https://refactoring.guru/pt-br), que possui um acervo de muitos design patterns e suas implementações em diversas linguagens com vários exemplos!!!!