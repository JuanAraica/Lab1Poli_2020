 package avion;
import avion.Jet;
 import avion.AvionI;
 
public class Aeropuerto {
     private final AvionI avion;
public Aeropuerto(AvionI avion) {
     this.avion=avion;
    }
    public void takeOff(){
        System.out.println("Saliendo " + avion.tipo());
    }
    
}
