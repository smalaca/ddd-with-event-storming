package com.smalaca.domain.training;

import com.smalaca.domain.daterange.DateRange;

public class TrainingException extends RuntimeException {
    private final TrainingCode trainingCode;
    private DateRange dateRange;

    private TrainingException(String message, TrainingCode trainingCode) {
        super(message);
        this.trainingCode = trainingCode;
    }

    private TrainingException(String message, TrainingCode trainingCode, DateRange dateRange) {
        this(message, trainingCode);
        this.dateRange = dateRange;
    }

    static RuntimeException notPublishedProgramme(TrainingCode trainingCode) {
        return new TrainingException("not published programme", trainingCode);
    }

    static RuntimeException notPlannedFor(TrainingCode trainingCode, DateRange dateRange) {
        return new TrainingException("not planned", trainingCode, dateRange);
    }

    static RuntimeException noAvailablePlacesFor(TrainingCode trainingCode, DateRange dateRange) {
        return new TrainingException("no available places", trainingCode, dateRange);
    }
}
