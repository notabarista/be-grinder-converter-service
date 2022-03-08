package org.notabarista.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.notabarista.dto.GrinderConversionDTO;
import org.notabarista.entity.GrinderConversionEntity;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface GrinderConversionMapper {

    @Mapping(source = "createdAt", target = "createdAt")
    @Mapping(source = "modifiedAt", target = "modifiedAt")
    @Mapping(source = "createdBy", target = "createdBy")
    @Mapping(source = "modifiedBy", target = "modifiedBy")
    @Mapping(source = "version", target = "version")
    @Mapping(source = "grinderSizes", target = "grinderSizes")
    GrinderConversionDTO grinderConversionEntityToGrinderConversionDTO(GrinderConversionEntity grinderConversionEntity);

    @Mapping(source = "grinderSizes", target = "grinderSizes")
    GrinderConversionEntity grinderConversionDtoToGrinderConversionEntity(GrinderConversionDTO grinderConversionDTO);

    List<GrinderConversionDTO> grinderConversionsToGrinderConverterDTOs(List<GrinderConversionEntity> grinderConversionEntities);

    List<GrinderConversionEntity> grinderConversionDTOsToGrinderConversions(List<GrinderConversionDTO> grinderConversionDTOs);
}
