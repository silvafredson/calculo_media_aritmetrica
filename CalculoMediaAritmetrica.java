import java.util.Scanner;

public class CalculoMediaAritmetrica {
   
   public static void main (String[] args) {
       
    double nota1, nota2, nota3, media;

    Scanner entrada = new Scanner(System.in); // Scanner de entrada para que o usuário digite as notas

    System.out.println("Digite a nota 1: ");
    nota1 = entrada.nextDouble(); // aqui a nota1 recebe e armazena a nota digitada
    
    System.out.println("Digite a nota 2: ");
    nota2 = entrada.nextDouble(); 
    
    System.out.println("Digite a nota 3: ");
    nota3 = entrada.nextDouble(); 

    media = (nota1+nota2+nota3)/3; // aqui as três notas são somadas e divididas por 3
    System.out.println("A média do aluno é: " + media);

    if (media >= 7) {
        System.out.println("Aluno aprovado");

    }else if (media >= 5) {
        System.out.println("Aluno em recuperação");
    }else {
        System.out.println("Aluno Reprovado");
    }   
   } 
}
