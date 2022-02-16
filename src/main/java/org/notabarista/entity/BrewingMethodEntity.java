package org.notabarista.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@ToString(exclude = {})
@EqualsAndHashCode(callSuper = false, exclude = {})
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

    @Column(name = "grind_specification")
    private String grindSpecification;

}
