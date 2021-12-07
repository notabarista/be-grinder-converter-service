package org.notabarista.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString(exclude = {})
@EqualsAndHashCode(callSuper = false, exclude = {"grinderBrewingMethods"})
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GrinderConversionDTO {

    private UUID id;

    private String grinder;
    private String aboutGrinder;
    private String aboutGrinderMediaUrl;
    private String grindSize;
    private String grinderSetting;
    private List<BrewingMethodDTO> grinderBrewingMethods;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private String createdBy;
    private String modifiedBy;
    private Integer version;

}
