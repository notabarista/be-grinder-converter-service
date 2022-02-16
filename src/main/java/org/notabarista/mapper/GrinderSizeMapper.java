package org.notabarista.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.notabarista.dto.GrinderSizeDTO;
import org.notabarista.entity.GrinderSizeEntity;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface GrinderSizeMapper {

    GrinderSizeDTO grinderSizEntityToGrinderSizeDTO(GrinderSizeEntity grinderSizeEntity);

    GrinderSizeEntity grinderSizeDtoToGrinderSizeEntity(GrinderSizeDTO grinderSizeDTO);

    List<GrinderSizeDTO> grinderSizesToGrinderSizeDTOs(List<GrinderSizeEntity> grinderSizeEntities);

    List<GrinderSizeEntity> grinderSizeDTOsToGrinderSizes(List<GrinderSizeDTO> grinderSizeDTOs);
}
