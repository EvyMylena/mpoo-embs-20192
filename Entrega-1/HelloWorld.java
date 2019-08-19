import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {
	private String nome;
	public void setName(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return nome;
	}
	public void imprimir() {
		System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date())+" - "+"Olá " + this.getNome()+". Você acabou de fazer seu primeiro Hello World em Java. Parabéns.");
	}
		

}
