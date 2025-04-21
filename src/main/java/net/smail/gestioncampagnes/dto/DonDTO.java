package net.smail.gestioncampagnes.dto;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class DonDTO {
    private Long id;
    private String nomCampagne;
    private String nomDonateur;
    private Double montant;
    private Date date;

}
