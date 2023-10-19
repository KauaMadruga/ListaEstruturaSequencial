import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int soma;
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();
        soma = (n1 + n2);
        System.out.println("A soma de "+n1+" com "+n2+" é igual a "+soma);
        sc.close();
    }
}
