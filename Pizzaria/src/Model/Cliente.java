package Model;

import java.util.ArrayList;
import java.util.Collection;

public class Cliente {

	private String nome;
	private String telefone;
	private String endereco;
	
	public Cliente(String nome, String telefonem, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public Cliente(String telefone) {
		this.telefone = telefone;
		this.nome = null;
		this.endereco = endereco;
	}
	
	public String getValueString() {
		return new StringBuilder().append("'").append(this.telefone).append("','").append(this.nome).append("','").append(this.endereco).append("'").toString();
		
	}
	public String getEndereco() {
		return this.endereco;
	}
	public Collection<String>getValueCollection() {
		Collection<String> fields = new ArrayList<String>();
		fields.add(this.telefone);
		fields.add(this.nome);
		fields.add(this.endereco);
		
		return fields;
	}
	
	public String toString () {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: ").append(this.nome).append("\n");
		sb.append("Endereco").append(this.endereco);
		return sb.toString();
	}
}


