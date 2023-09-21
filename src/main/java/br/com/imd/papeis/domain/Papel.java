package br.com.imd.papeis.domain;

import java.util.Objects;

import jakarta.persistence.Entity;

@Entity
public class Papel extends AbstractEntity {

	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public int hashCode() {
		return Objects.hash(descricao, getId());
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Papel other = (Papel) obj;
		return Objects.equals(descricao, other.descricao) && getId() == other.getId();
	}
	
}
