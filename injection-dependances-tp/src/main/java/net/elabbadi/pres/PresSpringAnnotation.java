package net.elabbadi.pres;

import net.elabbadi.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("net.elabbadi")
public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PresSpringAnnotation.class);
        IMetier metier = ctx.getBean("metier", IMetier.class);
        System.out.println("RES= " + metier.calcul());
    }
}
