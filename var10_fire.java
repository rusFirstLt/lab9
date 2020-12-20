package lab9;

public class var10_fire extends var10_gun{
    private String model;
    private int rateoffire;

    public var10_fire(){
        super();
        model = "";
        rateoffire = 0;
    }

    public var10_fire(String firma, double Calibr, Boolean FS, String name , int n){
        super(firma, Calibr, FS);
        model = name;
        rateoffire = n;
    }

    public void setModel(String name) { model = name; }
    public String getModel() { return model; }

    public void setRateoffire(int n) { rateoffire = n; }
    public int getRateoffire() { return rateoffire; }

    public String toString() {
        return getFirm() + " " + getModel() + " " + getCal() + " " + getRateoffire() + " " + getFiresteel();
    }
}