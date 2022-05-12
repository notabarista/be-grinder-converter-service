package org.notabarista.service.impl;

import java.util.List;
import java.util.UUID;
import org.notabarista.dto.GrinderSizeDTO;
import org.notabarista.mapper.GrinderSizeMapper;
import org.notabarista.repository.GrinderSizeRepository;
import org.notabarista.service.GrinderSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public List<GrinderSizeDTO> findGrinderAndBrewingMethod(String grinder,
                                                            String brewingMethodId) {
        return grinderSizeMapper.grinderSizesToGrinderSizeDTOs(grinderSizeRepository.findByGrinderAndBrewingMethodId(
            (UUID.fromString(grinder)), (UUID.fromString(brewingMethodId))));
    }

    @Override
    public List<GrinderSizeDTO> findGrinderSizesByGrindSizeAndBrewingMethod(String grinder,
                                                                            String grindSize,
                                                                            String brewingMethodId) {
        return grinderSizeMapper.grinderSizesToGrinderSizeDTOs(grinderSizeRepository.findByGrinderAndGrindSizeAndBrewingMethodId(
            (UUID.fromString(grinder)), grindSize, (UUID.fromString(brewingMethodId))));
    }

}
