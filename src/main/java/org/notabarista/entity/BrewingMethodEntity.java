package org.notabarista.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@ToString(exclude = {"grinderConversions"})
@EqualsAndHashCode(callSuper = false, exclude = {"grinderConversions"})
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "brewing_methods")
public class BrewingMethodEntity extends AbstractAuditedEntity {

    @Column(name = "grind_size")
    private String grindSize;

    @Column(name = "brewing_method")
    private String brewingMethod;

    @ManyToMany(mappedBy = "grinderBrewingMethods", targetEntity = GrinderConversionEntity.class)
    @JsonIgnoreProperties
    private List<GrinderConversionEntity> grinderConversions;
}
