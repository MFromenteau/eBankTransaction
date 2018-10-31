package org.cnam.architecturecnam.repository;

import org.cnam.architecturecnam.model.SampleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<SampleModel,Long> {

}
