package ArrayList;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		RegistoPessoas r = new RegistoPessoas();
		int n ;
		boolean w = true;

		while (w) {
			System.out.println("Escolha uma opção: " + "\n1 - Assinar livro " + "\n2 - Listar Assinaturas "
					+ "\n3 - Encerrar Programa");
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
				r.listarAssinaturas();
				break;
			case 3:
				System.out.println("Programa encerrado!");
				w = false;
				break;
			default:
				System.out.println("Opção invalida!");
				break;
			}
			System.out.print("Total de assinaturas: ");
			r.getTotal();
			System.out.println();

		}
	}

}
