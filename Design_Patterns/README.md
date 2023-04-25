## Padrões de Design e SOLID
São padrões gerais para uma solução de algum problema que ocorre frequentemente na Engenharia de Software. São como plantas pré projetadas que podem ser modificadas no contexto do projeto, independente de linguagem de programação. (E não, não dá para copiá-los, é necessário uma implementação em seu projeto)

Um dos motivos para sua utilização e implementação é a reutilização de código, legibilidade, economia de tempo etc....

É considerado utilizar dos design paterns como boa prática por suas inúmeras vantagens e é comumente estudado junto com os princípios SOLID.
E tanto os padrões de design quanto os princípios SOLID são utilizados na Programação Orientada a Objetos. 

Além disso tais princípios e padrões em conjunto, fazem parte de softwares bem desenvolvidos, à prova de falhas, de fácil entendimento e manutenção!!

### Princípios SOLID

- **S**ingle Responsability Principle (Princípio da Responsabilidade Única);
- **O**pen/Closed Principle (Princípio Aberto/Fechado);
- **L**iskov Substitution Principle (Princípio da substituição de Liskov);
- **I**nterface Segregation Principle (Princípio da Segregação de Interface);
- **D**ependency Inversion Principle (Princípio da Inversão de Dependência).

Esse princípios, respectivamente dizem que:
- Cada classe deve ter uma única responsabilidade e propósito.
- As classes devem ser abertas para se extender, acrescentar, porém fechadas para a modificação do que já é existente.
- Dada uma subclasse S da classe T, a classe S pode substituir a classe T, sem modificações no programa
- Uma classe não deve implementar interfaces que não utilizará.
- Dependa de abstrações e não de implementações.

### Padrões de Design
Os design patterns são divididos em 3 categorias, criacionais, estruturais e comportamentais.

Os criacionais oferecem alternativas para a criação de objetos, aumentando a flexibilidade e reutilização de código.

Os estruturais nos mostram como organizar e estruturar os objetos e classes em grandes estruturas.

E os comportamentais mostram maneiras que objetos se comunicam e comportam entre si.

#### Nesse repositório temos implementados 7 design patterns em Java sendo eles:
- Criacionais:
    - [Factory](./Factory_Method/)
    - [Abstract Factory](./Abstract_Factory/)
    - [Builder](./builder/)
    - [Singleton](./Singleton/)
- Estruturais:
    - [Adapter](./adapter/)
    - [Facade](./facade/)
- Comportamentais:
    - [State](./state/)
    

