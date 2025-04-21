package net.smail.gestioncampagnes.dto;




import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class DonDTO {
    private Long id;
    @NotBlank(message = "Le nom de la campagne est obligatoire")
    private String nomCampagne;
    @NotBlank(message = "Le nom du donateur est obligatoire")
    private String nomDonateur;

    private Double montant;
    private Date date;

}
