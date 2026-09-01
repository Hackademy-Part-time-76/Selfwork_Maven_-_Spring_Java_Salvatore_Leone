package it.aulab.models;

public class Jeeg {
    private Arm armSx;
    private Arm armDx;
    private Leg leg;

    // Costruttore vuoto
    public Jeeg() {}

    // Costruttore completo
    public Jeeg(Arm armSx, Arm armDx, Leg leg) {
        this.armSx = armSx;
        this.armDx = armDx;
        this.leg = leg;
    }

    public Arm getArmSx() {
        return armSx;
    }

    public void setArmSx(Arm armSx) {
        this.armSx = armSx;
    }

    public Arm getArmDx() {
        return armDx;
    }

    public void setArmDx(Arm armDx) {
        this.armDx = armDx;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "Jeeg Robot composto da:\n - " + armSx + "\n - " + armDx + "\n - è pronto all'azione!";
    }
}


// La classe principale del nostro robot. Jeeg non può esistere senza le sue parti. È composto da un braccio sinistro, un braccio destro e le gambe.
// Questa struttura esprime il concetto di Dipendenza: la classe Jeeg dipende dalle classi Arm e Leg per poter funzionare.