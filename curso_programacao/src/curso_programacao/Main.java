package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String name = "William";
		int age = 19;
		double salary = 800;
		int y = 32;
		double x = 10.35784;
		System.out.println("Olá mundo!");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		System.out.printf("Resultado = %.2f em metros\n", x);
		System.out.printf("%s tem %d e ganha %.2f reais", name, age, salary);
	}

}
