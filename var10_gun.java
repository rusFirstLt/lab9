package lab9;

public class var10_gun {
    private String firm;
    private double cal;
    private Boolean firesteel;

    public void setFirm(String firma) { firm = firma; }
    public String getFirm() { return firm; }

    public void setCal(double Calibr) { cal = Calibr; }
    public double getCal() { return cal; }

    public void setFiresteel(Boolean FS) { firesteel = FS; }
    public Boolean getFiresteel(){ return firesteel; }

    public var10_gun() {
        firm = "Без фирмы";
        cal = 0;
        firesteel = false;
    }

    public var10_gun(String firma, double Calibr, Boolean FS){
        firm = firma;
        cal = Calibr;
        firesteel = FS;
    }
}
