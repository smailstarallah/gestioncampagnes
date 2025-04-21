package net.smail.gestioncampagnes.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @ManyToOne
    Campagne campagne;
    String nomDonateur;
    Double montant;
    Date date;
}
