package it.aulab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import it.aulab.services.JeegService;

public class App {
    public static void main(String[] args) {
        System.out.println("Avvio dell'applicazione Spring...");

        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Contesto Spring avviato correttamente!");

        // Chiediamo a Spring il nostro Jeeg pronto all'uso
        JeegService service = context.getBean("jeegService", JeegService.class);

        // Facciamo compiere le azioni al nostro robot!
        service.move();
        service.attack();

        context.close();
        System.out.println("Applicazione terminata.");
    }
}