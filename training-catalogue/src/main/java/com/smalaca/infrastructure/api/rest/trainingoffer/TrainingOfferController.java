package com.smalaca.infrastructure.api.rest.trainingoffer;

import com.smalaca.application.trainingoffer.TrainingOfferApplicationService;
import com.smalaca.domain.trainingoffer.TrainingOfferId;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/training-offer")
public class TrainingOfferController {
    private final TrainingOfferApplicationService trainingOfferApplicationService;

    TrainingOfferController(TrainingOfferApplicationService trainingOfferApplicationService) {
        this.trainingOfferApplicationService = trainingOfferApplicationService;
    }

    @PutMapping("/{trainingOfferId}/accept")
    public void accept(TrainingOfferId trainingOfferId) {
        trainingOfferApplicationService.accept(trainingOfferId);
    }

    @PutMapping("/{trainingOfferId}/resign")
    public void resign(TrainingOfferId trainingOfferId) {
        trainingOfferApplicationService.resign(trainingOfferId);
    }
}
