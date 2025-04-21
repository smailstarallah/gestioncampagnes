package net.smail.gestioncampagnes.Services;

import net.smail.gestioncampagnes.Repositories.CampagneRepository;
import net.smail.gestioncampagnes.Repositories.DonationRepository;
import net.smail.gestioncampagnes.dto.DonDTO;
import net.smail.gestioncampagnes.entities.Campagne;
import net.smail.gestioncampagnes.entities.Donation;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServiceDonImpl implements ServiceDon {

    DonationRepository donRepository;
    CampagneRepository campagneRepository;

    public ServiceDonImpl(DonationRepository donRepository, CampagneRepository campagneRepository) {
        this.donRepository = donRepository;
        this.campagneRepository = campagneRepository;
    }

    @Override
    public DonDTO save(DonDTO donDTO) {
        Donation don = new Donation();
        don.setNomDonateur(donDTO.getNomDonateur());
        don.setMontant(donDTO.getMontant());
        don.setDate(donDTO.getDate());
        Campagne camp = campagneRepository.findByNom(donDTO.getNomCampagne());
        don.setCampagne(camp);
        donRepository.save(don);

        return new DonDTO(don.getId(), don.getCampagne().getNom(), don.getNomDonateur(), don.getMontant(), don.getDate());
    }

    @Override
    public List<DonDTO> getAllDons() {
        return donRepository.findAll().stream()
                .map(don -> new DonDTO(don.getId(), don.getCampagne().getNom(), don.getNomDonateur(), don.getMontant(), don.getDate()))
                .toList();
    }
}
