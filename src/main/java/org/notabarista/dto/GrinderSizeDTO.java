package org.notabarista.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.notabarista.entity.GrinderConversionEntity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@ToString(exclude = {})
@EqualsAndHashCode(callSuper = false, exclude = {})
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GrinderSizeDTO {

    private UUID id;

    private UUID grinder;
    private String grindSize;
    private String clicksPerRound;

    private GrinderConversionDTO grinderConversion;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private String createdBy;
    private String modifiedBy;
    private Integer version;

}
