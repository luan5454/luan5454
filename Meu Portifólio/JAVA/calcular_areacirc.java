import java. lang. Math;
import java.util.Scanner;

public class calcular_areacirc {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);//ler teclado
        double r,a;
        System.out.println("Calculo da Area");
        System.out.println("----------------\n");
        System.out.print("Digite o valor do raio:");
        r=ler.nextFloat();
        a = Math.PI *Math.pow(r,2);
        System.out.print("Area:"+a);
    }
}