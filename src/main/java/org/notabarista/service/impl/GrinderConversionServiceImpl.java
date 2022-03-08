package org.notabarista.service.impl;

import org.notabarista.dto.GrinderConversionDTO;
import org.notabarista.entity.GrinderConversionEntity;
import org.notabarista.mapper.GrinderConversionMapper;
import org.notabarista.repository.GrinderConversionRepository;
import org.notabarista.service.GrinderConversionService;
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

    @Override
    public List<GrinderConversionDTO> findAll() {

        List<GrinderConversionEntity> grinderConversionEntity = grinderConversionRepository.findAll();
        return grinderConversionMapper.grinderConversionsToGrinderConverterDTOs(grinderConversionEntity);
    }

}
