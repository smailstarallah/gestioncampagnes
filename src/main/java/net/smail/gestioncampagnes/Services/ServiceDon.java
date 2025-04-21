package net.smail.gestioncampagnes.Services;

import net.smail.gestioncampagnes.dto.DonDTO;

import java.util.List;

public interface ServiceDon {
    public DonDTO save(DonDTO donDTO);
    public List<DonDTO> getAllDons();

}
