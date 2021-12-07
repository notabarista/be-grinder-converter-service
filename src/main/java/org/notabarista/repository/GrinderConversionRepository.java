package org.notabarista.repository;

import org.notabarista.entity.GrinderConversionEntity;

import java.util.List;

public interface GrinderConversionRepository extends IAbstractRepository<GrinderConversionEntity> {

    List<GrinderConversionEntity> findByGrinder(String grinder);

}
