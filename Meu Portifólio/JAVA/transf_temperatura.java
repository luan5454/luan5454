import java.util.Scanner;

public class transf_temperatura{ 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        int op;
        double f,c,k;
        do{
            System.out.println("-----------------\n");
            System.out.println("MENU");
            System.out.println("1-C para F");
            System.out.println("2-C para K");
            System.out.println("3-K para C");
            System.out.println("4-K para F");
            System.out.println("5-F para C");
            System.out.println("6-F para K");
            op=ler.nextInt();
            switch(op){ 
            case 1:
                System.out.print("Digite o valor do graus celsius: ");
                c = ler.nextDouble();
                f=1.8*c+32;
                System.out.println("O valor do graus fahrenheit: " +f);
             break;
            case 2:
                System.out.print("Digite o valor do graus celsius: ");
                c= ler.nextDouble();
                k=c+273;
                System.out.println("O valor do graus Kelvin: " +k);
            break;
            case 3:
                System.out.print("Digite o valor do graus kelvin: ");
                c= ler.nextDouble();
                k=c+273;
                System.out.println("O valor do graus Celsius: " +c);
            break;
            case 4:
                System.out.print("Digite o valor do graus Kelvin: ");
                k = ler.nextDouble();
                f=(k-273.15)*1.8000+32;
                System.out.println("O valor do graus fahrenheit: " +f);
            break;
            case 5:
                System.out.print("Digite o valor do graus fahrenheit: ");
                f = ler.nextDouble();
                c = (f -32.0) * ( 5.0 /9.0 );
                System.out.println("O valor do graus celsius: " +c);
            break;
            case 6:
                System.out.print("Digite o valor do graus fahrenheit: ");
                f = ler.nextDouble();
                k = 273.5+((f-32.0)*(5.0/9.0));
                System.out.println("O valor do graus kelvin: " +k);
            break;
            }
        }
        while(op!=6);
    }
}