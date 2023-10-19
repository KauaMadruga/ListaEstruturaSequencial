import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, C, a, b, c, d, e;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        a = (A*C) / 2;
        b = Math.PI*Math.pow(C,2);
        c = ((A+B)*C) / 2;
        d = Math.pow(B, 2);
        e = A*B;

        System.out.printf("Triângulo Retângulo: %.3f\nÁrea do Círculo: %.3f\nÁrea do Trapézio: %.3f\nÁrea do Quadrado: %.3f \nÁrea do Retângulo: %.3f", a, b, c, d, e);

        sc.close();
    }
}
