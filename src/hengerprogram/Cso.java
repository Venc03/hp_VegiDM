package hengerprogram;

public class Cso extends TomorHenger{
    
    private double falvastagsag;
    
    public Cso(double r, double m, double falvastagasag) {
        super(r, m);
    }
    
    public Cso(double r, double m, double fajsuly, double falvastagasag) {
        super(r, m, fajsuly);
    }
    

    public double getFalvastagsag(){
        
        return 0;
        
    }
    
    @Override
    public double terfogat(){
        
        return 0;
        
    }

    @Override
    public String toString() {
        return "Cso{" + falvastagsag + '}';
    }

}
