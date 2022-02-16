package org.notabarista.repository;

import org.notabarista.entity.BrewingMethodEntity;

import java.util.Optional;

public interface BrewingMethodRepository extends IAbstractRepository<BrewingMethodEntity> {

    Optional<BrewingMethodEntity> findByBrewingMethod(String brewingMethod);

    Optional<BrewingMethodEntity> findByGrindSize(String grindSize);

    Optional<BrewingMethodEntity> findByGrindSpecification(String grindSpecification);

}
