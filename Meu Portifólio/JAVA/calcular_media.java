
import java.util.Scanner;
public class calcular_media { 
public static void main(String[] args) { 
Scanner ler = new Scanner(System.in);//ler teclado 
double trab,tic,prova,media; 
System.out.println("Tarefa12"); 
do{ 
    System.out.print("Nota de trabalho: ");
    trab=ler.nextDouble(); 
}
while (trab <0 || trab>10); 
do{
    System.out.print("Nota de tic: "); 
    tic=ler.nextDouble(); 
} 
while (tic <0 || tic>10); 
do{ 
    System.out.print("Nota de prova: "); 
    prova=ler.nextDouble(); 
} 
while (prova <0 || prova>10);
media=(trab+tic+prova)/3;
if(media>=6){ 
    System.out.print("Aprovado"); 
}
else
{ 
    System.out.print("Reprovado"); 
} 
}
}
