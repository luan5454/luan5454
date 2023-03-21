package menu1;
import java.util.Random;
import java.util.Scanner;
public class Menu1 {
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);  
        int op; //variavel para o menu
        int num,c,r; //variaveis para a tabuada 
        double vtemp, ctemp; //variaveis para converso de temperatura
        int[] valor =new int[10]; //variaveis para bubblesort
        int i, aux, fim; //variaveis para bubblesort
        Random rand = new Random();
        
        do
        {
            System.out.println("\n\nMenu:");
            System.out.println("----------");
            System.out.println("1 - Tabuada");
            System.out.println("2 - Conversao Temperatura");
            System.out.println("3 - BubbleSort");
            System.out.println("4 - Sair");
            do{
            System.out.print("Opcao: ");
            op=ler.nextInt();
            if(op<1 || op>4)
               System.out.println("Opcao invalida, redigite...");
            }
            while(op<1 || op>4);
            switch(op)
            {            
                case 1:
                    System.out.println("\nTabuada\n");
                    System.out.print("Digite um numero: ");
                    num = ler.nextInt();
                    for(c=1;c<=10;c++)
                    {
                        r=num*c;
                        System.out.print("\n" +num+ " X " +c+ " = " +r);
                    }
                    break;
                case 2:
                    System.out.println("\nConversao de Temperatura");
                    System.out.print("Digite a temperatura em Celsius: ");
                    vtemp = ler.nextDouble();
                    ctemp = vtemp + 273;
                    System.out.printf("%.3f Celsius ==> %.3f Kelvin", vtemp, ctemp);
                    ctemp = vtemp * 1.8 + 32;
                    System.out.printf("\n%.3f Celsius ==> %.3f Fahreinheit", vtemp, ctemp);
                    break;
                case 3:
                    System.out.println("\nBubbleSoft:\n");
                    for(i=0;i<10;i++)
                    {
                        valor[i]=rand.nextInt(100)+1;
                        System.out.print(valor[i]+" ");
                    }
                   for(fim=8;fim>=0;fim--)
                       for(i=0;i<=fim;i++)
                       {
                           if(valor[i]>valor[i+1])
                           {
                                   aux=valor[i];
                                   valor[i]=valor[i+1];
                                   valor[i+1]=aux;
                           }
                       }
                   System.out.println("\nValores Ordenados: ");
                     for(i=0;i<10;i++)
                     {
                         System.out.print(valor[i]+" ");
                     }
                    break;       
            }       
          }
        while(op!=4);
   }
}
   