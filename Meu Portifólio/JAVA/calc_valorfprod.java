import java.util.Scanner;

public class calc_valorfprod {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);//ler teclado
        double fab=42.0/100.0,luc=25.0/100.0,prod,vlf;
        System.out.println("Calculo da Area");
        System.out.println("----------------\n");
        System.out.print("Digite o valor do produto:");
        prod=ler.nextDouble();
        vlf= (fab*prod)+(luc*prod)+prod;
        System.out.print("Valor Final do produto:"+vlf);
    }
}