package HashMap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RegistroPessoa implements Serializable {
	Map<Object, String> assinaturas;

	public Map<Object, String> getAssinaturas() {
		return assinaturas;
	}

	public void setAssinaturas(Map<Object, String> assinaturas) {
		this.assinaturas = assinaturas;
	}

	public RegistroPessoa() {
		this.assinaturas = new HashMap<>();
	}

	public void assinar(Object id, String nome) {
		assinaturas.put(id, nome);
	}

	public void listarAssinaturas() {
		Set<Object> s = assinaturas.keySet();

		for (Object id : s) {
			System.out.println("ID: " + id + " Assinatura: " + assinaturas.get(id));
		}
		System.out.println();
	}

	public void totalAssinaturas() {
		System.out.println(assinaturas.size());
	}

	public void salvar(Map<Object, String> assinaturas) {
		try {
			File pasta = new File("C:/ListaPoo16");
			File arquivo = new File("C:/ListaPoo16/RegistroPessoas.dat");

			if (!pasta.exists())
				pasta.mkdir();
			if (!arquivo.exists())
				arquivo.createNewFile();

			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(arquivo));
			os.writeObject(assinaturas);
			os.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void mostrar(Map<Object, String> assinaturas) {

		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/ListaPoo16/RegistroPessoas.dat"));

			assinaturas = (Map<Object, String>) in.readObject();
			System.out.println(assinaturas);
			in.close();

		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
