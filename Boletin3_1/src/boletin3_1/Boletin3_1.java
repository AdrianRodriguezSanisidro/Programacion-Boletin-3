package boletin3_1;

/**
 *
 * @author Adry
 */
public class Boletin3_1 {
    public static void main(String[] args) {
        Consumo consumo1=new Consumo();
        consumo1.setL(50f);
        consumo1.setPGas(1.57f);
        Consumo consumo2=new Consumo(10f,5f,10f,10f);
        System.out.println("Consumo medio ="+ consumo2.consumoMedio());
        consumo2.setL(20f);
        System.out.println("Velocidade media "+ consumo2.getVMed());
    }
    
}
