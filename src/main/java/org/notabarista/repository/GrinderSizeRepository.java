package org.notabarista.repository;

import org.notabarista.entity.GrinderSizeEntity;

import java.util.List;
import java.util.UUID;

public interface GrinderSizeRepository extends IAbstractRepository<GrinderSizeEntity> {

    List<GrinderSizeEntity> findByGrinder (UUID grinder);
    List<GrinderSizeEntity> findByGrinderAndGrindSize (UUID grinder, String grindSize);

}
