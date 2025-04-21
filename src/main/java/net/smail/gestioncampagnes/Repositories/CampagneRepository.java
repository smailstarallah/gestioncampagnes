package net.smail.gestioncampagnes.Repositories;

import lombok.Data;
import net.smail.gestioncampagnes.entities.Campagne;
import net.smail.gestioncampagnes.projection.CampagneResume;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface CampagneRepository extends JpaRepository<Campagne, Long> {
    public List<Campagne> findByDateFinGreaterThan(Date date);
    public Campagne findByNom(String nom);

   // List<CampagneResume> findByResumes();
}
