
// Podemos realizar importações apartir de diretorios usando:
package edu.emerson.Exemplos;


// Sempre declarar as variavel conforme o nome do arquivo java.
public class MinhaClasse {

    public static void main (String [] args) {
       
        // Sempre declarar o tipo da variavel antes do seu primeiro uso:
        String primeiroNome = "Emerson";
        String segundoNome = "Ricardo";
        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);


        // Maneira pra realizar uma impressão usando:
        System.out.println(nomeCompleto);
    }


    // Realizando a concatenação dos objetos:
public static String nomeCompleto (String primeiroNome, String segundoNome){
    
    return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);

    }
} 



