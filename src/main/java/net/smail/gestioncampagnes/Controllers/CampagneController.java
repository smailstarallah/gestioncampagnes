package net.smail.gestioncampagnes.Controllers;


import net.smail.gestioncampagnes.Services.ServiceCampagne;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api/campagnes")
@RestController
public class CampagneController {
    ServiceCampagne serviceCampagne;

    public CampagneController(ServiceCampagne serviceCampagne) {
        this.serviceCampagne = serviceCampagne;
    }

    @GetMapping("/resumes")
    public Object getAllCampagneResumes() {
        return serviceCampagne.activeCampagnes();
    }

}
