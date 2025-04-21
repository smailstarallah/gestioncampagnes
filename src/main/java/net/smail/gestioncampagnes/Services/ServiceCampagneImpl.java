package net.smail.gestioncampagnes.Services;

import net.smail.gestioncampagnes.entities.Campagne;
import net.smail.gestioncampagnes.Repositories.CampagneRepository;
import net.smail.gestioncampagnes.projection.CampagneResume;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class ServiceCampagneImpl implements ServiceCampagne {

    CampagneRepository campagneRepository;

    public ServiceCampagneImpl(CampagneRepository campagneRepository) {
        this.campagneRepository = campagneRepository;
    }


    @Override
    public Campagne save(Campagne campagne) {
        return campagneRepository.save(campagne);
    }

    @Override
    public List<Campagne> getAllCampagnes() {
        return campagneRepository.findAll();
    }

    @Override
    public List<Campagne> activeCampagnes() {
        return campagneRepository.findByDateFinGreaterThan(new Date());
    }
//    @Override
//    public List<CampagneResume> getAllCampagneResumes() {
//        return campagneRepository.findByResumes();
//    }
}
