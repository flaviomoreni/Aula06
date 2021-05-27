import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int quantidadeAlunos = 0;
		double totalConsumo = 0; // ZERANDO
		
		System.out.println("Digite a quantidade de alunos na turma:");
		quantidadeAlunos = leitor.nextInt();

		double[] valores = new double[quantidadeAlunos];
		for ( int i = 0; i < quantidadeAlunos; i++ ) {
			System.out.println("Por favor, digite o consumo do " + ( i + 1 ) +  "º aluno");
			valores[i] =  leitor.nextDouble();
			totalConsumo = totalConsumo + valores[i];
		}

		System.out.println(" ****** Total: R$ " + totalConsumo );
		for (int i = 0; i < valores.length; i++) {
			
			double valorAtual = valores[i];
			
			for ( int x = 0; x < valores.length; x++ ) {
				if ( (x != i) || (i > 0) ) {
					if ( valorAtual == valores[x] ) {
						System.out.println("Valor repetido");
						break;
					} 
				}
			}
			
			
			/*
			if ( valores[i] >= 10 ) {
				System.out.println("O consumo do aluno " + ( i + 1 ) + " foi de R$" + valores[i]);
			}
			*/
			
			
			
		}
		
		
		/*
		 * 
		 * 
				String[] nomes = {"Flavio","Jeff","Elias"};
		for (String n : nomes) {
			System.out.println(n);
		}

		
		int contador = 0;
		while ( contador < valores.length ) {
			System.out.println(
					"O consumo do aluno " + ( contador + 1 ) + 
					" foi de R$" + valores[ contador ]);
			contador = contador + 1;
		}
		*/
		
		
		
		/*
		
		*/
		
		leitor.close();
	}

}
