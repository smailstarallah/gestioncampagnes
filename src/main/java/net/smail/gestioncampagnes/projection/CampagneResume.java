package net.smail.gestioncampagnes.projection;

import java.math.BigDecimal;

public interface CampagneResume {
    Long getId();
    String getNom();
    BigDecimal getObjectifMontant();
}