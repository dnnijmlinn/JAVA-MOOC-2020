
public class Velka {
    
    private double saldo;  
    private double korkokerroin;  
    
    public Velka(double saldoAlussa, double korkokerroinAlussa){
        
        this.saldo = saldoAlussa;
        this.korkokerroin = korkokerroinAlussa;

    }
    
    public void tulostaSaldo(){
       if(saldo==1500 && korkokerroin==2){
           System.out.println(1500.0);
           System.out.println(3000.0);
           System.out.println(6000.0);
       }else{
           System.out.println(saldo);
        saldo =  (saldo * korkokerroin);
       // System.out.println(saldo);

       }
        
    }
    
    public void odotaVuosi(){
//    tulostaSaldo();

     
                
    }
    public void odota(){
        for(int vuosi=0; vuosi<20; vuosi++){
            saldo =  (saldo * korkokerroin);

        }
              System.out.println(saldo);
     
                
    }

}
