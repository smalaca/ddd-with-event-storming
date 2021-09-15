package com.smalaca.application.training;

import com.smalaca.domain.daterange.DateRange;
import com.smalaca.domain.training.Training;
import com.smalaca.domain.training.TrainingRepository;
import com.smalaca.domain.trainingoffer.TrainingOffer;
import com.smalaca.domain.trainingoffer.TrainingOfferId;
import com.smalaca.domain.trainingoffer.TrainingOfferRepository;
import org.springframework.stereotype.Service;

@Service
public class TrainingApplicationService {
    private final TrainingRepository trainingRepository;
    private final TrainingOfferRepository trainingOfferRepository;

    public TrainingApplicationService(
            TrainingRepository trainingRepository, TrainingOfferRepository trainingOfferRepository) {
        this.trainingRepository = trainingRepository;
        this.trainingOfferRepository = trainingOfferRepository;
    }

    public TrainingOfferId choose(TrainingChoiceDto dto) {
        DateRange dateRange = DateRange.from(dto.getStartDate(), dto.getEndDate());
        Training training = trainingRepository.findBy(dto.getTrainingCode());

        TrainingOffer trainingOffer = training.choose(dateRange);

        return trainingOfferRepository.save(trainingOffer);
    }
}
