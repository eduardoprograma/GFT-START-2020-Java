
package dataaniversário;

/**
 *
 * @author Eduardo Felizardo Cândido
 */
import java.util.Scanner;

public class DataAniversário {

    public static void main(String[] args) {
        /* Declara o Scanner para entrada de dados via Teclado */
        Scanner input = new Scanner(System.in);
        
        /* Declara as varáveis do tipo inteiro */
        int dia, mes, ano;
        
        /* Uma breve eplicação para o usuário */
        System.out.printf("%s%n%s%n%n", "Você será solicitado a digitar sua data",
                "de aniversário. Caso ocorra um problema você será notificado.");
        
        /*Entrada de dados*/
        System.out.print("Entre com o dia de seu nascimento: ");    //Prompt
        dia = input.nextInt();  //Lê o valor digitado e adiciona a variável
        
        System.out.print("Entre com o mês de seu nascimento: ");    //Prompt
        mes = input.nextInt();  //Lê o valor digitado e adiciona a variável
        
        System.out.print("Entre com o ano de seu nascimento: ");    //Prompt
        ano = input.nextInt();  //Lê o valor digitado e adiciona a variável
        
        /* Validação da data de aniversário */
        if (dia <= 31)  //Validação do dia
        {
            if(mes <= 12)   //Validação do mês
            {
                if (ano <= 2018)    //Validção do ano
                {
                    System.out.printf("Sua data de aniversário é %d/%d/%d%n%n", dia, mes, ano);
                }
                else
                {
                    System.out.println("O ano digitado é posterior a 2018.");
                }
            }
            else
            {
                System.out.println("O mes digitado ultrapassa os 12 meses do ano.");
            }
        }
        else
        {
            System.out.println("O dia digitado ultrapassa os 31 dias de cada mês.");
        }
    }   //fim do método main
    
}   //Fim da Classe DataAniversário
