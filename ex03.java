import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D, diff;
        System.out.println("Digite quatro valores inteiros separados por espaços ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        diff = A*B - C*D;

        System.out.println("A diferença dos produtos é de "+diff);
        sc.close();
    }
}
