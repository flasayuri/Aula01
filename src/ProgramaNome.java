//Como queremos utilizar o Scanner para ler os dados que o usu�rio vai digitar, e ele n�o � carregado por padr�o, precisamos IMPORTAR o Scanner para que nosso programa "entenda" ele
import java.util.Scanner;

//Esse programa deve receber o nome do usu�rio e exibir este nome com uma mensagem de boas vindas
public class ProgramaNome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A linha abaixo cria um leitor para lermos o teclado do usu�rio. 
		
		Scanner leitor = new Scanner(System.in);
		
		//A linha abaixo cria uma vari�vel (espa�o na RAM) para guardar dados do tipo String.
		
		String nome;
		
		System.out.println("Por favor, digite seu nome:");
		// A linha abaixo pega o texto digitado pelo usu�rio e guarda na vari�vel "nome". ".next" entende que depois do espa�o ele termina. Para lermos textos com espa�o, podemos usar o nextLine: 
		//nome = leitor.nextLine();
		nome = leitor.next();
		
		//Esse c�digo l� um texto do teclado do usu�rio
		System.out.println("Que legal que seu nome � " + nome);
		
		System.out.println(nome + ",fico feliz que voc� esteja usando o meu programa");
		
		//Ap�s terminarmos de usar o leitor, precisamos fechar (REGRA)
		leitor.close();
	}

}
