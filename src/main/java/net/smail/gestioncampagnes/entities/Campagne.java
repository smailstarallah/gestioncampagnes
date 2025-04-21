package net.smail.gestioncampagnes.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class Campagne {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String nom;
    BigDecimal objectifMontant;
    Date dateDebut;
    Date dateFin;
    }
