package com.smalaca.infrastructure.persistence.sql.training;

import com.smalaca.domain.training.Training;
import com.smalaca.domain.training.TrainingCode;
import com.smalaca.domain.training.TrainingRepository;
import com.smalaca.infrastructure.persistence.springdata.training.SpringDataTrainingRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SqlTrainingRepository implements TrainingRepository {
    private final SpringDataTrainingRepository repository;

    SqlTrainingRepository(SpringDataTrainingRepository repository) {
        this.repository = repository;
    }

    @Override
    public Training findBy(TrainingCode trainingCode) {
        return null;
    }
}
