package net.elabbadi.dao;
import org.springframework.stereotype.Component;

@Component("d")
public class Daoimpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Base de données");
        double temp = 23;
        return temp;
    }
}
