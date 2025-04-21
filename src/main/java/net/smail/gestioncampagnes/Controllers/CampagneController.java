package net.smail.gestioncampagnes.Controllers;


import jakarta.validation.Valid;
import net.smail.gestioncampagnes.Repositories.CampagneRepository;
import net.smail.gestioncampagnes.Services.ServiceCampagne;
import net.smail.gestioncampagnes.Services.ServiceDon;
import net.smail.gestioncampagnes.dto.DonDTO;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/api/campagnes")
@RestController
public class CampagneController {
    ServiceCampagne serviceCampagne;
    ServiceDon serviceDon;
    CampagneRepository campagneRepository;

    public CampagneController(ServiceCampagne serviceCampagne, ServiceDon serviceDon, CampagneRepository campagneRepository) {
        this.serviceCampagne = serviceCampagne;
        this.serviceDon = serviceDon;
        this.campagneRepository = campagneRepository;
    }

    @GetMapping("/resumes")
    public Object getAllCampagneResumes() {
        System.out.println(serviceCampagne.getAllCampagnes());
        return serviceCampagne.activeCampagnes();
    }

    @PostMapping("/{id}/dons")
    public void makeDon(@PathVariable Long id, @Valid @RequestBody DonDTO donDTO) {
        donDTO.setNomCampagne(campagneRepository.findById(id).get().getNom());
         serviceDon.save(donDTO);
    }


}
