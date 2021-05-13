//Como queremos utilizar o Scanner para ler os dados que o usuário vai digitar, e ele não é carregado por padrão, precisamos IMPORTAR o Scanner para que nosso programa "entenda" ele
import java.util.Scanner;

//Esse programa deve receber o nome do usuário e exibir este nome com uma mensagem de boas vindas
public class ProgramaNome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A linha abaixo cria um leitor para lermos o teclado do usuário. 
		
		Scanner leitor = new Scanner(System.in);
		
		//A linha abaixo cria uma variável (espaço na RAM) para guardar dados do tipo String.
		
		String nome;
		
		System.out.println("Por favor, digite seu nome:");
		// A linha abaixo pega o texto digitado pelo usuário e guarda na variável "nome". ".next" entende que depois do espaço ele termina. Para lermos textos com espaço, podemos usar o nextLine: 
		//nome = leitor.nextLine();
		nome = leitor.next();
		
		//Esse código lê um texto do teclado do usuário
		System.out.println("Que legal que seu nome é " + nome);
		
		System.out.println(nome + ",fico feliz que você esteja usando o meu programa");
		
		//Após terminarmos de usar o leitor, precisamos fechar (REGRA)
		leitor.close();
	}

}
