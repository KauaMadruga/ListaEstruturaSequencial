import java.text.DecimalFormat;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int cod1, quant1, cod2, quant2;
        double valor1, valor2, total;

        //Informações do Produto 1
        cod1 = sc.nextInt();
        quant1 = sc.nextInt();
        valor1 = sc.nextDouble();

        //Informações do Produto 2
        cod2 = sc.nextInt();
        quant2 = sc.nextInt();
        valor2 = sc.nextDouble();

        total = quant1*valor1 + quant2*valor2;
        System.out.println("O valor total das compras foi de "+df.format(total));

        sc.close();
    }
}
