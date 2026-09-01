package it.aulab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import it.aulab.models.Arm;
import it.aulab.models.Leg;
import it.aulab.models.Side;
import it.aulab.models.Jeeg;

@Configuration
//Dice a Spring che questa classe è un libretto d'istruzioni. Spring la leggerà all'avvio per sapere quali oggetti creare.
@ComponentScan("it.aulab")
//Dice a Spring di scansionare tutte le cartelle dentro it.aulab per cercare classi speciali @
public class AppConfig {

    @Bean
    //Indica a Spring che il valore restituito da quel metodo deve essere registrato come un oggetto pronto all'uso
    public Arm armSx() {
        return new Arm(Side.SX, "Maglio Perforante");
    }

    @Bean
    public Arm armDx() {
        return new Arm(Side.DX, "Raggio Protonico");
    }

    @Bean
    public Leg leg() {
        return new Leg();
    }

    @Bean("woodenJeeg")
    @Lazy ////Diciamo a Spring: di costruire questo Jeeg solo se chiesto esplicitamente.
    public Jeeg woodenJeeg() {
        System.out.println("Costruzione in corso del Jeeg di LEGNO...");
        return new Jeeg(armSx(), armDx(), leg());
    }

    @Bean("steelJeeg")
    @Lazy
    public Jeeg steelJeeg() {
        // Creiamo un secondo Jeeg, stavolta d'acciaio
        System.out.println("Costruzione in corso del Jeeg d'ACCIAIO...");
        return new Jeeg(armSx(), armDx(), leg());
    }

    //Qui creiamo due Beans dello stesso tipo (Jeeg). Dando loro un nome esplicito tra parentesi, possiamo richiamarli separatamente nel main, così da poterli usare entrambi nello stesso programma e non creare ambiguità.
}
