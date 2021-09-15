package com.smalaca.domain.trainingoffer;

import com.smalaca.domain.daterange.DateRange;

public class TrainingOffer {
    private TrainingOfferId trainingOfferId;
    private final DateRange dateRange;

    public TrainingOffer(DateRange dateRange) {
        this.dateRange = dateRange;
    }

    public void resign() {

    }
}
