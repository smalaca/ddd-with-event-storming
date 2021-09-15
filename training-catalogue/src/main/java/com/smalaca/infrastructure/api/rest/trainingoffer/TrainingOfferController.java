package com.smalaca.infrastructure.api.rest.trainingoffer;

import com.smalaca.application.trainingoffer.TrainingOfferApplicationService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/training-offer")
public class TrainingOfferController {
    private final TrainingOfferApplicationService trainingOfferApplicationService;

    public TrainingOfferController(TrainingOfferApplicationService trainingOfferApplicationService) {
        this.trainingOfferApplicationService = trainingOfferApplicationService;
    }

    @PutMapping("/{trainingOfferNumber}/accept")
    public void accept(String trainingOfferNumber) {
        trainingOfferApplicationService.accept(trainingOfferNumber);
    }

    @PutMapping("/{trainingOfferNumber}/resign")
    public void resign(String trainingOfferNumber) {
        trainingOfferApplicationService.resign(trainingOfferNumber);
    }
}
