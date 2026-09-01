package it.aulab.models;

public class Arm {
    private Side side;
    private String attack;

    
    // Costruttore vuoto (richiesto dai POJO)
    public Arm() {}
    
    public Arm(Side side, String attack) {
        this.side = side;
        this.attack = attack;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public void attack(Side side) {
        System.out.println("Braccio " + side + " effettua l'attacco: " + this.attack);
    }

    @Override
    public String toString() {
        return "Braccio " + side + " con attacco: " + attack;
    }
}


// Ogni braccio ha un lato (side) e un tipo di arma/attacco montata. Forniamo costruttori, getter, setter e sovrascriviamo metodo toString() per poter stampare facilmente lo stato del braccio in console.