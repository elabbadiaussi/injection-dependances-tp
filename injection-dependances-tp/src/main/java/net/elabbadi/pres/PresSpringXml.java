package net.elabbadi.pres;


import net.elabbadi.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXml {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = ctx.getBean("metier", IMetier.class);
        System.out.println("RES= " + metier.calcul());
    }
}