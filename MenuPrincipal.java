package atividade03;
import java.util.Scanner;

public class MenuPrincipal {
	public static Scanner scan;

	public static void menu(){
		System.out.println("= = = = Bem-vindo ao EconomizaP2 = = = =");
		String opcao = "";
		
		do {
			System.out.println("Digite a opcão desejada: " + System.lineSeparator() +
					" " + System.lineSeparator() +
					"1 - Cadastrar um Produto" + System.lineSeparator() +
					"2 - Vender um Produto" + System.lineSeparator() +
					"3 - Imprimir Balanço" + System.lineSeparator() +
					"4 - Sair");
			
			scan = new Scanner(System.in);

			opcao = scan.next();

			switch (opcao) {
			case "1":
				Lojao.cadastrarProdutoNoSuperMercado();
				break;
			case "2":
				
				break;
			case "3":
	
				break;
			case "4":
				System.out.println("Obrigado");
				break;
			default:
				
				System.out.println("Comando invalido");
				break;
			}
		} while (!opcao.equals("4"));


	}

}
