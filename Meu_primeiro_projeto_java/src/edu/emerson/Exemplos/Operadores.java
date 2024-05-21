package edu.emerson.Exemplos;

public class Operadores {

    public static void main(String[] args) {
        
        int soma;
        int subtracao;
        int divisao;
        int resto;
        double flutuante;

        soma = 1 + 1;
        System.out.println("Soma de dois digitos : "+ soma);

        subtracao = 5 - 1;
        System.out.println("Subtração de dois digitos: " + subtracao);

        divisao = 4 / 2;
        System.out.println("Divisão de dois digitos: " + divisao);

        resto = 5 % 2;
        System.out.println("Resto de dois digitos: " + resto);

        flutuante = 6.50;
        System.out.println("Numero com casa decimal: " + flutuante);
   
        // Demais variaveis já declaradas pra uso:
        int numero = 12;
        System.out.println("Imprimindo o valor real do numero antes da alteração: " + numero);
        
        // Deixando o valor negativo
        numero = - numero;
        System.out.println("Imprimindo o valor negativo: " + numero);

        // Dessa maneira consigo deixar o valor positivo novamente:
        numero = numero * -2;
        System.out.println("Tornando o valor positivo: " + numero);
   
        // x Incrementação 
        int repNumero = 2;
        repNumero = repNumero + 2;
        System.out.println("Incremento: " + repNumero); 

        // Realizando incremento 
        repNumero ++;
        System.out.println("Utilizando incremento ++ : " + repNumero);

        // Decremento
        repNumero --;
        System.out.println("Decrementando: " + repNumero);

        // De true para false:
        boolean variavel = true;
        System.out.println("Boolean False: " + !variavel);
        

        // De false a true:
        variavel = variavel;
        System.out.println("Boolean True: " + variavel);

        // Estrutura de decisão simplificada com impressão de mensagem:
        String a, b;

        a = "M";
        b = "F";

        String resultadoEstrutura = a == b ? "Feminino" : "Masculino";
        System.out.println("Perfil escolhido: " + resultadoEstrutura);
         
        // Comparação com nomes usando formato eguals:
        // Formato recomendado para objetos
        String nome1 = "Emerson";
        String  nome2 = "Ricardo";

        System.out.println("Os nomes são iguais: " + nome1.equals(nome2));

        nome1 = "Emerson";
        nome2 = "Emerson";

        System.out.println("Os nomes são diferentes: " + nome1.equals(nome2));

        // Usando boleans com operadores:
        int numero1 = 8;
        int numero2 = 9;

        boolean resultadoComparacao = numero1 == numero2;
        System.out.println("Resultado False comparação: " + resultadoComparacao); 

        numero1 = 1;
        numero2 = 2;

        boolean resultadoComparacao2 = numero1 != numero2;
        System.out.println("Resultado True comparação: " + resultadoComparacao2);


        // Bolean com if 
        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2){
            System.out.println("Condição verdadeira");
        
        if (condicao1 || condicao2);
            System.out.println("Condiçao falsa");
        
        }



    }
    
}
