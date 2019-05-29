package ArrayList;
import java.util.ArrayList;

public class RegistoPessoas {
	private ArrayList<String> lista;

	public ArrayList<String> getLista() {
		return lista;
	}

	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}

	public RegistoPessoas() {

		this.lista = new ArrayList<>();
	}

	public void assinar(String nomeCompleto) {
		lista.add(nomeCompleto);
	}

	public void listarAssinaturas() {
		for (String assinatura : lista) {
			System.out.println(assinatura);
		}
		System.out.println();

	}

	public void getTotal() {
		System.out.println(lista.size());
	}

}
