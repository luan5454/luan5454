import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        float peso,altura;
 
        System.out.print("Informe seu peso: ");
        peso=ler.nextFloat();
        System.out.print("Informe sua altura: ");
        altura=ler.nextFloat(); 
 
        double imc = peso / Math.pow(altura, 2);
        System.out.println("Seu IMC é: " + imc);
 
 
        if(imc < 17){
            System.out.println("Sua classificação é Muito abaixo do peso"); 
        }
        else if((imc >= 17) && (imc < 17.49)){
            System.out.println("Sua classificação é Abaixo do peso"); 
        }
        else if((imc >= 17.50) && (imc < 24.44)){
            System.out.println("Sua classificação é Peso Normal"); 
        }
        else if((imc >= 24.50) && (imc < 29.99)){
            System.out.println("Sua classificação é Acima Do Peso"); 
        }
         else if((imc >= 30) && (imc < 34.99)){
            System.out.println("Sua classificação é Obesidade I"); 
        }
         else if((imc >= 35) && (imc < 39.99)){
             System.out.println("Sua classificação é Obesidade II"); 
        }
         else{
             System.out.println("Sua classificação é Obesidade III"); 
        }
        System.out.println("\n");
    }
}
