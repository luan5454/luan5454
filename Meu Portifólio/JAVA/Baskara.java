import java.util.Scanner;

public class baskara {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);//ler teclado
        double x1,x2,b,delta,a,c;
        System.out.println("Calculo da Area");
        System.out.println("---------------");
        System.out.println("digite A:");
        a=ler.nextDouble();
        System.out.println("digite B:");
        b=ler.nextDouble();
        System.out.println("digite C:");
        c=ler.nextDouble();
        delta = ( b*b ) - ( 4*a*c );
        if ( delta > 0 ){
            x1 = ( b * -1 ) + Math.sqrt( delta ) / 2*a;
            x2 = ( b * -1 ) - Math.sqrt( delta ) / 2*a;
            System.out.println("X1="+x2);
            System.out.println("X2="+x1);
        }
        else{
        System.out.println("Não existem Raízes Reais");
        }
    }
}    