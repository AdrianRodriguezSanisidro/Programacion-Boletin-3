package boletin3_1;

/**
 *
 * @author Adry
 */
public class Consumo {
    private float kms;
    private float l;//l= litros de gasolina
    private float vMed;//vMed= velocidade media
    private float pGas;// Prezo da gasolina

    public Consumo(){
        kms=0;
        l=0;
        vMed=0;
        pGas=0;       
    }
    //Hacemos el constructor
    public Consumo(float kms,float l,float vMed,float pGas){
    this.kms=kms;this.l=l;this.vMed=vMed;this.pGas=pGas;
    }
    
}
