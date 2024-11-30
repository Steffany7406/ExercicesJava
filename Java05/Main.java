/* Regra número 1 = A classe principal tem que ter o mesmo nome do arquivo
Regra 2 = Cada variavel deve receber uma tipagem, ou seja, diga se é float, string ou int

println = escreva em linha.
Tem sempre que descrever o tipo de dado

*/ 
public class Main
{
	public static void main(String[] args) {
	    String letra = "10";
	    int Numero = 6;
	    int result = Integer.parseInt(letra) + Numero;
		System.out.println(result);
	}
}