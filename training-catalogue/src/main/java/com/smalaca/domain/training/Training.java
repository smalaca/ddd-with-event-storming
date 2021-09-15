package com.smalaca.domain.training;

import com.smalaca.domain.daterange.DateRange;
import com.smalaca.domain.trainingoffer.TrainingOffer;

public class Training {
    private final TrainingCode trainingCode;

    public Training(TrainingCode trainingCode) {
        this.trainingCode = trainingCode;
    }

    public TrainingOffer choose(DateRange dateRange) {
        if (trainingProgrammeNotPublished()) {
            throw TrainingException.notPublishedProgramme(trainingCode);
        }

        if (isNotPlannedFor(dateRange)) {
            throw TrainingException.notPlannedFor(trainingCode, dateRange);
        }

        if (hasNoAvailablePlacesFor(dateRange)) {
            throw TrainingException.noAvailablePlacesFor(trainingCode, dateRange);
        }

        return new TrainingOffer(dateRange);
    }

    private boolean hasNoAvailablePlacesFor(DateRange dateRange) {
        return false;
    }

    private boolean isNotPlannedFor(DateRange dateRange) {
        return false;
    }

    private boolean trainingProgrammeNotPublished() {
        return false;
    }
}
