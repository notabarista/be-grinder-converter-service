package org.notabarista.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.notabarista.dto.BrewingMethodDTO;
import org.notabarista.dto.GrinderConversionDTO;
import org.notabarista.entity.BrewingMethodEntity;
import org.notabarista.entity.GrinderConversionEntity;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BrewingMethodMapper {

    BrewingMethodDTO brewingMethodEntityToBrewingMethodDTO(BrewingMethodEntity brewingMethodEntity);

    BrewingMethodEntity brewingMethodDtoToBrewingMethodEntity(BrewingMethodDTO brewingMethodDTO);

    List<BrewingMethodDTO> brewingMethodEntitiesToBrewingMethodDTOs(List<BrewingMethodEntity> brewingMethodEntities);

    List<BrewingMethodEntity> brewingMethodsDtoToBrewingMethodEntities(List<BrewingMethodDTO> brewingMethodDTOs);

}
