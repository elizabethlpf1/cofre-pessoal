package cofre;

import java.util.ArrayList;

public class Cofrinho {
    
    //CRIA UMA LISTA PRIVADA DE MOEDAS
    private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

    //FUNÇÃO DE ADICIONAR MOEDAS NA LISTA
    public void adicionar(Moeda x){
        listaMoedas.add(x);
    }
    //REMOVER MOEDAS
    public void remover(double valor){        
        // PARA TODA E QUALQUER MOEDA DENTRO DA LISTA DE MOEDAS
       for (Moeda moeda : listaMoedas) {

        //E SE O VALOR DA MOEDA FOR IGUAL AO VALOR DIGITADO
        if (moeda.valor == valor){

            //REMOVA A MOEDA E IMPRIMA NA TELA.
            listaMoedas.remove(moeda);            
            System.out.println("Moeda removida");           
            return;
            }
        
       }
    }

    //LISTAR AS MOEDAS
    public void listagemMoedas(){       
        for (Moeda x : listaMoedas) {
            //IMPRIMA CADA UMA DAS MOEDAS ATÉ QUE TODAS ELAS ESTEJAM IMPRESSAS           
            x.info();           
        }
            
    }

    //DEMONSTRAR O TOTAL DE MOEDAS
    public double totalConvertido() {
        
        //CRIA UMA VARIAVEL PARA OBTER O VALOR TOTAL
        double total = 0;

        //PARA CADA MOEDA NA LISTA DE MOEDAS
        for (Moeda moeda : listaMoedas) {

            //ADICIONE O VALOR CONVERTIDO AO TOTAL, E DEMONSTRE NA TELA ISSO.
            total += moeda.converter();
            
        }
        //RETORNA O TOTAL DA SOMA DE TODAS AS MOEDAS
        return total;
    }
}
