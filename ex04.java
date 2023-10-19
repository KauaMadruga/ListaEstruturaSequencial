import java.text.DecimalFormat;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int code, h;
        double vh, salario;

        System.out.println("Digite seu código, horas trabalhadas e o valor que recebe por hora ");
        code = sc.nextInt();

        h = sc.nextInt();

        vh = sc.nextDouble();

        salario = h*vh;

        System.out.println("Código: "+code+"\nSalário: "+df.format(salario));
        sc.close();
    }
}
