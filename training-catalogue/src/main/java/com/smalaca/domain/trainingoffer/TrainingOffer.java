package com.smalaca.domain.trainingoffer;

import com.smalaca.domain.daterange.DateRange;
import com.smalaca.domain.events.registry.EventsRegistry;

public class TrainingOffer {
    private EventsRegistry eventsRegistry;

    private TrainingOfferId trainingOfferId;
    private final DateRange dateRange;

    public TrainingOffer(DateRange dateRange) {
        this.dateRange = dateRange;
    }

    public void resign() {
        // logic
    }

    public void accept() {
        if (isExpired()) {
            throw new ExpiredTrainingOfferException(trainingOfferId);
        }

        // logic

        eventsRegistry.publish(TrainingOfferAccepted.create(trainingOfferId));
    }

    private boolean isExpired() {
        // logic
        return false;
    }
}
