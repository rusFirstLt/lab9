package lab9;

import java.util.ArrayList;

public class var10_armouries {
    private ArrayList<var10_gun> masGun = new ArrayList<var10_gun>();

    public void addFire(var10_gun g){
     masGun.add(g);
    }

    public var10_armouries(){
    }

    public Boolean findGun(var10_gun m){
        return masGun.contains(m);
    }

    public var10_armouries(ArrayList<var10_gun> n){
        masGun = n;
    }

    public void printArmouries(){
        System.out.println("В оружейной: ");
        for (var10_gun a : masGun){
            System.out.println("\t" + a.toString());
            if (a instanceof var10_fire){
                System.out.println("Это огнестрел");
            }else{ System.out.println("Это холодное оружие"); }
        }
    }
}
