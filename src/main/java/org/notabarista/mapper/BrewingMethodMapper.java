package org.notabarista.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.notabarista.dto.BrewingMethodDTO;
import org.notabarista.entity.BrewingMethodEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BrewingMethodMapper {

    BrewingMethodDTO brewingMethodEntityToBrewingMethodDTO(BrewingMethodEntity brewingMethodEntity);

    BrewingMethodEntity brewingMethodDtoToBrewingMethodEntity(BrewingMethodDTO brewingMethodDTO);

}
