package com.smalaca.application.trainingoffer;

import com.smalaca.domain.trainingoffer.TrainingOffer;
import com.smalaca.domain.trainingoffer.TrainingOfferId;
import com.smalaca.domain.trainingoffer.TrainingOfferRepository;
import org.springframework.stereotype.Service;

@Service
public class TrainingOfferApplicationService {
    private final TrainingOfferRepository trainingOfferRepository;

    TrainingOfferApplicationService(TrainingOfferRepository trainingOfferRepository) {
        this.trainingOfferRepository = trainingOfferRepository;
    }

    public void accept(TrainingOfferId trainingOfferId) {

    }

    public void resign(TrainingOfferId trainingOfferId) {
        TrainingOffer trainingOffer = trainingOfferRepository.findBy(trainingOfferId);

        trainingOffer.resign();

        trainingOfferRepository.save(trainingOffer);
    }
}
