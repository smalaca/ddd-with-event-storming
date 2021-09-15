package com.smalaca.domain.trainingoffer;

class ExpiredTrainingOfferException extends RuntimeException {
    private final TrainingOfferId trainingOfferId;

    ExpiredTrainingOfferException(TrainingOfferId trainingOfferId) {
        this.trainingOfferId = trainingOfferId;
    }
}
