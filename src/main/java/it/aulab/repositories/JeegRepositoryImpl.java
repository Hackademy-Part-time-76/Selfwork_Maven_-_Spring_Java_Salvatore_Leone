package it.aulab.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import it.aulab.models.Jeeg;

@Repository("jeegRepository") // stereotype annotation, indica a Spring che questa classe è un Repository, cioè una classe che si occupa di gestire l'accesso ai dati. In questo caso, il Repository gestisce l'accesso all'oggetto Jeeg.
public class JeegRepositoryImpl implements JeegRepository {

    @Autowired // indica a Spring di iniettare automaticamente un'istanza di Jeeg nel campo jeeg. Spring cercherà un bean di tipo Jeeg e lo assegnerà a questo campo.
    @Qualifier("woodenJeeg") // specifica quale bean di tipo Jeeg deve essere iniettato. In questo caso, il bean con il nome "woodenJeeg" definito nella classe AppConfig.
    private Jeeg jeeg;

    @Override
    public Jeeg getJeeg() {
        return this.jeeg;
    }
}
