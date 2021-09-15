package com.smalaca.infrastructure.api.rest.training;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/training")
public class TrainingController {

    public List<TrainingDto> findBy(TrainingSearchCriteria criteria) {
        return null;
    }

    public TrainingDetailsDto findBy(String trainingCode) {
        return null;
    }

    public TrainingOfferDto choose(TrainingDto training) {
        return null;
    }
}
