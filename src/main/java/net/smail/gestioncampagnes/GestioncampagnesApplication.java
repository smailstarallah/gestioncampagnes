package net.smail.gestioncampagnes;

import net.smail.gestioncampagnes.Repositories.CampagneRepository;
import net.smail.gestioncampagnes.entities.Campagne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Date;

@SpringBootApplication
public class GestioncampagnesApplication implements CommandLineRunner {
    @Autowired
    CampagneRepository campagneRepository;

    public static void main(String[] args) {
        SpringApplication.run(GestioncampagnesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        campagneRepository.save(new Campagne(null, "Campagne 1", BigDecimal.valueOf(1000000), new Date(), new Date(2028)));    }
}
