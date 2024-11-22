package cofre;

public class Real extends Moeda {
  
    public Real(double valor) {
        super(valor);
    }
    @Override
    public double converter() {
        return valor;
    }   
    @Override
    void info() {
        System.out.println("Real: "+ valor);
    }
    @Override
    public String toString() {
        return "Real: " + valor;
    }    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(valor);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }   
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
