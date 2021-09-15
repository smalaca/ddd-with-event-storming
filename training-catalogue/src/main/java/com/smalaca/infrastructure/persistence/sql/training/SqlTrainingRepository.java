package com.smalaca.infrastructure.persistence.sql.training;

import com.smalaca.domain.training.Training;
import com.smalaca.domain.training.TrainingCode;
import com.smalaca.domain.training.TrainingRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SqlTrainingRepository implements TrainingRepository {

    @Override
    public Training findBy(TrainingCode trainingCode) {
        return null;
    }
}
