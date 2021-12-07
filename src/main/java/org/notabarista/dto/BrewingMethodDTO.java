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
@EqualsAndHashCode(callSuper = false, exclude = {"grinderConvertions"})
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BrewingMethodDTO {

    private UUID id;

    private String grindSize;
    private String brewingMethod;
    private List<GrinderConversionDTO> grinderConvertions;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private String createdBy;
    private String modifiedBy;
    private Integer version;

}
