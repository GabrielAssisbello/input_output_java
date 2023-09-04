import java.util.Scanner;

public class SomaDoisNumeros{
    public static void main (String [] args){
     
        try (Scanner leitor = new Scanner(System.in)) {
            double primeiroOperando;
            double segundoOperando;
            double resultado;

            System.out.println(" digita ai ");
            primeiroOperando = leitor.nextDouble();
            
            System.out.println(" digita ai denovo ");
            segundoOperando = leitor.nextDouble();
            
            resultado = primeiroOperando + segundoOperando;

            System.out.print(resultado);
        }
        


        
    }
    
}