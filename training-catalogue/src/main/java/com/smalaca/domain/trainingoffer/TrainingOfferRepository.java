package com.smalaca.domain.trainingoffer;

public interface TrainingOfferRepository {
    TrainingOfferId save(TrainingOffer trainingOffer);

    TrainingOffer findBy(TrainingOfferId trainingOfferId);
}
