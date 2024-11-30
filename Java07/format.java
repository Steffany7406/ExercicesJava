/*Como funciona o fString do Java
No Java, não temos uma funcionalidade exatamente igual às f-strings do Python, mas temos maneiras eficientes de formatar strings. Uma abordagem comum é usar o método String.format(), que permite inserir variáveis dentro de uma string de maneira semelhante às f-strings. Além disso, a classe StringBuilder pode ser usada para construir strings dinamicamente.

Aqui estão alguns exemplos:

Usando String.format()

String nome = "Steffany";
int idade = 28;
String mensagem = String.format("Meu nome é %s e eu tenho %d anos.", nome, idade);
System.out.println(mensagem);

Usando StringBuilder

String nome = "Steffany";
int idade = 28;
StringBuilder mensagem = new StringBuilder();
mensagem.append("Meu nome é ").append(nome).append(" e eu tenho ").append(idade).append(" anos.");
System.out.println(mensagem.toString());

Usando printf
Outra forma comum é usar o método printf do System.out, que funciona de maneira similar ao String.format():

String nome = "Steffany";
int idade = 28;
System.out.printf("Meu nome é %s e eu tenho %d anos.%n", nome, idade);

Todas essas abordagens permitem a formatação de strings com inserção de variáveis de maneira flexível e eficiente.*/