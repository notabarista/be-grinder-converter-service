package org.notabarista.service;

import org.notabarista.dto.GrinderConversionDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface GrinderConversionService {

    List<GrinderConversionDTO> findAll();

    List<GrinderConversionDTO> findGrinderConversionByGrinder(String grinder);

}
