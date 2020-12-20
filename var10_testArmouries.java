package lab9;

public class var10_testArmouries {
    public static void main(String[] args) {
        var10_armouries myArmouries = new var10_armouries();

        var10_fire myFire = new var10_fire("Mauzer", 9, false, "Luger", 100);
        myArmouries.addFire(myFire);

        var10_steel mySteel = new var10_steel("M9", 0, true, "Bayoned");
        myArmouries.addFire(mySteel);

        myArmouries.printArmouries();
    }
}