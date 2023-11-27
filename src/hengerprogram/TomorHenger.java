package hengerprogram;

public class TomorHenger extends Henger {
    
    private double fajsuly;
    
    public TomorHenger(double r, double m, double fajsuly) {
        super(r, m);
    }
    
    public TomorHenger(double r, double m) {
        super(r, m);
    }
    
    public double getFajsuly(){
        
        return 0;
        
    }
    
    public double suly(){
        
        return 0;
        
    }

    @Override
    public String toString() {
        return "TomorHenger{" + fajsuly + '}';
    }
    
    
}
