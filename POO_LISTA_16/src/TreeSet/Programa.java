package TreeSet;

import java.io.IOException;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		RegistroPessoa r = new RegistroPessoa();
		int n;
		boolean w = true;

		while (w) {
			System.out.println("Escolha uma opção: " + "\n1 - Assinar livro " + "\n2 - Listar Assinaturas "
					+ "\n3 - Salvar Assinaturas" + "\n4 - Listar Assinaturas salvas" + "\n5 - Encerrar Programa");
			n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("Digite sua assinatura: ");
				sc.nextLine();
				String nomeCompleto = sc.nextLine();
				r.assinar(nomeCompleto);
				break;
			case 2:
				System.out.println("Assinaturas: ");
				r.listar();
				break;
			case 3:
				r.salvar(r.getAssinaturas());
				break;
			case 4:
				r.mostrar(r.getAssinaturas());
				break;
			case 5:
				System.out.println("Programa encerrado!");
				w = false;
				break;
			default:
				System.out.println("Opção invalida!");
				break;
			}
			System.out.print("Total de assinaturas: ");
			r.totalAssinaturas();

			System.out.println();

		}

	}

}
