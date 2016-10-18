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
    this.kms=kms;
    this.l=l;
    this.vMed=vMed;
    this.pGas=pGas;
    }
    public float getKms(){
        return kms;
}
    public void setKms(float kms){
        this.kms=kms;
    }
    public float getL(){
        return l;
    }
    public void setL(float l){
        this.l=l;
    }
    public float getVMed(){
        return vMed;
    }
    public void setVMed(float vMed){
        this.vMed=vMed;
    }
    public float getPGas(){
        return pGas;
    }
    public void setPGas(float pGas){
        this.pGas=pGas;
    }
    public float getTempo(){
        float tempo;
        tempo=kms/vMed;
        return tempo;
    }
    public float consumoMedio(){
        float consumoMedio;
        consumoMedio=l/(kms/100);
        return consumoMedio;
    }
    public float consumoEuros(){
        float consumoEuros;
        consumoEuros=(l/(kms/100))*this.pGas;
                return consumoEuros;
    }
    public void visualizar(){
        System.out.println("Kms ="+kms+ "litros ="+ l+ "Velocidade Media =" +vMed +"Prezo da gasolina ="+pGas);
    }
}
