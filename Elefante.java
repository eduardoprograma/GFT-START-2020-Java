
package elefante;

/**
 *
 * @author Eduardo Felizardo Cândido
 */

import java.util.Scanner;

public class Elefante {
    public static void main(String[] args) {
        /* Declara o Scanner para entrada de dados via teclado*/
        Scanner numEle = new Scanner(System.in);
        
        /* Declaração da variável */
        int ele, i;
        
        /* Explica ao usuário o funcionamento básico do programa */
        System.out.printf("%s%n%s%n%n", "Este programa repete pelo número de vezes que",
                "corresponde ao valor inteiro digitado pelo usuário.");
        
        /* Entrada de dados via teclado */
        System.out.print("Entre com um valor inteiro: ");   // Prompt
        ele = numEle.nextInt(); //Lê o valor da variável e adiciona em ele
        
        for (i = 1; i <= ele; i++)    //Looping 
        {
            System.out.printf("%s ", "Incomoda");
        }   //fim de for
        
        System.out.printf(" %s%n%n", "muito mais");
    }   //Fim do método main
    
}   //Fim da Classe Elefante
