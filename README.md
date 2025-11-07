# Padrão Strategy

O **padrão Strategy** é um padrão de projeto **comportamental** que permite definir diferentes algoritmos para uma mesma operação e alterná-los **dinamicamente**, sem alterar o código principal.  

Neste projeto, ele é usado para o **cálculo de frete**, onde cada tipo de envio — **Sedex**, **PAC** e **Retirada Local** — possui sua **própria estratégia de cálculo**, tornando o sistema mais **flexível, organizado e fácil de manter**.

## Estrutura do projeto
- **Frete** → Interface base que define o contrato para o cálculo do frete.  
- **FreteSedex** → Implementação concreta da estratégia de cálculo para Sedex.  
- **FretePAC** → Implementação concreta da estratégia de cálculo para PAC.  
- **FreteRetiradaLocal** → Implementação concreta da estratégia para retirada local (frete gratuito).  
- **CalculadoraFrete** → Classe responsável por receber a estratégia e executar o cálculo do frete.  
- **Pedido** → Classe que representa o pedido e utiliza a `CalculadoraFrete` para definir o valor do frete aplicado conforme a estratégia escolhida.

## Funcionamento
- O sistema define uma **interface (`Frete`)** que contém o método de cálculo de frete.  
- Cada tipo de frete implementa essa interface, criando **estratégias específicas** com suas próprias regras de cálculo.  
- A **CalculadoraFrete** recebe a estratégia desejada (por exemplo, `FreteSedex`, `FretePAC` ou `FreteRetiradaLocal`) e executa o cálculo de forma genérica.  
- A classe **Pedido** utiliza a `CalculadoraFrete` para aplicar o valor do frete de acordo com o tipo selecionado.  

## Quando usar Strategy
- Quando existem **várias formas diferentes** de realizar uma mesma operação.  
- Quando deseja **evitar condicionais complexas** (`if/else` ou `switch`) para escolher o comportamento.  
- Quando quer **tornar o sistema mais flexível**, permitindo trocar o algoritmo em tempo de execução.  
- Quando precisa **adicionar novos comportamentos com baixo impacto** no código existente.

## Como usar este projeto
Clone o repositório:

```bash
git clone https://github.com/devjuliomartins/padrao-strategy.git
