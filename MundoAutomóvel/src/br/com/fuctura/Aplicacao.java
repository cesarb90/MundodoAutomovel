package br.com.fuctura;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.fuctura.eu.Loja;

public class Aplicacao {

	public static void main(String[] args) {
		ArrayList<Carro> carros = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		Carro obj = new Carro();
		int opcao;
		Pessoa Cesar = new Pessoa("Cesar", "1232141234", "123213123");
		Pessoa Charles = new Pessoa ("Charles", "512224123", "213124123");
		Pessoa Mario = new Pessoa("Mario", "6341233123", "1251231265");
		Carro um = new Carro("PCF0878", "Renault", "Sandero", 2016, 42.000f,Cesar);
		Carro dois = new Carro("HFG0001", "TOYOTA", "SUBARU", 2017, 80.000f, Cesar);
		Carro tres = new Carro("KHP8063", "VOLKWAGEN", "GOL", 2005, 12.000F, Mario);
		carros.add(um);
		carros.add(dois);
		carros.add(tres);
		Loja loja = new Loja("Seminovos Charles", (carros.size()), Charles);
		
		
		
		System.out.println("+====================================+\n" + "+== Escolha uma Operação ============+\n"
				+ "+====================================+\n" + "+ 1 - Cadastrar Carro na Loja        +\n"
				+ "+ 2 - Pesquisar Carros(Placa)        +\n" + "+ 3 - Pesquisar Carros (Marca/Modelo)+\n"
				+ "+ 4 - Pesquisar Carros (Ano)         +\n" + "+ 5 - Listagem de todos os Carros    +\n"
				+ "+ 6 - Informações da Loja            +\n" + "+ 7 - Finalizar                      +\n"
				+ "+====================================+");
		System.out.print("Opção = ");
		opcao = scan.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("cadastrando um carro");
		 		System.out.println("informe a Placa: ");
		 		obj.setMarca(scan.next());
		 		System.out.println("informe a Marca: ");
		 		obj.setMarca(scan.next());
		 		System.out.println("informe o Modelo: ");
		 		obj.setModelo(scan.next());
		 		System.out.println("informe o Ano: ");
		 		obj.setAno(scan.nextInt());
		 		System.out.println("informe o Valor do Carro: ");
		 		obj.setValorAproximado(scan.nextFloat());
//		 		System.out.println("informe o nome do dono: ");
//		 		obj.setDono(scan.next());
		 		carros.add(obj);
		 		System.out.println(carros);
		 		
		 		break;
		case 2: System.out.println("informe a placa do carro que está buscando: ");
		String a;
		a = scan.next();
		System.out.println(carros.contains(a));
			break;
		case 3:
			System.out.println("informe o modelo do carro que está buscando: ");
			
			break;
		case 4:

			break;
		case 5:
			for (Carro carro : carros) {
				System.out.print(carro + "\n");
			}
			break;
		case 6: System.out.println(loja);

			break;

		default: System.out.println("Volte sempre!!");
			break;
		}

	}

}
