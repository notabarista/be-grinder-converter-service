package org.notabarista.service;

import org.notabarista.dto.BrewingMethodDTO;
import org.notabarista.dto.GrinderSizeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BrewingMethodService {

    List<BrewingMethodDTO> findAll();
    BrewingMethodDTO findByGrindSize(String grindSize);
    BrewingMethodDTO findByBrewingMethod(String brewingMethod);
    BrewingMethodDTO findByGrindSpecification(String grindSpecification);

}
