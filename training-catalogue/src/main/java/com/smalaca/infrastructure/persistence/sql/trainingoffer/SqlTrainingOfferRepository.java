package com.smalaca.infrastructure.persistence.sql.trainingoffer;

import com.smalaca.domain.trainingoffer.TrainingOffer;
import com.smalaca.domain.trainingoffer.TrainingOfferId;
import com.smalaca.domain.trainingoffer.TrainingOfferRepository;
import com.smalaca.infrastructure.persistence.springdata.trainingoffer.SpringDataTrainingOfferRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SqlTrainingOfferRepository implements TrainingOfferRepository {
    private final SpringDataTrainingOfferRepository repository;

    SqlTrainingOfferRepository(SpringDataTrainingOfferRepository repository) {
        this.repository = repository;
    }

    @Override
    public TrainingOfferId save(TrainingOffer trainingOffer) {
        return null;
    }
}
