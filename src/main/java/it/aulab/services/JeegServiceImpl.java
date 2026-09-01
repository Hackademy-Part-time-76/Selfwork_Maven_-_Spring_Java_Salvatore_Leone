package it.aulab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.aulab.models.Arm;
import it.aulab.models.Jeeg;
import it.aulab.models.Leg;
import it.aulab.models.Side;
import it.aulab.repositories.JeegRepository;

@Service("jeegService")
public class JeegServiceImpl implements JeegService {

    @Autowired
    private JeegRepository repository; 

    @Override
    public void attack() {
        if (this.repository.getJeeg() != null) {
            Jeeg jeeg = this.repository.getJeeg();
            Arm armSx = jeeg.getArmSx();
            Arm armDx = jeeg.getArmDx(); 
            armSx.attack(Side.SX);      
            armDx.attack(Side.DX); 
        }
    }

    @Override
    public void move() {
        if (this.repository.getJeeg() != null) {
            Jeeg jeeg = this.repository.getJeeg();
            Leg leg = jeeg.getLeg();
            leg.walkForward();
            leg.walkBackward();
        }
    }
}