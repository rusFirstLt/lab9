package lab9;

public class var10_steel extends var10_gun{
    private String model;

    public var10_steel(){
        super();
        model = "";
    }

    public var10_steel(String firma, double Calibr, Boolean FS, String name){
        super(firma, Calibr, FS);
        model = name;
    }

    public void setModel(String name) { model = name; }
    public String getModel() { return model; }

    public String toString(){
        return getModel();
    }
}