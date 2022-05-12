package org.notabarista.service;

import java.util.List;
import org.notabarista.dto.GrinderSizeDTO;

public interface GrinderSizeService {

    List<GrinderSizeDTO> findAll();
    List<GrinderSizeDTO> findGrinderSizesByGrinder(String grinder);
    List<GrinderSizeDTO> findGrinderSizesByGrindSize(String grinder, String grindSize);

    List<GrinderSizeDTO> findGrinderAndBrewingMethod(String grinder, String brewingMethodId);
    List<GrinderSizeDTO> findGrinderSizesByGrindSizeAndBrewingMethod(String grinder, String grindSize, String brewingMethodId);

}
