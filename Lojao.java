package atividade03;

import java.util.Scanner;

public class Lojao {

	public static void main(String[] args) {
		MenuPrincipal.menu();
		

	}
	public static void cadastrarProdutoNoSuperMercado(){
		String deseja = "";
		
		do{
			Scanner scan = new Scanner(System.in);
			System.out.println("= = = = Cadastro de Produtos = = = =");
			
			System.out.println("Digite o nome do produto: ");
			String nomeProduto = scan.next();
			
			System.out.println("Digite o preço unitário do produto: ");
			double precoUnitario = scan.nextDouble();
			
			System.out.println("Digite o tipo do produto: ");
			String tipoProduto = scan.next();
			
			System.out.println("Digite a quantidade no estoque: ");
			int quantidadeProduto = scan.nextInt();
			
			System.out.println(" ");
		
			System.out.println("Deseja cadastrar outro produto?"+ System.lineSeparator() +
					"[Sim] ou [Nao]");
			deseja = scan.next();
		
		}while(!deseja.equals("Nao"));
		
	}
}

