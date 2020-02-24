
package carro;
 
public abstract  class Carro {
    public abstract String tipo();
    public final void imprimir(){
    System.out.println("Yo soy un tipo de carro " + tipo());
    }

}
