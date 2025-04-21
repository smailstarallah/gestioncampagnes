package net.smail.gestioncampagnes.Repositories;

import net.smail.gestioncampagnes.entities.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository<Donation, Long> {
}
