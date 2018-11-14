package org.cnam.architecturecnam.repository;

import org.cnam.architecturecnam.model.TransacModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacRepository extends JpaRepository<TransacModel,Long> {

}
