package meuprojeto;

public class Application {
	public static void main(String[] args) {
		//Imprimindo a pessoa e o seu telefone
		Pessoa pessoa = new Pessoa();
		Telefone telefone=new Telefone();
		pessoa.setTelefone(telefone);
		pessoa.setNome("Evelyn");
		telefone.setDdd(81);
		telefone.setNumero(999999);
		telefone.setTipo(TipoTelefone.CELULAR);
		imprimirPessoa(pessoa);
	}

	private static void imprimirPessoa(Pessoa pessoa) {
		String nome = pessoa.getNome();
		int ddd = pessoa.getTelefone().getDdd();
		int numero = pessoa.getTelefone().getNumero();
		System.out.println(nome + " (" + ddd+ ") " + numero + " - "+ pessoa.getTelefone().getTipo().getDescricao());
	}
}
