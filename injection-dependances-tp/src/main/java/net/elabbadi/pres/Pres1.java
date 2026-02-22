package net.elabbadi.pres;



import  net.elabbadi.dao.Daoimpl;
import  net.elabbadi.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        Daoimpl d = new Daoimpl();
        MetierImpl metier = new MetierImpl(d);
        System.out.println("RES=" + metier.calcul());
    }
}