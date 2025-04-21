package net.smail.gestioncampagnes.Services;

import net.smail.gestioncampagnes.entities.Campagne;
import net.smail.gestioncampagnes.projection.CampagneResume;

import java.util.List;

public interface ServiceCampagne {
    public Campagne save(Campagne campagne);
    public List<Campagne> getAllCampagnes();
    public List<Campagne> activeCampagnes();
//    public List<CampagneResume> getAllCampagneResumes();

}
