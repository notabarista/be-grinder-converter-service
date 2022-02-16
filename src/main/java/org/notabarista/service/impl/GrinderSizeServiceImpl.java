package org.notabarista.service.impl;

import org.notabarista.dto.GrinderSizeDTO;
import org.notabarista.mapper.GrinderSizeMapper;
import org.notabarista.repository.GrinderSizeRepository;
import org.notabarista.service.GrinderSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GrinderSizeServiceImpl implements GrinderSizeService {

    @Autowired
    private GrinderSizeRepository grinderSizeRepository;

    @Autowired
    private GrinderSizeMapper grinderSizeMapper;

    @Override
    public List<GrinderSizeDTO> findAll() {
        return grinderSizeMapper.grinderSizesToGrinderSizeDTOs(grinderSizeRepository.findAll());
    }

    @Override
    public List<GrinderSizeDTO> findGrinderSizesByGrinder(String grinder) {
        return grinderSizeMapper.grinderSizesToGrinderSizeDTOs(grinderSizeRepository.findByGrinder(UUID.fromString(grinder)));
    }

    @Override
    public List<GrinderSizeDTO> findGrinderSizesByGrindSize(String grinder, String grindSize) {
        return grinderSizeMapper.grinderSizesToGrinderSizeDTOs(grinderSizeRepository.findByGrinderAndGrindSize((UUID.fromString(grinder)), grindSize));
    }

}
