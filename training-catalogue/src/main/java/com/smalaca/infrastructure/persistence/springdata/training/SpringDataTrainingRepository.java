package com.smalaca.infrastructure.persistence.springdata.training;

import com.smalaca.domain.training.Training;
import com.smalaca.domain.training.TrainingCode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataTrainingRepository extends CrudRepository<Training, TrainingCode> {
}
