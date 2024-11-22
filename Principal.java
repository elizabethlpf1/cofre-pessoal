// Programa feito por Elizabeth Leite de Paula Ferreira RU:4277954


package cofre;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) throws Exception {
                  
      Scanner teclado = new Scanner(System.in);

     
      Cofrinho cofrinho = new Cofrinho();

          while (true) {
        
          Double moedaDolar;          
          Double moedaReal;
          Double moedaEuro;
         
          int opcaoEscolhida;

          Moeda moeda;

          //Print menu de opções 
          System.out.println(" COFRINHO:");
          System.out.println("    1 - ADICIONAR MOEDAS");
          System.out.println("    2 - REMOVER MOEDAS");
          System.out.println("    3 - LISTAR MOEDAS");
          System.out.println("    4 - CALCULAR TOTAL CONVERTIDO PARA REAL");
          System.out.println("    5 - ENCERRAR");
        
       
          try {
              
         
               opcaoEscolhida = teclado.nextInt();
           
               //ADICIONAR MOEDAS
               if(opcaoEscolhida == 1){
                  
                    //ESCOLHE QUAL TIPO DE MOEDA ADICIONAR
                     System.out.println("Deseja adicionar: \n 1 - DOLARES | 2 - REAIS | 3 - EUROS");
                     opcaoEscolhida = teclado.nextInt();
  
                    if (opcaoEscolhida == 1){
  
                      System.out.println("Digite qual o valor em DOLAR a ser adicionado: ");
                      moedaDolar = teclado.nextDouble();
                     
                      moeda = new Dolar(moedaDolar);
                      cofrinho.adicionar(moeda);
                      continue;
  
                  } else if (opcaoEscolhida == 2){
  
                      System.out.println("Digite qual o valor em REAL a ser adicionado: ");
                      moedaReal = teclado.nextDouble();
                     
                      moeda = new Real(moedaReal);
                      cofrinho.adicionar(moeda);
                      continue;
                      
                  } else if(opcaoEscolhida == 3){
  
                      System.out.println("Digite qual o valor em EURO a ser adicionado: ");
                      moedaEuro = teclado.nextDouble();
              
                      moeda = new Euro(moedaEuro);
                      cofrinho.adicionar(moeda);
                      continue;
                  }
              
              
              //REMOVER MOEDAS
              } else if (opcaoEscolhida == 2){
                  
                  System.out.println("Qual moeda deseja ser removida?\n 1 - DOLARES | 2 - REAIS| 3 - EUROS");
                  opcaoEscolhida = teclado.nextInt();
  
                  if (opcaoEscolhida == 1){
  
                      System.out.println("Digite o valor da moeda DOLAR ");
                      moedaDolar = teclado.nextDouble();                     
                      cofrinho.remover(moedaDolar);
                      continue;
  
                  } else if (opcaoEscolhida == 2){
  
                      System.out.println("Digite o valor da moeda REAL ");
                      moedaReal = teclado.nextDouble();                      
                      cofrinho.remover(moedaReal);
                      continue;
  
                  } else if (opcaoEscolhida == 3){
  
                      System.out.println("Digite o valor da moeda EURO ");
                      moedaEuro = teclado.nextDouble();                        
                      cofrinho.remover(moedaEuro);
                      continue;
  
                  }
                  
              //LISTAGEM DE MOEDAS!
              } else if (opcaoEscolhida == 3){
  
                  System.out.println("Lista das suas moedas");
                  
                 
                  cofrinho.listagemMoedas();              
                  continue;
              
              //CALCULAR VALOR EM REAL
              } else if (opcaoEscolhida == 4){   

                  //  MOEDAS CONVERTIDAS
                  System.out.println("Calculando valores");                 
                  System.out.printf("%.2f \n", cofrinho.totalConvertido());
                              
              //ENCERRA O PROGRAMA
              } else if (opcaoEscolhida == 5){
                  System.out.println(" Programa Finalizado");
                  teclado.close();
                  break;
              }
          //CAPTURA ERROS - 
          } catch (Exception e) {
              System.out.println("ALGO ERRADO");
          }    
      } 
  } 
}