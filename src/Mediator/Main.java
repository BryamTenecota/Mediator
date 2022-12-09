package Mediator;

public class Main {

    public static void main(String[] args) {
        
        Mediador m = new Mediador();
        
        Colega cc1 = new ColegaConcreto1(m);
        Colega cc2 = new ColegaConcreto2(m);
        Colega cc3 = new ColegaConcreto3(m);
        
        m.agregarColega(cc1);
        m.agregarColega(cc2);
        m.agregarColega(cc3);
        
        cc2.comunicar("ColegaConcreto2 ha cambiado");
    }
    
}
