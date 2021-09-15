package com.smalaca.domain.training;

public interface TrainingRepository {
    Training findBy(TrainingCode trainingCode);
}
