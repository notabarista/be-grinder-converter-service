package org.notabarista.service;

import org.notabarista.dto.GrinderConversionDTO;
import org.notabarista.dto.GrinderSizeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface GrinderSizeService {

    List<GrinderSizeDTO> findAll();
    List<GrinderSizeDTO> findGrinderSizesByGrinder(String grinder);
    List<GrinderSizeDTO> findGrinderSizesByGrindSize(String grinder, String grindSize);

}
