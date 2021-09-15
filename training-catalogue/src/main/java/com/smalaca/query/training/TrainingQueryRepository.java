package com.smalaca.query.training;

import com.smalaca.domain.training.TrainingCode;
import com.smalaca.infrastructure.persistence.springdata.training.SpringDataTrainingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TrainingQueryRepository {
    private final SpringDataTrainingRepository repository;

    TrainingQueryRepository(SpringDataTrainingRepository repository) {
        this.repository = repository;
    }

    public List<TrainingDto> findBy(TrainingSearchCriteria criteria) {
        return null;
    }

    public TrainingDetailsDto findBy(TrainingCode trainingCode) {
        return null;
    }
}
