package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ProcessamentoDeDados {
    public static void main(String[] args) {
        int x;
        x = 5;
//        y = 2 * x;
        System.out.println(x);
//        System.out.println(y);
        double y = 2 * x;
        System.out.println(y);

        double biggestBase = 8;
        double smallestBase = 6;
        double height = 5;
        double trapezoidArea = (biggestBase + smallestBase) * height / 2;
        System.out.println(trapezoidArea);
        int a = 5;
        int b = 2;

        double result = (double) a / b;
        System.out.println(result);

    }

    public static class EntradaDeDados1 {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            String x = sc.next();
            System.out.println("Você digitou: " + x);
            int y = sc.nextInt();
            System.out.println("Você digitou: " + y);
            double z = sc.nextDouble();
            System.out.printf("Voce digitou: %.2f\n", z);
            char w = sc.next().charAt(0);
            System.out.println(w);
            String t = sc.next();
            int a = sc.nextInt();
            double v = sc.nextDouble();
            System.out.printf("Dados digitados %s / %d / %.1f", t,a,v);
            sc.close();

        }
    }
}
