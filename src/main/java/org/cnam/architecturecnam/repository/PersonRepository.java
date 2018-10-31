package org.cnam.architecturecnam.repository;

import org.cnam.architecturecnam.model.PersonModel;
import org.cnam.architecturecnam.model.SampleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonModel,Long> {

}
