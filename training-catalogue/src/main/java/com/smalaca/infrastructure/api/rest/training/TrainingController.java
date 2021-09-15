package com.smalaca.infrastructure.api.rest.training;

import com.smalaca.application.training.TrainingApplicationService;
import com.smalaca.application.training.TrainingChoiceDto;
import com.smalaca.domain.training.TrainingCode;
import com.smalaca.domain.trainingoffer.TrainingOfferId;
import com.smalaca.query.training.TrainingDetailsDto;
import com.smalaca.query.training.TrainingDto;
import com.smalaca.query.training.TrainingQueryRepository;
import com.smalaca.query.training.TrainingSearchCriteria;
import com.smalaca.query.trainingoffer.TrainingOfferDto;
import com.smalaca.query.trainingoffer.TrainingOfferQueryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/training")
public class TrainingController {
    private final TrainingQueryRepository trainingQueryRepository;
    private final TrainingOfferQueryRepository trainingOfferQueryRepository;
    private final TrainingApplicationService trainingApplicationService;

    public TrainingController(
            TrainingQueryRepository trainingQueryRepository, TrainingOfferQueryRepository trainingOfferQueryRepository,
            TrainingApplicationService trainingApplicationService) {
        this.trainingQueryRepository = trainingQueryRepository;
        this.trainingOfferQueryRepository = trainingOfferQueryRepository;
        this.trainingApplicationService = trainingApplicationService;
    }

    @GetMapping
    public List<TrainingDto> findBy(@RequestBody TrainingSearchCriteria criteria) {
        return trainingQueryRepository.findBy(criteria);
    }

    @GetMapping("/{trainingCode}")
    public TrainingDetailsDto findBy(@PathVariable TrainingCode trainingCode) {
        return trainingQueryRepository.findBy(trainingCode);
    }

    @PutMapping
    public TrainingOfferDto choose(@PathVariable TrainingChoiceDto trainingChoiceDto) {
        TrainingOfferId trainingOfferId = trainingApplicationService.choose(trainingChoiceDto);
        return trainingOfferQueryRepository.findBy(trainingOfferId);
    }
}
