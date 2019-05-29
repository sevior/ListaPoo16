package TreeSet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

public class RegistroPessoa implements Serializable {
	Set<String> assinaturas;

	public Set<String> getAssinaturas() {
		return assinaturas;
	}

	public void setAssinatuas(Set<String> assinaturas) {
		this.assinaturas = assinaturas;
	}

	public RegistroPessoa() {

		this.assinaturas = new TreeSet<>();
	}

	public void assinar(String nome) {
		assinaturas.add(nome);
	}

	public void listar() {	
		for (String assinatura : assinaturas) {
			System.out.println(assinatura);
		}
		System.out.println();
	}

	public void totalAssinaturas() {
		System.out.println(assinaturas.size());
	}

	public void salvar(Set<String> assinaturas) {
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

	public void mostrar(Set<String> assinaturas) {

		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/ListaPoo16/RegistroPessoas.dat"));

			assinaturas = (Set<String>) in.readObject();
			System.out.println(assinaturas);
			in.close();

		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
