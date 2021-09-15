package com.smalaca.application.training;

import com.smalaca.domain.training.TrainingCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class TrainingChoiceDto {
    private final TrainingCode trainingCode;
    private final LocalDate startDate;
    private final LocalDate endDate;
}
