package net.elabbadi.metier;

import net.elabbadi.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; // Couplage Faible

    // Constructeur sans paramètre
    public MetierImpl() {
    }

    // Constructeur avec paramètre - Injection des dépendances via le constructeur
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        return t * 43 / 3;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}