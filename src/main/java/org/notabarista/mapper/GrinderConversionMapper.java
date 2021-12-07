package org.notabarista.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.notabarista.dto.GrinderConversionDTO;
import org.notabarista.entity.GrinderConversionEntity;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface GrinderConversionMapper {

    GrinderConversionDTO grinderConversionEntityToGrinderConversionDTO(GrinderConversionEntity grinderConversionEntity);

    GrinderConversionEntity grinderConversionDtoToGrinderConversionEntity(GrinderConversionDTO grinderConversionDTO);

    List<GrinderConversionDTO> grinderConversionsToGrinderConverterDTOs(List<GrinderConversionEntity> grinderConversionEntities);

    List<GrinderConversionEntity> grinderConversionDTOsToGrinderConversions(List<GrinderConversionDTO> grinderConversionDTOs);
}
