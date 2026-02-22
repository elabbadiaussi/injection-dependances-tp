package net.elabbadi.pres;

import net.elabbadi.dao.IDao;
import net.elabbadi.metier.IMetier;
import java.io.File;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(
                Pres2.class.getResourceAsStream("/config.txt"));
        String daoClassName = scanner.nextLine();
        
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        System.out.println("RES= " + metier.calcul());
    }
}
