package com.smalaca.query.trainingoffer;

import com.smalaca.domain.trainingoffer.TrainingOfferId;
import com.smalaca.infrastructure.persistence.springdata.trainingoffer.SpringDataTrainingOfferRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TrainingOfferQueryRepository {
    private final SpringDataTrainingOfferRepository repository;

    TrainingOfferQueryRepository(SpringDataTrainingOfferRepository repository) {
        this.repository = repository;
    }

    public TrainingOfferDto findBy(TrainingOfferId trainingOfferId) {
        return null;
    }
}
