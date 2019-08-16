package br.ufrpe.bsi.mpoo;

public class Application {
	public static void main(String[] args) {
		String helloWorld="Hello World";
		System.out.println(helloWorld);
		
		String helloWorld1="Hello World 2";
		System.out.println(helloWorld1);
		
		int dois=2;
		System.out.println(dois);
		
		HelloWorld hello=new HelloWorld();
		hello.setNome("Evelyn");
		hello.imprimir();
		
		HelloWorld hello2=new HelloWorld();
		hello2.setNome("Gabriel");
		hello2.imprimir();
	}
	

	
}
