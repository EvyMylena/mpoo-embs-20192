package meuprojeto;

public enum TipoTelefone {
	RESIDENCIAL("Residencial"), CELULAR("Celular");
	private String descricao;
	TipoTelefone(String descricao) {
		this.descricao = descricao; 
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
