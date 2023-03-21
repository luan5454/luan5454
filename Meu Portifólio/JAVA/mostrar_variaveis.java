import java.util.Scanner;

public class mostrar_variaveis {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);//ler teclado
        String nome;
        int idade,dia,mes,ano;
        System.out.println("Intranet");
        System.out.println("----------------\n");
        System.out.print("Nome:");
        nome=ler.nextLine();
        System.out.print("Idade:");
        idade=ler.nextInt();
        System.out.print("Dia do nascimento:");
        dia=ler.nextInt();
        System.out.print("Mes do nascimento:");
        mes=ler.nextInt();
        System.out.print("Ano do nascimento:");
        ano=ler.nextInt();
        System.out.println("Data Nascimento:"+dia+"/"+mes+"/"+ano);
        System.out.println("Idade:"+idade);
        System.out.println("Nome:"+nome);
    }
}