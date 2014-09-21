Carregamento e Congelamento de Dados

Ferramentas

DBUnit – BDUnit é uma extensão do Junit destinado a projetos com banco de dados, que durantes os testes coloca seu banco de dados em um estado de perigo, devido a quantidade de informações que serão persistidas durantes os periodo de testes. Esta é uma excelente maneira de evitar problemas que podem ocorrer quando os testes corrompe o banco de dados. Tem a capacidade de exportar e importar os dados do banco de dados em arquivo XML. 

Desde a versão 2.0, DbUnit também pode trabalhar com grandes conjuntos de dados quando usado em modo streaming. Ajuda a verificar se os dados do banco de dados corresponde a um conjunto esperado de valores.

Objetivo

Na maioria dos testes de software é necessário uma carga inicial de dados no banco para que o estado dessas tabelas esteja conceitualmente correto.

Após o início dos testes de software a base atual é dificel de ser mantida, devido ao geração de muito “lixo” no banco e a remoção desses dados pode ser complexa. Uma das soluções para esse problema é o BDUnit. 

Utilizando o DBUnit é possível criar essa carga de dados para a execução dos testes. Ao final do teste unitário essa carga será removida do banco, que volta ao estado anterior. 

O ideal é que métodos das classes de testes que porventura alterem o estado da base de dados sejam executados em transação e no final seja feito o rollback.

 Assim, ao final da execução dos testes a base de dados não terá nenhuma alteração.

Vantagens do BDUnit

* Limpeza de registros após testes;
* Comparação direta de registro;
* Retorno de status pós-teste;
* Popular banco antes do teste

Teste de Software – Definição

Teste de software é o processo de execução de um produto para determinar se ele atingiu suas especificações e funcionou corretamente no ambiente para o qual foi projetado. 

O seu objetivo é revelar falhas em um produto, para que as causas dessas falhas sejam identificadas e possam ser corrigidas pela equipe de desenvolvimento antes da entrega final. Por conta dessa característica das atividades de teste, dizemos que sua natureza é “destrutiva”, e não “construtiva”, pois visa ao aumento da confiança de um produto através da exposição de seus problemas. O conceito de teste de software pode ser compreendido através de uma visão intuitiva ou mesmo de uma maneira formal. Existem atualmente várias definições para esse conceito. De uma forma simples, testar um software significa verificar através de uma execução controlada se o seu comportamento corre de acordo com o especificado. O objetivo principal desta tarefa é revelar o número máximo de falhas dispondo do mínimo de esforço, ou seja, mostrar aos que desenvolvem se os resultados estão ou não de acordo com os padrões estabelecidos.


Erros da fase de teste
Segundo FEWSTER o custo para correção de um erro na fase de manutenção é de sessenta a cem vezes maior do que corrigi-lo durante o desenvolvimento [11].

Automação de Testes
Automação de testes não é uma tarefa que 	
trará maior qualidade aos testes. Quando um teste é automatizado, ele terá a mesma 
eficiência em descobrir erros do que quando executado manualmente. Se o teste em 
si não acha nenhum erro, a automação deste teste também não vai achar nada, porém 
de maneira mais rápida.(Graham & Fewster, 1999)

Dificuldades encontradas no testes de software
Existem alguns problemas na fase de automação de testes de software(Cem Kaner, 1997): 
1. Automatizar não é barato
2. Esta abordagem cria riscos de novos custos 
3. Estes testes não são poderosos 
4. Na prática, muitos grupos de teste automatizam apenas os testes simples.

Referências

* FEWSTER, M., GRAHAM D., Software Test Automation, Addison-Wesley, 1999.
* RESSMAN, Roger S. Engenharia de Software, Sexta Edição, McGraw-Hill, 
2006.
*  KANER, Cem. Improving the Maintainability of Automated Test Suites, 1997. 
Disponível em: http://www.kaner.com/lawst1.htm. Acessado em: 25/06/2006.
* NÓBREGA, Rafael Oliveira. Framework para automação de testes funcionais 
utilizando o Rational Functional Tester, 2006. Disponível em: 
http://www.cin.ufpe.br/~tg/2006-1/ron.pdf Acessado em: 21/09/2014.
