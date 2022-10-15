1. Baseado no Scrum Guide, qual o tempo máximo deveriam ter as seguintes
   cerimônias:

    a. Daily: 15 minutos.

    b. Planning: oito horas para uma
    Sprint de um mês de duração.

    c. Review: quatro horas para uma Sprint de um mês.

    d. Retrospectiva: três horas para
    uma Sprint de um mês.

<br><br>

2. Para que serve e como funciona o Framework Scrum?

 <p>O Scrum foi criado por Jeff Sutherland e o Ken Schwaber na década de 90, é um framework de fácil entendimento para ajudar os times a encontrar soluções simples para problemas complexos. O scrum é fundamentado sobre a interação coletiva dos colaboradores que compõem o time, ou seja, o scrum possui um alto grau de dinamismo, tendo um melhor controle dos riscos. Para o sucesso dessa metodologia ágil, o time precisa do uso de 5 valores, são eles: Compromisso, Foco, Abertura, Respeito e Coragem.</p>
 <p>O Scrum Team é um time de pessoas como dito acima, ele é composto a partir da inteligência coletiva, cada membro do time tem suas funções, são elas Developers, Product Owner e Scrum Master. Os Developers tem o compromisso de agregar a cada Sprint, criar o plano para o Sprint e pro Backlog. O Product Owner tem a responsabilidade de fazer o gerenciamento do Product Backlog com a finalidade de maximizar os resultados. Por fim o Scrum Master, basicamente tem a maior responsabilidade, já que ele é encarregado da eficácia do Scrum Team.
 <p>O funcionamento do Scrum é composto por Eventos, são eles: Sprint que é considerado o ‘coração’ do scrum, basicamente é um ciclo de trabalho que possui um tempo predefinido para ser concluído, ao final dele é necessário que o produto tenha tido um incremento notável aos olhos do cliente. Sprint Planning trata-se de uma reunião de planejamento, onde é definida as prioridades do Product Backlog. Daily Scrum é uma reunião de 15 minutos com o objetivo de melhorar a comunicação, identificar os impedimentos para concluir alguma tarefa, tomada de decisão, diminuindo a necessidade de reuniões desnecessárias. Sprint Review é uma reunião que revisa o que ocorreu ao final de cada Sprint, nela estão presentes o Scrum Team e o cliente, tendo um feedback da Sprint. Sprint Retrospective tem o objetivo de revisar com o Scrum Team tudo o que foi feito de forma correta ou errado na Sprint, buscando melhoria e análise do trabalho.

<br><br>

3. José iniciou sua jornada recentemente com git e não está conseguindo
   publicar seu arquivo README e a classe Product.js que acabou de criar. O
   erro do git dá a seguinte informação:

Untracked Files:

README

Product.js

Por que esse “erro” de “Untracked files” ocorreu e qual comando resolveria
o problema?

Esse problema aconteceu porque esses arquivos não foram versionados pelo Git, o comando "git add "nome do arquivo" fazendo um arquivo por vez ou "git add .", para adicionar todos os arquivos no repositorio, eliminando esses erros.

<br><br>

4. O time de desenvolvimento analisou e descobriu que o projeto está gerando arquivos pesados e desnecessários para serem commitados no repositório git. Em qual arquivo você deve incluir a lista de extensões para que esses arquivos desnecessários sejam desconsiderados?

Será criado um arquivo chamado ".gitignore" que fará o rastreio desses arquivos, nele será contido os arquivos idesejáveis, por exemplo ".idea/workspace.xml" que são arquivos de configurações pessoais da IDE.

<br><br>

5. José foi promovido de seu cargo anterior e se tornou o novo Product Owner do time, quais são suas novas responsabilidades como PO?

Ele se tornará responsável pela transparência e compreensão do Product Backlog, maximizar o valor do produto de acordo com o trabalho do Scrum Team, gerenciamento do Product Backlog é outra atividade fundamental,  domínio sobre os itens do Product Backlog, podendo delegar essas tarefas para outros membros, mas mantendo sua responsabilidade sobre o Product Backlog.

<br><br>

6. Escreva um programa Java que tem como objetivo ser um quiz de
   perguntas e respostas. Na tela, você perguntará ao usuário e ele
   responderá. Se o usuário acertar ou errar, você precisa informar se ele
   acertou ou errou e passar para próxima pergunta (enquanto houver
   próxima). Utilizem array para guardar as perguntas e respostas. Na tela
   perguntará ao usuário o nome, e por vez assim as perguntas, caso o
   usuário acerte ele demonstre os erros e acertos (como no exemplo abaixo):
   Usuário XPTO:
   Acertos: 6
   Erros:4

O programa foi construído para funcionar como um quiz convencional, consiste em 3 perguntas bem simples, existem 2 jogadores dentro do sistemas, são eles: magno e marcelo, você pode utilizar a matricula de um deles para poder jogar com esse dois usuários, como também a liberdade de criar um usuário seu, basta colocar uma matricula diferente das que estão cadastradas e o sistema pedirá seu nome antes de iniciar o quiz, existirá 3 opções no jogo, a opção de Jogar, Ver Resultados e Sair, seguindo o layout especificado, espero que vocês se divirtam!!

<br><br>

7. Escreva um programa em Java que tem como objetivo validar se um
   usuário e senha existem no sistema. Se o usuário e senha tiver corretos, o
   usuário deverá receber uma mensagem de acordo com o horário. (Utilizem
   arrays para armazenar os dados)
   • Se for das 6h às 11h59 da manhã, receberá “Bom dia, você se
   logou ao nosso sistema.”
   • Se for das 12 às 17h59 da tarde, receberá “Boa tarde, você se
   logou ao nosso sistema.”
   • Se for das 18h às 23h59 da noite, receberá “Boa noite, você se
   logou ao nosso sistema.”
   • Se for das 0h às 05h59 da madrugada, receberá “Boa madrugada,
   você se logou ao nosso sistema.”
   • Se o usuário ou senha for inválidos, deverá exibir a mensagem:
   “Usuário e/ou senha incorretos.”
 
O programa foi criado para validar um usuario e senha, utilizei o cpf como identificador, o programa terá dois usuários já cadastrados, podendo criar outros e logar neles, espero que gostem!! :)

<bre><br>

8. Escreva um programa Java que tem como objetivo validar se um
   determinado funcionário tem direito a bonificação. O programa precisa
   receber a quantidade de funcionários que serão cadastrados e após isso, o
   programa deve armazenar o nome e o salário de cada funcionário. Se o
   usuário receber até R$ 1000,00 reais, receberá 20% de bonificação. Se
   receber acima de 1000 e menos que 2000, recebe 10%. Se for acima de
   2000, em vez de bonificação, o funcionário terá um desconto de 10%. No
   fim do programa, deverá ter uma saída com os nomes dos funcionários,
   salário, bônus ou desconto e salário líquido. (Utilizem arrays para
   armazenar os dados.)
<br>
   Exemplo:
   <p>• Funcionário XPTO
   <p>• Salário: 1200,00
   <p>• Bônus: 120,00
   <p>• Salário Líquido: 1320,00
   <p>• Funcionário XYZ
   <p>• Salário: 3000,00
   <p>• Desconto: 300,00
   <p>• Salário Líquido: 2700,00
   <p>• Funcionário ABC
   <p>• Salário: 700,00
   <p>• Bônus: 140,00
   <p>• Salário Líquido: 840,00

Além de desnevolver esse programa eu me desafiei, passei algum tempo estudando e testando a class BigDecimal, já tinha ouvindo professores dizendo que ela é ideal para trabalhar com valores. O Programa consiste em um sistema de cadastro, onde o usuário cadastra funcionários, entrando com seu nome e salário, depois o programa fará um calculo onde aplicar uma bonificação ou um desconto desse usuário conforme o especificado