package cofre;

public class Euro extends Moeda {

    //TAXA DE CONVERSÃO 
    public double taxaConversaoEuro = 5.37;

    //VLOR CLASSE MAE PARA FILHA
    public Euro(double valor) {
        super(valor);
    }

    //CONVERTE A MOEDA SOB BASE A SUA TAXA
    @Override
    public double converter() {
       return valor * taxaConversaoEuro;        
    }

    //INFORMAÇÃO DE CADA MOEDA
    @Override
    void info() {
        System.out.println("Euro: "+ valor);
    }

    //VALORE PARA STRING
    @Override
    public String toString() {
        return "Euro: " + valor;
    }

    //PARA CADA MOEDA CODIGO HASH
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(valor);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    // COMPARANDO VALORES
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dolar other = (Dolar) obj;
        if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
            return false;
        return true;
    }
    


}
