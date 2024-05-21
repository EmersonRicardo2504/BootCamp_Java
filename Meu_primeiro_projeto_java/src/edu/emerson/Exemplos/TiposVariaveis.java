package edu.emerson.Exemplos;

 public class TiposVariaveis {

    public static void main(String[] args) {
        
        System.out.println("* Imprimindo Double:");
        double salarioMinimo = 2500;
        System.out.println(salarioMinimo);

        // por convensão podemos usar realizar a atribuição long da maneira a seguir:
        System.out.println("* Imprimindo convenção short, int, long:");
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        long numeroCurto2 = numeroNormal;
        // short numeroCurto2 = (short) numeroNormal;
        
        System.out.println(numeroCurto2);


        // Declarando constante deve ser acompanhada de 'final'
        System.out.println("* Imprimindo constante:");
        final double NUMBER = 6;
        System.err.println(NUMBER);




        


        

    }

    
}