import java.text.DecimalFormat;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio, area;

        System.out.println("Digite o valor do raio do círculo ");
        raio = sc.nextDouble();

        area = Math.PI*Math.pow(raio, 2);

        DecimalFormat df = new DecimalFormat(".0000");

        System.out.println("A área do círculo é de "+ df.format(area));
        sc.close();
    }
}
