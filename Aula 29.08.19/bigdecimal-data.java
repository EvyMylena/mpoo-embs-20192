package mpoo.aula5;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Application {
	public static void main(String[] args) {
//		problemaDouble();
//		problemaString();
//		formatarOutput();
		formatarParseData();
//		contasComData();
//		problemaNullpointer();
//		usandoVarargs();
		
	}

	private static void usandoVarargs() {
		String[] palavras = new String[] {
				"a","b","c","d"
		};
		imprimir("Imprimindo Palavras por array:",palavras);
		imprimir("Imprimindo Palavras por varargs:","a","b","c");
	}

	@SuppressWarnings("null")
	private static void problemaNullpointer() {
		Object s = new Object();
		System.out.println(s);
		System.out.println(s.toString());
		s = null;
		System.out.println(s);
		System.out.println(s.toString());
	}

	private static void imprimir(String titulo, String... palavras) {
		System.out.println(titulo);
		for (Object palavra : palavras) {
			System.out.print(palavra);
			System.out.print(" ");
		}
		System.out.println();
	}

	private static void contasComData() {
		Calendar cal = Calendar.getInstance();
		Date now = cal.getTime();
		int dia = cal.get(Calendar.DAY_OF_MONTH);
		int mes = cal.get(Calendar.MONTH)+1;
		int ano = cal.get(Calendar.YEAR);
		int hora = cal.get(Calendar.HOUR_OF_DAY);
		int minuto = cal.get(Calendar.MINUTE);
		int segundo = cal.get(Calendar.SECOND);
		System.out.println(dia + "/" + mes + "/" + ano 
				+ " " + hora + ":" + minuto + ":" + segundo);
		
		System.out.println(cal);
		System.out.println(now);
		cal.add(Calendar.HOUR_OF_DAY, 2);
		cal.add(Calendar.MINUTE, 2);
		cal.add(Calendar.DAY_OF_MONTH, -1399);
		System.out.println(cal.getTime());
	}

	private static void formatarParseData() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
		Date data = new Date();
		String dataFormatada = sdf.format(data);
		System.out.println(dataFormatada);
		Date data2;
		try {
			data2 = sdf.parse("31/12/2019 08:00:00 AM");
			System.out.println(data2);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		try {
			Date data3 = sdf.parse("31/02/2019 13:00:00 PM");
			System.out.println(data3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void formatarOutput() {
		String nome = "Gabriel";
		System.out.println("Ol� "+nome+", bem vindo babalalbla");
		System.out.printf("Ol� %s, bem vindo babalalbla\n",nome);
		System.out.printf("%s %s %1$s\n", "a", "b");
		System.out.printf("%+f %f %f %1$f %2$.2f\n", 1.000, 2.575, -1.1);
		System.out.printf("%1$te/%1$tm/%1$tY\n", new Date());
		System.out.printf("%1$te de %1$tB de %1$tY\n", new Date());
	}

	private static void problemaString() {
		int MAX = 10000;
		concatenarStringBuilder(MAX);
		concatenarString(MAX);
	}

	private static void concatenarStringBuilder(int MAX) {
		long t0sb = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < MAX; i++) {
			sb.append(i);
		}
		long t1sb = System.currentTimeMillis();
		long tStringBuilder = (t1sb - t0sb);
		System.out.println("Tempo concat StringBuilder (ms): " + tStringBuilder);
	}

	private static void concatenarString(int MAX) {
		long t0 = System.currentTimeMillis();
		@SuppressWarnings("unused")
		String s = "";
		for (int i = 0; i < MAX; i++) {
			s += i;
		}
		long t1 = System.currentTimeMillis();
		long tString = (t1 - t0);
		System.out.println("Tempo concat String (ms): " + tString);
	}

	private static void problemaDouble() {
		double x = 0.1 + 0.2;
		System.out.println(x);

		float x1 = (float) (0.1 + 0.2);
		System.out.println(x1);

		System.out.println("Float");
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println("Double");
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);

		BigDecimal v1a = new BigDecimal(0.1);
		BigDecimal v2a = new BigDecimal(0.2);
		BigDecimal v3a = v1a.add(v2a);
		System.out.println(v3a);

		BigDecimal v1b = new BigDecimal("0.1");
		BigDecimal v2b = new BigDecimal("0.2");
		BigDecimal v3b = v1b.add(v2b);
		System.out.println(v3b);
	}
}
