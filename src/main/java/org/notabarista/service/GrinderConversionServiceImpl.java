package org.notabarista.service;

import org.notabarista.dto.GrinderConversionDTO;
import org.notabarista.mapper.GrinderConversionMapper;
import org.notabarista.repository.GrinderConversionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrinderConversionServiceImpl implements GrinderConversionService {

    @Autowired
    private GrinderConversionRepository grinderConversionRepository;

    @Autowired
    private GrinderConversionMapper grinderConversionMapper;


    @Override
    public List<GrinderConversionDTO> findGrinderConversionByGrinder(String grinder) {
        return grinderConversionMapper.grinderConversionsToGrinderConverterDTOs(grinderConversionRepository.findByGrinder(grinder));
    }

    public List<GrinderConversionDTO> findAll() {
        return grinderConversionMapper.grinderConversionsToGrinderConverterDTOs(grinderConversionRepository.findAll());
    }

}
