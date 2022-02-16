package org.notabarista.service.impl;

import org.notabarista.dto.BrewingMethodDTO;
import org.notabarista.entity.BrewingMethodEntity;
import org.notabarista.mapper.BrewingMethodMapper;
import org.notabarista.repository.BrewingMethodRepository;
import org.notabarista.service.BrewingMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrewingMethodServiceImpl implements BrewingMethodService {

    @Autowired
    private BrewingMethodRepository brewingMethodRepository;

    @Autowired
    private BrewingMethodMapper brewingMethodMapper;

    @Override
    public List<BrewingMethodDTO> findAll() {
        return brewingMethodMapper.brewingMethodEntitiesToBrewingMethodDTOs(brewingMethodRepository.findAll());
    }

    @Override
    public BrewingMethodDTO findByGrindSize(String grindSize) {
        return brewingMethodMapper.brewingMethodEntityToBrewingMethodDTO(brewingMethodRepository.findByGrindSize(grindSize)
                .orElseGet(() -> new BrewingMethodEntity()));
    }

    @Override
    public BrewingMethodDTO findByBrewingMethod(String brewingMethod) {
        return brewingMethodMapper.brewingMethodEntityToBrewingMethodDTO(brewingMethodRepository.findByBrewingMethod(brewingMethod)
                .orElseGet(() -> new BrewingMethodEntity()));
    }

    @Override
    public BrewingMethodDTO findByGrindSpecification(String grindSpecification) {
        return brewingMethodMapper.brewingMethodEntityToBrewingMethodDTO(brewingMethodRepository.findByGrindSpecification(grindSpecification)
                .orElseGet(() -> new BrewingMethodEntity()));
    }
}
